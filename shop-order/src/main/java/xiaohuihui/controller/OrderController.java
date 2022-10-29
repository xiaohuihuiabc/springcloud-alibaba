package xiaohuihui.controller;

import com.xiaohuihui.entity.Order;
import com.xiaohuihui.entity.Product;
import com.xiaohuihui.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xiaohuihui.feign.ProductFeign;
import xiaohuihui.service.Orderservice;

import java.util.List;
import java.util.Objects;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui.controller
 * @description
 * @date 2022/10/28 15:36
 * @Copyright
 * @link
 */
@RestController
@Slf4j
public class OrderController {
    @Value("${server.port}")
    private Integer port;

    @Autowired
    private Orderservice orderservice;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductFeign productFeign;

    @RequestMapping("/order/save/{pid}")
    public Order saveOrder(@PathVariable("pid") Integer pid) {
        log.info("create order by pid:{}", pid);
//        Product product = getProductByRestTemplate(pid); // 通过restTemplate调用
        Product product = productFeign.queryProductByPid(pid);// 通过feign调用
        if (Objects.isNull(product)) {
            log.info("can not query product by id:{}", pid);
            return null;
        }
        Order order = saveOrder(product);
        log.info("query queryByOid, result:{}", order);
        return order;
    }

    @RequestMapping("/order/get/{oid}")
    public Order getOrder(@PathVariable("oid") Integer oid) {
        Order order = orderservice.queryByOid(oid);
        if (Objects.isNull(order)) {
            log.info("can not query order by id:{}", oid);
            return null;
        }
        Product product = productFeign.queryProductByPid(order.getPid());
        order.setProduct(product);
        User user = new User();
        user.setUid(order.getUid());
        user.setUsername("测试用户");
        order.setUser(user);

        order.setPort(port);
        return order;
    }

    private Order saveOrder(Product product) {
        Order order = new Order();
        order.setUid(1);
        User user = new User();
        user.setUsername("测试用户");
        order.setUser(user);
        order.setNumber(1);

        order.setPid(product.getPid());
        order.setProduct(product);

        orderservice.save(order);

        order.setPort(port);
        return order;
    }

    private Product getProductByRestTemplate(Integer pid) {
        //        String url = getUrlByDiscoveryClient(pid);
        String url = getUrlByRibbon(pid);
        return restTemplate.getForObject(url, Product.class);
    }

    private String getUrlByRibbon(Integer pid) {
        return "http://product-service/product/" + pid;
    }

    private String getUrlByDiscoveryClient(Integer pid) {
        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        ServiceInstance serviceInstance = instances.get(0);
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        return "http://" + host + ":" + port + "/product/" + pid;
    }
}
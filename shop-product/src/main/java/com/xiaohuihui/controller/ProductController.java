package com.xiaohuihui.controller;

import com.xiaohuihui.entity.Product;
import com.xiaohuihui.service.Productservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class ProductController {
    @Value("${server.port}")
    private Integer port;
    @Autowired
    private Productservice productservice;

    @RequestMapping("/product/{pid}")
    public Product product(@PathVariable("pid") Integer pid) {
        log.info("query product by id:{}", pid);
        Product product = productservice.queryByPid(pid);
        log.info("query queryByPid, result:{}", product);
        product.setPort(port);
        return product;
    }
}
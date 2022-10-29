package com.xiaohuihui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui
 * @description
 * @date 2022/10/28 15:21
 * @Copyright
 * @link
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(ProductApplication.class, args);
    }
}
package com.xiaohuihui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package com.xiaohuihui
 * @description
 * @date 2022/10/28 21:56
 * @Copyright
 * @link
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
package com.xiaohuihui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
public class UserApplication {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(UserApplication.class, args);
    }
}
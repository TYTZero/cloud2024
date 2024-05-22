package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.time.ZonedDateTime;

/**
 * @version: v1.0
 * @Author: ZERO
 * @description:
 */
// @SpringBootApplication
// @EnableFeignClients(basePackages = "com.atguigu.cloud.apis")
// public class Main {
//     public static void main(String[] args) {
//         SpringApplication.run(Main.class, args);
//     }
// }

public class Main {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
    }
}

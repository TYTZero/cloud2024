package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version: v1.0
 * @Author: ZERO
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main81 {
    public static void main(String[] args) {
        SpringApplication.run(Main81.class, args);
    }
}

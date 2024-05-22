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
@EnableDiscoveryClient  // 网关也是需要进行服务注册 和 发现
public class Main9527 {
    public static void main(String[] args) {
        SpringApplication.run(Main9527.class, args);
    }

}
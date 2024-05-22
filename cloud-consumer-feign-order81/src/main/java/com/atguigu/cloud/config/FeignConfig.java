package com.atguigu.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version: v1.0
 * @Author: ZERO
 * @description:
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer myRetryer() {
        return Retryer.NEVER_RETRY; // Feign默认配置是不走重试策略的
        // 最大请求次数为3(1+2),初始间隔附间为160ms,重试间最大间隔附间机1s
        // return new Retryer.Default(100, 1, 3);
    }

    @Bean
    Logger.Level feignLoggerLeveL() {
        return Logger.Level.FULL;
    }
}

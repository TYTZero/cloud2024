package com.atguigu.cloud.service;

import org.springframework.stereotype.Service;

/**
 * @author TYT
 * @version v1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
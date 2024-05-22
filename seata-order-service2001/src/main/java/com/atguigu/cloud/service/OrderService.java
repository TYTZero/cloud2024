package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @author TYT
 * @version v1.0
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}



package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @description:
 * @param: null
 * @return:
 * @author liuzhl
 * @date: 2025/5/19 22:55
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}
package com.atguigu.cloud.service;

/**
 * @description:
 * @param: null
 * @return:
 * @author liuzhl
 * @date: 2025/5/19 23:05
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
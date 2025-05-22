package com.atguigu.cloud.mapper;

import com.atguigu.cloud.entities.Storage;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import tk.mybatis.mapper.common.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @param: null
 * @return:
 * @author liuzhl
 * @date: 2025/5/19 23:08
 */
public interface StorageMapper extends Mapper<Storage>
{
    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);



}
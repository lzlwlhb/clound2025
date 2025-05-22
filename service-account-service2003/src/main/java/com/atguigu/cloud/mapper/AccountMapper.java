package com.atguigu.cloud.mapper;

import com.atguigu.cloud.entities.Account;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/** 
 * @description:  
 * @param: null 
 * @return:  
 * @author liuzhl
 * @date: 2025/5/19 23:18
 */ 
public interface AccountMapper extends Mapper<Account>
{

    /**
     * @param userId
     * @param money 本次消费金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}
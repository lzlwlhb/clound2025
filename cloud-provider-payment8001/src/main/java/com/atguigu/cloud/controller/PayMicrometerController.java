package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @param: null
 * @return:
 * @author liuzhl
 * @date: 2025/5/6 22:15
 */
@RestController
public class PayMicrometerController
{
    /**
     * Micrometer(Sleuth)进行链路监控的例子
     * @param id
     * @return
     */

    @GetMapping(value = "/pay/micrometer/{id}")
    public String myMicrometer(@PathVariable("id") Integer id)
    {
        return "Hello, 欢迎到来myMicrometer inputId:  "+id+" \t    服务返回:" + IdUtil.simpleUUID();
    }
}



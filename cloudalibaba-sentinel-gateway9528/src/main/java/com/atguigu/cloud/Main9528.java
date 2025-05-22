package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @param: null
 * @return:
 * @author liuzhl
 * @date: 2025/5/17 23:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9528
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main9528.class,args);
    }
}


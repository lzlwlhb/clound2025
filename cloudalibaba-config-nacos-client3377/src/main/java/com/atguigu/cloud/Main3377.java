package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @param: null
 * @return:
 * @author liuzhl
 * @date: 2025/5/13 23:04
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Main3377
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main3377.class,args);
    }
}
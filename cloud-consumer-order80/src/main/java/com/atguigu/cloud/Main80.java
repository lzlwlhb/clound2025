package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @description: cloud-consumer-order80主启动类 
 * @param: null 
 * @return:  
 * @author liuzhl
 * @date: 2025/4/12 14:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main80 {
    public static void main(String[] args) {
        SpringApplication.run(Main80.class, args);
    }
}
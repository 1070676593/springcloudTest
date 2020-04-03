package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @CalssName: Consumer_80
 * @Author: zsx
 * @Date: 2020/3/31 15:57
 **/
@EnableFeignClients(value = "com.service")
@EnableEurekaClient //向服务注册中心进行注册
@SpringBootApplication
public class Consumer_80_feign {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_80_feign.class,args);
    }
}

package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @CalssName: Consumer_80
 * @Author: zsx
 * @Date: 2020/3/31 15:57
 **/
@EnableEurekaClient //向服务注册中心进行注册
@SpringBootApplication
public class Consumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_80.class,args);
    }
}

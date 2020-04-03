package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @CalssName: Serve_8001
 * @Author: zsx
 * @Date: 2020/3/31 15:36
 **/
@EnableHystrix
@EnableEurekaClient
@MapperScan("com.mapper")
@SpringBootApplication
public class Serve_8003 {
    public static void main(String[] args) {
        SpringApplication.run(Serve_8003.class, args);
    }
}

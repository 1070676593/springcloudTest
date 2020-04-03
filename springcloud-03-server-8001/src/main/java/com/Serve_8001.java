package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @CalssName: Serve_8001
 * @Author: zsx
 * @Date: 2020/3/31 15:36
 **/
@EnableEurekaClient
@MapperScan("com.mapper")
@SpringBootApplication
public class Serve_8001 {
    public static void main(String[] args) {
        SpringApplication.run(Serve_8001.class, args);
    }
}

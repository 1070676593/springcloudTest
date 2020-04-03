package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @CalssName: Eureka_6001
 * @Author: zsx
 * @Date: 2020/3/31 16:35
 **/
@EnableEurekaServer
@SpringBootApplication
public class Eureka_6001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_6001.class,args);
    }
}

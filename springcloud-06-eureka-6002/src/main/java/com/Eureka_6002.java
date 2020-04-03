package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @CalssName: Eureka_6002
 * @Author: zsx
 * @Date: 2020/3/31 16:58
 **/
@EnableEurekaServer
@SpringBootApplication
public class Eureka_6002 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_6002.class,args);
    }
}

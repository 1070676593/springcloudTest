package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @CalssName: EurekaServer_config_6001
 * @Author: zsx
 * @Date: 2020/4/2 13:58
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_config_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_config_6001.class,args);
    }
}

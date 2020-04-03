package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @CalssName: ConfigServer_5001
 * @Author: zsx
 * @Date: 2020/4/2 10:52
 **/
@EnableConfigServer
@SpringBootApplication
public class ConfigServer_5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class,args);
    }
}

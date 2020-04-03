package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @CalssName: server_8002
 * @Author: zsx
 * @Date: 2020/4/1 10:19
 **/
@EnableEurekaClient
@MapperScan("com.mapper")
@SpringBootApplication
public class server_8002 {
    public static void main(String[] args) {

        SpringApplication.run(server_8002.class,args);
    }
}

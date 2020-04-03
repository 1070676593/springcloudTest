package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @CalssName: server_zuul
 * @Author: zsx
 * @Date: 2020/4/1 17:02
 **/
@EnableZuulProxy //开启zuul的功能
@SpringBootApplication
public class server_zuul {
    public static void main(String[] args) {
        SpringApplication.run(server_zuul.class,args);
    }
}

package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @CalssName: dashboard_9001
 * @Author: zsx
 * @Date: 2020/4/1 15:01
 **/
@EnableHystrixDashboard
@SpringBootApplication
public class dashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(dashboard_9001.class,args);
    }
}

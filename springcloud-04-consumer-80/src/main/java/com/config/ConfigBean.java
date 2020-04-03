package com.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @CalssName: ConfigBean
 * @Author: zsx
 * @Date: 2020/3/31 16:02
 **/
@Configuration //标识配置类
public class ConfigBean {

    // 服务名称就是被调用的那个yml配置中的服务名称spring.application.name
    @LoadBalanced   //开启负载均衡
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

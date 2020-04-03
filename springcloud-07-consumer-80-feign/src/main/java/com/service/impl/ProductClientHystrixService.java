package com.service.impl;

import com.entity.Product;
import com.service.ProductClientService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @CalssName: ProductClientHystrixService
 * @Author: zsx
 * @Date: 2020/4/1 14:37
 **/
//hystrix熔断器
@Component
public class ProductClientHystrixService implements ProductClientService {
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id=" + id + "无数据--@feignclient&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}

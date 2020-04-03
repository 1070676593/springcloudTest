package com.service;

import com.entity.Product;
import com.service.impl.ProductClientHystrixService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @CalssName: ProductClientService
 * @Author: zsx
 * @Date: 2020/4/1 10:31
 **/
//开启hystrix熔断 fallback    下面服务有问题时才会调用熔断方法
@FeignClient(value = "server-03-8001",fallback = ProductClientHystrixService.class)
public interface ProductClientService {

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    boolean add(@RequestBody Product product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();

}

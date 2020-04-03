package com.controller;

import com.entity.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 梦学谷
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @HystrixCommand(fallbackMethod = "getNewAdd")
    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    public boolean getNewAdd(@RequestBody Product product){
        return false;
    }

    @HystrixCommand(fallbackMethod = "getNew")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        System.out.println(0/0);
        return productService.getById(id);
    }

    public Product getNew(@PathVariable("id") Long id) {
        return new Product(id, "ID=" + id +"无效----@HystrixCommand",
                "无法找到对应数据库");
    }

    @HystrixCommand(fallbackMethod = "newList")
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.findAll();
    }

    public List<Product> newList() {
        Product pro = new Product(111L, "ID=111无效----@HystrixCommand",
                "无法找到对应数据库");
        List<Product> lsit = new ArrayList<>();
        lsit.add(pro);
        return lsit;
    }




}

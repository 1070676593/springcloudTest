package com.controller;

import com.entity.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.getById(id);
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.findAll();
    }

}

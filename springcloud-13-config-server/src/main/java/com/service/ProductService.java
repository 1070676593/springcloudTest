package com.service;

import com.entity.Product;

import java.util.List;

/**
 * @CalssName: ProductService
 * @Author: zsx
 * @Date: 2020/3/31 15:29
 **/
public interface ProductService {

    Product getById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);

}

package com.mapper;

import com.entity.Product;

import java.util.List;

/**
 * @CalssName: ProductMapper
 * @Author: zsx
 * @Date: 2020/3/31 15:32
 **/
public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}

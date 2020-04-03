package com.service.impl;

import com.entity.Product;
import com.mapper.ProductMapper;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @CalssName: ProductServiceImpl
 * @Author: zsx
 * @Date: 2020/3/31 15:31
 **/
@Service //一定不要少了
public class ProductServiceImpl implements ProductService
{
    @Autowired
    ProductMapper productMapper;

    @Override
    public Product getById(Long pid) {
        return productMapper.findById(pid);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public boolean addProduct(Product product) {
        return productMapper.addProduct(product);
    }
}

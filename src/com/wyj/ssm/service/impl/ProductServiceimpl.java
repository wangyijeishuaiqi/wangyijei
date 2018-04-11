package com.wyj.ssm.service.impl;

import com.wyj.ssm.mapper.ProductMapper;
import com.wyj.ssm.pojo.Product;
import com.wyj.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/7.
 */
@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> productfind(Map<String, Object> map) {
        return productMapper.productfind(map);
    }

    @Override
    public int ProductCount() {
        return productMapper.ProductCount();
    }

    @Override
    public int delproduct(int id) {
        return productMapper.delproduct(id);
    }

    @Override
    public int addproduct(Product product) {
        return productMapper.addproduct(product);
    }

    @Override
    public int updateproduct(Product product) {
        return productMapper.updateproduct(product);
    }

    @Override
    public Product productbyid(int id) {
        return productMapper.productbyid(id);
    }
}

package com.wyj.ssm.mapper;

import com.wyj.ssm.pojo.Product;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/7.
 */
public interface ProductMapper {

    List<Product> productfind(Map<String, Object> map);

    int ProductCount();

    int delproduct(int id);

    int addproduct(Product product);

    int updateproduct(Product product);

    Product productbyid(int id);
}

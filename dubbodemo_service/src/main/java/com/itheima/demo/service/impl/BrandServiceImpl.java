package com.itheima.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.demo.pojo.Brand;
import com.itheima.demo.service.BrandService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crowndint on 2018/10/13.
 */
@Service
public class BrandServiceImpl implements BrandService {

    private List<Brand> brands = new ArrayList();

    {
        brands.add(new Brand(1l, "冈本", "冈本套子"));
        brands.add(new Brand(2l, "杜蕾斯", "杜蕾斯套子"));
        brands.add(new Brand(3l, "杰士邦", "杰士邦套子"));
    }

    @Override
    public List<Brand> findAll() {
        return brands;
    }
}

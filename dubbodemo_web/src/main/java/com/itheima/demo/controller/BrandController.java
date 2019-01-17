package com.itheima.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.demo.service.BrandService;
import com.itheima.demo.pojo.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by crowndint on 2018/10/13.
 */
@RestController
//@Controller
@RequestMapping("brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("findAll")
    //@ResponseBody
    public List<Brand> findAll() {

        return brandService.findAll();
    }


}

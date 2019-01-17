package com.itheima.demo.pojo;

import java.io.Serializable;

/**
 * Created by crowndint on 2018/10/13.
 */
public class Brand implements Serializable {

    private Long id;
    private String name;
    private String desc;

    public Brand() {
    }

    public Brand(Long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

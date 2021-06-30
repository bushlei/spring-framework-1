package com.zero.st005;

/**
 * @description: 测试A类
 * @author: 曹长荣
 * @create: 2021-06-30 22:03
 **/
public class TestA {
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

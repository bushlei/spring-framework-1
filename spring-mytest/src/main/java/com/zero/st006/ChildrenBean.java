package com.zero.st006;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @description: 子类
 * @author: 曹长荣
 * @create: 2021-07-10 10:14
 **/
public class ChildrenBean implements BeanNameAware {
    private String name;

    private String age;

    private String gender;

    private Double height;

    private String beanName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ChildrenBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public String getBeanName() {
        return beanName;
    }
}

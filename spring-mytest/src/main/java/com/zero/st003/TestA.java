package com.zero.st003;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @description: 测试A类
 * @author: 曹长荣
 * @create: 2021-05-16 19:52
 **/
public class TestA implements ApplicationContextAware, EnvironmentAware {
    private String name;

    private ApplicationContext applicationContext;

    private Environment environment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void init() {
        System.out.println("执行bean的初始化方法：init");
//        System.out.println(this.getName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this.getName());
        System.out.println(applicationContext);
        this.applicationContext = applicationContext;
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(this.getName());
        System.out.println(environment);
        this.environment = environment;
    }
}

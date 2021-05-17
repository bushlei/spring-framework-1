package com.zero.st003;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @description: 测试BeanPostProcessor
 * @author: 曹长荣
 * @create: 2021-05-16 23:17
 **/
public class TestBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("a")) {
            TestA testA = (TestA) bean;

            System.out.println(testA.getName());
            System.out.println("BeanPostProcessor.postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("a")) {
            System.out.println("BeanPostProcessor.postProcessAfterInitialization");
        }
        return bean;
    }
}

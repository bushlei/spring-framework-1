package com.zero.st003;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @description: 测试BeanFactoryPostProcessor
 * @author: 曹长荣
 * @create: 2021-05-16 19:33
 **/
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("a");
        beanDefinition.setDescription("I am TestA");
        System.out.println("设置BeanDefinition");
    }
}

package com.zero.st005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 入口
 * @author: 曹长荣
 * @create: 2021-06-30 22:02
 **/
public class St005Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("st005.xml");
        TestA testA = applicationContext.getBean(TestA.class);
        System.out.println(testA.toString());
        TestB testB = applicationContext.getBean(TestB.class);
        System.out.println(testB.toString());
    }
}

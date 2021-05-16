package com.zero.st003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: main
 * @author: 曹长荣
 * @create: 2021-05-16 19:37
 **/
public class St003Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("st003.xml");
//        TestA bean = applicationContext.getBean(TestA.class);
//        System.out.println(bean);
//        System.out.println(bean.getApplicationContext());
//        System.out.println(bean.getEnvironment());
    }
}

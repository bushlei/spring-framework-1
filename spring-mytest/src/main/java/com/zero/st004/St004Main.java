package com.zero.st004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 入口
 * @author: 曹长荣
 * @create: 2021-06-03 21:13
 **/
public class St004Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("st004-${usernam:zero-${username}}.xml");
        TestA testA = applicationContext.getBean(TestA.class);
        System.out.println(testA);
    }
}

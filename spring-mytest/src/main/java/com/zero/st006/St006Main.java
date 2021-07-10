package com.zero.st006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 入口
 * @author: 曹长荣
 * @create: 2021-07-10 10:13
 **/
public class St006Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("st006.xml");
        ChildrenBean childrenBeanA = applicationContext.getBean("childrenBeanA", ChildrenBean.class);
        System.out.println(childrenBeanA);
        ChildrenBean childrenBeanB = applicationContext.getBean("childrenBeanB", ChildrenBean.class);
        System.out.println(childrenBeanB);
    }
}

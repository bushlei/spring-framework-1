package com.zero.st002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by caocr@633592 on 2020/12/15 18:21
 */
public class Main {

	public static void main(String[] args){

		ApplicationContext ac =new AnnotationConfigApplicationContext(JavaConfig.class);
//		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext();
//		ac.register(com.zero.st002.JavaConfig.class);
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());
	}

}

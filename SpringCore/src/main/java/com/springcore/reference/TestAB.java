package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAB {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/reference/config.xml");
		A a=(A) context.getBean("aref");
		B b=(B) context.getBean("bref");
		System.out.println(a);
	}

}

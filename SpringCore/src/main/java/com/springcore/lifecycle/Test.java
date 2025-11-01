package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		PepsiInterface p1=(PepsiInterface)context.getBean("p1");
		
		System.out.println(p1);
		System.out.println("++++++++++++++++++++++++");
		ExampleAnnotation  ex =(ExampleAnnotation)context.getBean("ex");
		System.out.println(ex);
	}
}

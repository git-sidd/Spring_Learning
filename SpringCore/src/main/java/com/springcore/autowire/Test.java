package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");
		Emp emp=(Emp)context.getBean("emp1");
		Address add=(Address)context.getBean("address");
		System.out.println(emp);
		System.out.println(add);
	}

}

	package com.springcore.collections;
	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class Test {
		public static void main(String[] args) {
			System.out.println("Hello World");
			ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/collections/config.xml"
					+ "");
			Emp emp1=(Emp) context.getBean("emp1");
			System.out.println(emp1);
		}
	}

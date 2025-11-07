package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	@Bean
	public Student firststudent() {
		Student student=new Student();
		return student;
	}
	
}

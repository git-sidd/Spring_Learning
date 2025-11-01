package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleAnnotation {
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public ExampleAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExampleAnnotation [Subject=" + Subject + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Init()");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy()");
	}
}

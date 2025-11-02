package com.springcore.standalone.collections;

import java.util.List;

public class Person {
	private List<String>frnd;

	public List<String> getFrnd() {
		return frnd;
	}

	public void setFrnd(List<String> frnd) {
		this.frnd = frnd;
	}

	@Override
	public String toString() {
		return "Person [frnd=" + frnd + "]";
	}
	
}

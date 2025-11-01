package com.springcore.autowire;

public class Address {
	private String district;

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Address [district=" + district + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

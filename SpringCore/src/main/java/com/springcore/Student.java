package com.springcore;

public class Student {
	private String studentName;
	private int studentAge;
	private  String studentAddress;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(String studentName, int studentAge, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAge=" + studentAge + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
	
}

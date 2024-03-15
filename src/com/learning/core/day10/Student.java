package com.learning.core.day10;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int rollno;
	private String name;
	private int age;
	private String address;
	
	public Student() {
		super();
	}
	
	public Student(int rollno, String name, int age, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	

}
class CustomException extends Exception {

    public CustomException(String message) {

        super(message);

    }
}


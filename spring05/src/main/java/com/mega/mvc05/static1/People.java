package com.mega.mvc05.static1;

public class People {

	String name;
	String gender; 
	int age;
	
	static int count;
	static int total;
	
	public People(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		total += age;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}

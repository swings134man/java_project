package com.mega.mvc07.alone;

public class Girl {
	
	private String name;
	private int age;
	
	static int sum;
	static int total;
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
		sum += age;
		total++;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + "]";
	}
	
	
	
}//class

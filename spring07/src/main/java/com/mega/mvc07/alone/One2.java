package com.mega.mvc07.alone;

public class One2 {

	static One2 object;
	static int count;
	
	private One2() {
		System.out.println("One2 객체가 생성됨.");
		count++;
	}
	
	public static One2 getInstance() {
		if (object == null) {
			 object = new One2();
		}else {
			System.out.println("이미 객체가 생성됭었음.");
		}
		return object;
	}
	
	
}

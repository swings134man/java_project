package com.mega.mvc07.alone;

public class Boy2 {
	
	static int count;
	static Boy2 human;
	
	private Boy2() {
		System.out.println("객체 생성됨.");
		count++;
	}
	
	public static Boy2 getInstance() {
		if (human == null) {
			human = new Boy2();
		}else {
			System.out.println("객체가 이미 생성되어 있음.");
		}
		return human;
	}
	
	
	

}

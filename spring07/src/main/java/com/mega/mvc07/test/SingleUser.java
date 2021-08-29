package com.mega.mvc07.test;

public class SingleUser {

	public static void main(String[] args) {

		
		for (int i = 0; i < 100; i++) {
			SingleObject single1 = new SingleObject();
		}
		System.out.println(SingleObject.count + "개");
		System.out.println(SingleObject.count * 8 +4 );
		
		
	}

}

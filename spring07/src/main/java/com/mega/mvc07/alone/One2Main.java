package com.mega.mvc07.alone;

public class One2Main {

	public static void main(String[] args) {

		System.out.println(One2.object);
		
		One2 o1 = One2.getInstance();
		System.out.println(o1.count + "개");
		One2 o2 = One2.getInstance();
		System.out.println(o2.count + "개");
		
		System.out.println(o1);
		System.out.println(o2);
		
	}
}

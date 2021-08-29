package com.mega.mvc07.alone;

public class BoyMain1 {

	public static void main(String[] args) {

		System.out.println("객체 수 : " + Boy1.count);
		
		Boy1 boy1 = new Boy1();
		System.out.println("객체 수 : " + Boy1.count);
		System.out.println(boy1);

		Boy1 boy2 = new Boy1();
		System.out.println("객체 수 : " + Boy1.count);
		System.out.println(boy2);
		
		Boy1 boy3 = new Boy1();
		System.out.println("객체 수 : " + Boy1.count);
		System.out.println(boy3);
	}

}

package com.mega.mvc07.alone;

public class BoyMain2 {

	public static void main(String[] args) {

		System.out.println(Boy2.human);
		Boy2 boy21 = Boy2.getInstance();
		System.out.println(boy21);
		System.out.println("객체 수 : " + Boy2.count);
		
		System.out.println();
		
		Boy2 boy22 = Boy2.getInstance();
		System.out.println(boy22);
		System.out.println("객체 수 : " + Boy2.count);
	} //main
}// class

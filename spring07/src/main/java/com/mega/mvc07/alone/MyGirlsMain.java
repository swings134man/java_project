package com.mega.mvc07.alone;

public class MyGirlsMain {

	public static void main(String[] args) {
		
		Girl girl1 = new Girl("길순",13);
		Girl girl2 = new Girl("길자",10);
		
		System.out.println("소녀들의 나이  : " + Girl.sum);
		System.out.println("소녀들의 수  : " + Girl.total);
		System.out.println("소녀들의 나이 평균 : " + Girl.sum/Girl.total);
		System.out.println(girl1);
		System.out.println(girl2);
	} //main
} //class

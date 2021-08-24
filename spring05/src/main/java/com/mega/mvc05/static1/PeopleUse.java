package com.mega.mvc05.static1;

public class PeopleUse {

	public static void main(String[] args) {

		
		People p1 = new People("홍길동","남",25);
		System.out.println(People.count);
		People p2 = new People("김길동","여",28);
		System.out.println(People.count);
		People p3 = new People("송길동","남",23);
		System.out.println(People.count);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("직원수는 : " + People.count);
		System.out.println("나이 평균 : " + People.total/People.count);
		
	}//main
}//class

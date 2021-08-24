package com.mega.mvc05.static1;

public class DayUse {

	public static void main(String[] args) {

		Day day1 = new Day("자바공부",10 , "강남");	 // day1은 클래스의 인스턴스 
		Day day2 = new Day("여행",15 , "강원도");	 // 클래스에서는 멤버변수, 들어간 값은 인스턴스 변수. 
		Day day3 = new Day("운동",11 , "피트니스");	 // 멤버변수를 인스턴스 변수로 혼용해서 사용. 
												 // 멤버메서드는 2종류
												 // 클래스 메서드 : 객체생성x, 클래스이름으로 호출 가능(static)
												 // 인스턴스 메서드 : 객체를 생성해야 호출가능. 
		System.out.println(Day.count);
		System.out.println(Day.count);
		System.out.println(Day.count);
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(Day.total + "시간");
		System.out.println(Day.getAvg()); //static 메서드. 
//		System.out.println(Day.total/Day.count + "시간");
		
	}//main
}//class

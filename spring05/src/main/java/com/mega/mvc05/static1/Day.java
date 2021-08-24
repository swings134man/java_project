package com.mega.mvc05.static1;

public class Day {

	// 멤버변수, 전역변수, 자동 초기화 
	String doing; 	//null
	int time;		//0
	String location;//null
	
	static int count;
	static int total; 
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		total += time;
	}//constructor 

	//static 메서드는객체 생성하지 않아도 아무때나 클래스이름으로 
	// 접근해서 그 기능을 처리하게 할 수 있다.
	// 자주쓰는 기능은 static 메서드로 만들어 놓으면 아무때나 쓸 수 있어서 편하다. 
	public static int getAvg() {
		// static 메서드 안에는 static변수만 사용가능! instance 변수 사용불가능 
		// instance 변수는 객체 생성후 접근이 가능하기 때문.
		// static 메서드는 객체 생성 하지않아도 접근해서 처리를 해야함. 
		// return doing; <-- 이게 안되는것임 . doing은 인스턴스변수이기때문.
		return total/count;
	}
	
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
}//class 

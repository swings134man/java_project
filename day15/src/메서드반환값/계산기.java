package 메서드반환값;

public class 계산기 {
	
	//성질 : 멤버변수
	//동작 : 멤버메서드(*) 
	//cal.add(100,200)
	// 기능정의, 함수정의, 메서드 
	// x,y는 지역변수, add안에서만 사용 가능 
	// 메서드 사용(호출, call,콜)
	// 메서드 안에서 값을 전달할 목적으로 생성되는 변수
	// 매개변수(parameter(파라메터)) , 아래에서는 2개.  함수안에서 입력값을 받을용도로 잠깐 사용하는것임. 
	
	//호출할떄 x가 생기는 전역변수 그러니까 탁상용화분창업에서 2번 만들어 졌다가 사라짐. 
	//void : 없다라는 의미, 반환값이 없다.
	 
	public int add(int x, int y) {
		int result = x + y;
		System.out.println("두수의 합은 " + result);
		return result; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class

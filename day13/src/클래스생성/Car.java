package 클래스생성;

public class Car {
	//전역변수 (global, 글로벌변수) : class바로 밑에 사용하면 클래스 전체에서 사용가능 . 
	// 성질 => 변수로 만든다. 멤버 변수 
	// 색(color), 바퀴수(count) 
	public String color;	//자동 초기화 null		String color = null; 이렇게 되고있는거.
	public int count; // 자동초기화 0 
 	
	// 동작 : => 멤버 메서드 
	public void run() { // 메서드
		//함수의 기능을 정의 
		//() 안에는실행할떄 입력값이 필요하면 입력값을 넣는다
		System.out.println("네 바퀴로 달리자.");
	}
	
	public void up() {
		System.out.println("속도를 20씩 빨리진다.");
		
	}
	
	
	
	
	
	
}

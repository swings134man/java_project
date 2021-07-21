package 생성자;

public class 마스크 {

	//속성 => 멤버변수
	//색,가격
	//자동초기화
	String color; //참조형변수는 null
	int price; 	// 기본형변수는 0
	
	//객체 생성시 클래스이름과 동일한 것이 있으면
	//자동 호출된다
	//객체생성시 넣어주어야 하는 처음값을 넣어주기위해서 사용.
	//생성자메서드 => 생성자 
	
	//클래스 이름과 동일한 메서드를 생성자라고 부르고
	//파라메터 없는 생성자는 기본생성자 
	//기본생성자는 자동으로 만들어진다.
	// 묵시적으로 생성된다. 

	public 마스크(String c, int p) {
		//객체생성할떄마다 무엇을 하고 싶은 경우
		//클래스이름과 동일한 이름을 가진
		//메소드를 만들어주면 자동호출되어 
		//객체생성할때마다 특정한 기능을 처리하게 할 수있다. 
		color = c;
		price = p;
	}
	
	//동작 => 멤버메서드
	public void cover() {
		System.out.println("마스크쓰다.");
	}
	
	public String toString() {
		return color + " " + price;
	}
	
}

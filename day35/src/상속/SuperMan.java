package 상속;

public class SuperMan extends Man{
	// 멤버변수 3개
	// 멤버메서드 3개
	
	// 다른 생성자가 하나도 없으면 기본생성자가 자동으로 만들어진다.
	
	boolean fly;
	
	public void space() {
		System.out.println("우주를 날아다니다.");
	}
	@Override 	// 부모클래스로 부터 받은 메서드를 덮어 써버림. 
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

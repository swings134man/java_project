package 상속;

//Person 클래스를 확장해서(상속, 재사용) Man클래스를 정의하겠다. 
//			Man extends Person 
public class Man extends Person{
	//멤버변수2개
	//멤버메서드2개
	int power;
	
	//생성자가 하나도 정의되어 있지않으면, 기본생성자가 자동으로 만들어진다. 
	// public Man() {} 이 기본으로 생성되어있음. 눈에보이지않음. 
	
	public void run() {
		System.out.println("빨리달리다.");
	}

	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}

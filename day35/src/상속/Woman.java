package 상속;

public class Woman extends Person {

	String power;
	
	public void jump() {
		System.out.println("높게 점프하다.");
	}

	@Override
	public String toString() {
		return "Woman [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

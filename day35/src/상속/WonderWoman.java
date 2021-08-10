package 상속;

public class WonderWoman extends Woman{

	boolean fly;
	
	public void location() {
		System.out.println("미국에 거주중.");
	}

	@Override
	public String toString() {
		return "WonderWoman [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
}

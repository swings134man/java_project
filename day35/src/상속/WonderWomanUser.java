package 상속;

public class WonderWomanUser {

	public static void main(String[] args) {

		WonderWoman wo1 = new WonderWoman();
		wo1.age = 150;
		wo1.fly = false;
		wo1.name = "jane";
		wo1.power = "strong";
		
		System.out.println(wo1);
		wo1.jump();
		wo1.think();
		wo1.location();
		wo1.tool();
		
		
		
	}

}

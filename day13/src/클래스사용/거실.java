package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {

		
		Phone phone1 = new Phone();
		
		phone1.color = "black";
		phone1.name = "iphone";
	
		System.out.println(phone1.color);
		System.out.println(phone1.name);
		
		phone1.sound();
		phone1.vibe();
		
		System.out.println();
		
		Dog dog1 = new Dog();
		dog1.name = "봄";
		dog1.age = 1; 
		
		System.out.println("강아지의 이름은 " + dog1.name + "이고 나이는 " + dog1.age + "살");
		
		dog1.eat();
		dog1.bark();
		
		
		
		
	}

}

package 클래스사용;

import javax.xml.transform.Templates;

import 클래스생성.AirCondition;
import 클래스생성.Dog;
import 클래스생성.Phone;
import 클래스생성.Tv;

public class 거실 {

	public static void main(String[] args) {

//		
//		Phone phone1 = new Phone();
//		
//		phone1.color = "black";
//		phone1.name = "iphone";
//	
//		System.out.println(phone1.color);
//		System.out.println(phone1.name);
//		
//		phone1.sound();
//		phone1.vibe();
//		
//		System.out.println();
//		
//		Dog dog1 = new Dog();
//		dog1.name = "봄";
//		dog1.age = 1; 
//		
//		System.out.println("강아지의 이름은 " + dog1.name + "이고 나이는 " + dog1.age + "살");
//		
//		dog1.eat();
//		dog1.bark();
//		System.out.println();
		// ------------------------------ day14 ---------------------------------
		
		Tv myTv = new Tv();
		// new 를 하면, 멤버변수들이 heap 영역에 복사된다.
		//myTv 참조형 변수에는 멤버변수들이 복사된 heap 영역의 주소가 들어간다. 
		// new->> 멤버변수 3개가 Tv클래스에 복사됨 :: 주소가 myTv 안에 들어가있음
		myTv.ch = 7;
		// myTv안에 들어있는 주소가 가르키는 ch 변수에 7을 넣어라는 의미. 
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println("myTv의 채널은 " + myTv.ch);
		System.out.println("myTv의 볼륨은 " + myTv.vol);
		System.out.println("myTv의 전원은 " + myTv.onOff);
//		myTv.onOff = false; // 꺼진다. 
		System.out.println(myTv);
		// 위의 코드의 결과에서 주소는 숫자고 그전에 위치는 ToString 이라는 부품이 만들어줌. 
		
		
		System.out.println();
		
		
		Tv yourTv = new Tv();
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		System.out.println("youtTv의 채널은 " + yourTv.ch);
		System.out.println("yourTv의 볼륨은 " + yourTv.vol);
		System.out.println("yourTv의 전원은 " + yourTv.onOff);
		
		System.out.println();
		
		AirCondition myAir = new AirCondition();
		myAir.onOff =true;
		myAir.UpDown = true; 
		myAir.temp = 18; 
		myAir.timeSet = 30;
		
		myAir.에어컨On();
		myAir.상하바람on();
		myAir.상하바람off();
		System.out.println("온도는 : " + myAir.temp);
		System.out.println("자동꺼짐은 : " + myAir.timeSet);
		
		myAir.에어컨Off();

		
		
	} //main 
}// class 

package 클래스사용;

import 클래스생성.Car;

public class 자동차공장 {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.run();
		car1.up();
		car1.color = "빨강";
		car1.count = 4;
		
		System.out.println(car1.color);
		System.out.println(car1.count);
		
	}

}

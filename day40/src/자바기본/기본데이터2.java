package 자바기본;

public class 기본데이터2 {

	public static void main(String[] args) {

		byte b = 100;
		int i = b; // 큰 <---- 작 자동타입 변환(자동형변환)
		
		int i2 = 100;
		byte b2 = (byte)i2; // 작 <---- 큰  그래서 안들어감, 강제 형변환 해줘야함 
		
		// 기본형의 캐스팅 
		// 형변환 Casting : cpu가 타입을 변환 ()괄호안에 타입을 지정 
		// ram에 선언된 타입 변경 불가, 선언할 때 타입이 결정되기 때문에 재선언 불가! 
		// 캐스팅의 종류 1)자동, 2)강제 캐스팅 
		
		// 강제 캐스팅인 경우 ,값의 범위가 해당되는 경우만 가능!!!
		int i3 = 1000;
		byte b3 = (byte)i3 ;	//byte 의 범위에 1000이 포함되지 않아서 캐스팅하면 안된다. 잘못된 값이 들어감.
		System.out.println(b3);
		
	
	
	
	
	
	}

}

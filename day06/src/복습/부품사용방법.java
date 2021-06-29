package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.IdentifierHelper;

public class 부품사용방법 {

	public static void main(String[] args) {

		// 망치
		// 너무 자주사용하여 RAM 에 이미 들어가있음.
		// 클래스 이름으로 바로 사용가능.
		// Integer, Double, System, JOptionPane
		// 기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는지 여부
		// 함수를 가지고있는 부품을 선택
		// 명령어 : parseint (function)
		
		
		// 벽돌
		// 모든 처리를하려면 ram에 있어야하고 아래의 코드를 ram에 복사. (jrm 폴더에서 ram으로 복사)
//		Date date;
//		date = new Date();
		// 위와 아래의 코드가 같음
		// Date라는 부품을 복사해서 RAM에 변수를 만들어 저장해둔
		//cpu는 모든 부품을 ram에 가져다놓고 조립한다.
		// Date date; => 저장된타입 변수명;(선언)
		//선언 : Ram에 저장공간을 만드는 것.
		Date date = new Date();
		
		int hour = date.getHours();	//10
		System.out.println("현재 시각은 " + hour + "시"); 
		
		//함수는 반환이 있ㄴㄴ것이 있고, 없는 것이 있다.
		//반환을 return 이라고 부른다.
		// 반환이 있는함수만프린트가 가능하다.
		System.out.println(date.getMinutes());
//		System.out.println(System.out.println());
		// 반환이 없는 경우에는 void 라고 써있다. void는 없다라는 의미!
		
		int month = date.getMonth() + 1;
//		if (3 <= month && month <= 5) { //3부터 5까지표현하는 방법
//		} 
		String result = "해당 계절이 없습니다.";		// null 로 대신넣어도됨
		if (month == 3 || month == 4 || month == 5) {
			result = "봄";
		}else if( month == 6 || month == 6 || month == 8) {
			result = "여름";
		}else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		}else {
			result = "겨울";
		}
		System.out.println(result);
		System.out.println("============================");
		
		int day = date.getDay(); //요일
		if (day == 0 || day == 6) {
			System.out.println("주말에는 놀아요. ");
		} else {
			System.out.println("주중에는 달려요. ");
		}
		
		while (true) {	// while 문은 break 를 사용해서 종료조건을 만들어줘야함.
			System.out.println("달려요!! 달려요!!"); //1
			System.out.println("또 달려요!!"); //2
			System.out.println("마지막 달려요!!"); //3 
			break;
		}
		
		// switch 문 : break 필수
		
		switch (month) {
		case 3: case 4: case 5:
		System.out.println("봄");
			break;
		case 6: case 7: case 8: //or 같은 역할
			System.out.println("여름");
			break;
		case 9: 
		case 10: 		// 이렇게 써도 가능 
		case 11:
			System.out.println("가을");
			break;
		default: //else 같은역할, else가 없을때 안써도됨.
			System.out.println("겨울");
			break;
		}
		//정수, 문자1(char), String 만사용가능. (실수,long 사용불가)
		switch (month) {
		case 2:
			System.out.println("28일");
			break;
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		default:
			System.out.println("30일");
			break;
		}
		
		
		
//		Random r = new Random();
//		Scanner sc = new Scanner(System.in); 	//콘솔에서 입력값을 넣어줄수 있게함. 옵션값으로 어떻게 입력할건지 지정해줘야함. 
		// 키보드로 입력은 input. System.in
		// 
		
		
		
		
	} //main
} //class

package 누적연습;

//java.util.a.Test; 이건 안됨

import java.util.*;
//import java.util.a.Test 유틸하위에 있는걸 따로 쓰려면 import를 다시해줘야함.


public class 콘솔입력스캐너 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	// 스캐너가 가져올수있는곳은 많음. DB, 인터넷크롤링,파일 등등
												// scanner 같은것은 꼭 지정을 해줘야하는 것이 있다. 
		System.out.print("당신의 이름을 입력해주세요.>>>>");	//next 전에 콘솔에 알려주는 역할. 보통 syso를 먼저 사용해줌.
		String name = sc.next(); //String 입력(단어), next는 단어단위로 가져옴. 공백을 사용하면 공백뒤에는 가져오지않음.
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("당신의 소속을 입력해주세요.>>>>");	
		String op = sc.next();				
		System.out.print("당신의 소속은 " + op);	
		
		
		
		
		
		
		
		
	}//main
}//class

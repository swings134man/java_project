package 반복문;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {

		// 반복을 무한으로 할것인가(while), 유한으로 할것인가 (for)
		// while문을 유한루프로 만들떄는  시작값, 종료조건, 증가값이 필요하다.
		
		while (true) {// 무한루프(ex.카톡채팅같은걸 계속 받을준비를 하는것.)
			System.out.println("여기가 계에에에속 무하아아안 반보오오ㅗㅇ");
			String q = JOptionPane.showInputDialog("중단하실래요x");
			if (q.equals("x")) {
				//break;		breake 나 아래의 system.exit(0); 둘중 하나 사용
				System.exit(0);
			}
		}
		
		
		
	}//main
}//class

package 복습;

import java.util.Random;

public class 랜덤1000개 {

	public static void main(String[] args) {
		
		int[] jumsu = new int[1000]; 
		//{0,0,0,0,0,0,0,0,0,0,......}
		// 변수개수: 1002개 
		// 램의크기: 4012바이트 
		System.out.println(jumsu.length + "개");
		
		//기본형 변수(값) : 1001
		//참조형 변수(주소)의 개수: 1
		Random r = new Random();
		System.out.println(r.nextInt(100));
		
//		jumsu[0] = r.nextInt(100);
//		jumsu[1] = r.nextInt(100);
//		jumsu[2] = r.nextInt(100);
//		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(100);
		}
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		for (int x : jumsu) {
			System.out.println(jumsu);
		}
		
		
		
	}

}

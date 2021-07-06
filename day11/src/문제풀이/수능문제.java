package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {

		int[] jumsu = new int[10000];
		Random r = new Random(5);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(331);	//0~330 
		}
		
		//1. 수능 만점자는 몇명일까요?
		//2. 만점자 번호는 몇번? 
		
		int people = 0;
		
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				people++;	//people = people +1;
				System.out.println("번호>" + i);
			}
			
			
		}
		System.out.println("수능 만점자는 : " + people + "명 입니다.");
		
		
		
		
		
		
		
		
		
	}//main

}

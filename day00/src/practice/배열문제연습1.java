package practice;

import java.util.Scanner;

public class 배열문제연습1 {

	public static void main(String[] args) {

		//국어 수학 사회 과학 영어 
		// 입력 하고 점수 평균값 계산. 
		double[] jumsu = new double[5];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("성적을 입력해라 " + (i + 1) + ">>>>>");
			jumsu[i] = sc.nextDouble();
		}
		double result = (jumsu[0] + jumsu[1] + jumsu[2] + jumsu[3] + jumsu[4]) / 5.0;
		
		System.out.println(result);
		
		
		
		
		
	}//main
}//class

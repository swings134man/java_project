package 자바기본;

import java.util.Random;
import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		
		
		Random r = new Random();		//seed 값,씨앗값
		int start = r.nextInt(10);		// 0~99 , 시작값
		int end = r.nextInt(10) + 1000; //1000~ 1009, 종료값
		
		int sum = 0;
		int count = 0;
		
		
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
			
		}
		System.out.println("첫번째값 " + start + " 두번째 값 " + end);
		System.out.println("3의 배수의 합은 >>" + sum);
		System.out.println("3의 배수의 개수는 " + count + "개");
		double avg = (double)sum / count;
		System.out.println("3의배수 평균은 " + avg);
		
		
	}

}

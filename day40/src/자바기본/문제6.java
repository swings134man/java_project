package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		
		String number = "";
		int sum = 0;
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값을 입력하세요. >> ");
		int start = sc.nextInt();
		System.out.print("종료값을 입력하세요. >> ");
		int end = sc.nextInt();
		
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0) {
				sum += i;
				count++;
				number += i + "\n";
				list.add(i);
				
			}
			
		}
		System.out.println("5의 배수의 합은 >>" + sum);
		System.out.println("5의 배수의 개수는 " + count + "개");
		System.out.println("5의 배수의 개수는 " + list.size() + "개");	//어레이 리스트
		
		System.out.println("5의 배수의 목록은 " + number);
		System.out.println("5의 배수의 목록은 " + list);				// 어레이 리스트
		
		int avg = sum / count;
		System.out.println("5의배수 평균은 " + avg);
		System.out.println("5의배수 평균은 " + (double)sum / list.size()); //어레이 리스트
		sc.close();
	}// main
} // class

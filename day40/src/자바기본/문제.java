package 자바기본;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] fruit = {0, 0, 0}; 
		
		for (int i = 0; i < 3; i++) {
			System.out.print("과일 가격 입력" + i + " >> ");
			int price = sc.nextInt();
			if (price >= 10000) {
				System.out.println("비싸네요!");
			} else {
				System.out.println("살만하네요!");
			}
			fruit[i] = price;
			sum = sum + price;
		}
		double avg = sum / 3.0;
		System.out.println("평균은 " + avg);
		System.out.println("------------------------------");
		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i] + " ");
		}
		sc.close();
		
	}// main
}//class

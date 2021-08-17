package 자바기본;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] fruit = {0, 0, 0}; 
		
		int i = 0;
		while (true) {
			System.out.print("과일 가격 입력" + i + " >> ");
			int price = sc.nextInt();
			if (price >= 10000) {
				System.out.println("비싸네요!");
			} else {
				System.out.println("살만하네요!");
			}
			fruit[i] = price;
			sum = sum + price;
			i++;
			if (i == 3) {
				break;
			}
		}
		double avg = sum / 3.0;
		System.out.println("평균은 " + avg);
		System.out.println("------------------------------");
		for (int j = 0; j < fruit.length; j++) {
			System.out.print(fruit[j] + " ");
		}
		sc.close();
		
	}// main
}//class

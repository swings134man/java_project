package 문제풀이;

import java.util.Scanner;

public class 정수5개입력 {

	public static void main(String[] args) {

		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자 입력>>> ");
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + num[2]);		
		
		String[] num1 = new String[3];
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < num1.length; i++) {
			num1[i] = sc.next(); 
		}
		
		System.out.println();
		
		
		
		
		
	}

}

package practice;

import java.awt.FlowLayout;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Memo {

	public static void main(String[] args) {

		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력>>>>");
		int n1 = sc.nextInt();
		System.out.println("내년 나이는 " + (n1 + 1) + "세 입니다.");
		
		System.out.print("키를 입력하세요 >>>");
		double n2 = sc.nextDouble();
		System.out.println("내년 키는 " + (n2 + 10.0) + "입니다. ");
		
		System.out.print("저녁을 먹었습니까?(true/false) 입력>>>>");
		boolean n3 = sc.nextBoolean();
		if (n3) { 							
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배가 고프시겠군요!");
		}
		
//		sc.nextLine();								
		System.out.print("올해의 목표는>>>");	
		String n4 = sc.next(); 					
												
		System.out.println("올해의 목표는 " + n4 );
		
		sc.close();
*/		

		/*
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				continue; 
			}
			if (sum > 2000) {
				break;
			}
			sum = sum + i;
			count++; 
			System.out.println("sum : " + i);
		}
		System.out.println(sum);
		System.out.println(count);			
		*/
		
		/*
		int h = 0;
		int j = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				h += i; 
			}else {
				j += i;
			}
			System.out.println(h);
			System.out.println(j);
		}
		System.out.println("짝수는 " + h);
		System.out.println("홀수는 " + j);
		
		
		byte aa = 10;
		System.out.println(aa);
		*/
		Random r = new Random(42);
		int jumsu[] = new int[100];
		int count = 0;
		
		
		for (int i = 0; i < jumsu.length; i++) {
			count = i;
			jumsu[i] = r.nextInt(100);
			System.out.println(count + ": " + jumsu[i]);
		}
		//for each 구문 사용 안해도 되는지?? 아래의 for each 구문과 같은것인지?
		
		/*
		for (int x : jumsu) {
			System.out.println(x + ": " + count );
		}
		*/
		
	} // main
}// class

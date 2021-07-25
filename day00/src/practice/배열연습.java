package practice;

import java.util.Iterator;
import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
//
//		String[] a = {"강씨", "박씨", "김씨", "이씨", "장씨"};
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
		
//		int[] c = new int[5];
//		
//		c[0] = 1000;
//		c[2] = 1000;
//		c[c.length - 1] = 1000;
//		for (int x : c) {
//			System.out.println(x);
//		}
//		
//		
//		double[] a = new double[5];
//		a[0] = 50.1;
//		a[3] = 100.1;
//		a[a.length - 1] = 220.1;
//		for (double d : a) {
//			System.out.println(d);
//		}
		
		String[] gg = {"아이유", "박명수", "수지"};
		int[] jj = new int[3]; 
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("투표해라 1,2,3");
			System.out.print("입력 >>>>>> ");
			int num = sc.nextInt();
			count++;
			
			if (num == 3) {
				System.out.println("투표 종료");
				System.out.println();
				for (int i = 0; i < jj.length; i++) {
					System.out.println(gg[i] + "가 " + jj[i] + "표 " );
				}
					System.out.println("전체 투표수는" +( count - 1));
					System.exit(0);
					sc.close();
			}else {
				System.out.println(gg[num] + "표 획득!");
				jj[num]++;
				
			}
			
			
			
		}
		
		
		
		
	}

}

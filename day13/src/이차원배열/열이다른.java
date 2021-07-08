package 이차원배열;

import java.util.Random;

public class 열이다른 {

	public static void main(String[] args) {

		//1. 배열 처음에 만들 떄 값을 이미 알고 있는 경우
		int[][] n1 = {
				{1, 2, 3},
				{1, 2, 3, 4},
				{1, 2, 3, 4, 5}
		};
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		//2. 배열 처음에 만들 떄 값을 모르고 있는 경우
		// - 1차원 배열을 만들어라.
		// - 1차원 배열을 2차원 배열의 각 행에 끼워넣어라.
		
		int[][] n2 = new int[3][];

		int[] s = new int[6];
		int[] s1 = new int[4];
		int[] s2 = new int[2];
		n2[0] = s;
		n2[1] = s1;
		n2[2] = s2;
		
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}
		
		// 정리 문제
		
		int[][] n3 = new int[4][5];
		Random r = new Random();
		
		for (int i = 0; i < n3.length; i++) {
			for (int j = 0; j < n3[i].length; j++) {
				n3[i][j] = r.nextInt(100);
				System.out.print(n3[i][j] + " ");
			}
			System.out.println();
		}
		
		

		
		
		
		
		
		
	}

}

package 문제풀이;

import java.util.Scanner;

public class 문제풀이1과일 {

	public static void main(String[] args) {

		// 사과/바나나 2000원 , 포도/키위 3000
		// 좋아하는 과일은? 1)사과 2) 바나나 3)포도 4) 키위 0)종료 >> 1
		// -------------
		// 사과가 선택되었습니다.
		// --------------
		// 시스템이 종료됩니다. 사과 3개 바나나 2개 등등..
		// 구매하려면 전체 금액은 --원입니다.
		
		Scanner sc = new Scanner(System.in);
		String[] fru = { "사과", "바나나", "포도", "키위" };
		int[] pri = new int[4];

		while (true) {
			System.out.println("===============================================");
			System.out.print("좋아하는 과일은?");
			System.out.print(" 1)사과 2)바나나 3)포도 4)키위 0)종료 >>>> ");
			int no = sc.nextInt();
			System.out.println("===============================================");
			if (no == 0) {
				System.out.println("시스템이 종료됩니다. ");
				for (int i = 0; i < pri.length; i++) {
					System.out.println(fru[i] + "가 " + pri[i] + "개 선택되었습니다.");
				}
				int total = ((pri[0] + pri[1]) * 2000) + ((pri[2] + pri[3]) * 3000);
				System.out.println("구매하려면 전체 금액은 " + total + "원 입니다. ");
				break;
			}
				pri[no -1]++;					
				System.out.println(fru[no - 1] + "가 선택되었습니다.");
				System.out.println();
			} // while
			sc.close();

		

	}// main
}// class

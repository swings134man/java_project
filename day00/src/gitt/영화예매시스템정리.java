package gitt;

import java.util.Scanner;

public class 영화예매시스템정리 {

	public static void main(String[] args) {

		int[] seat = new int[11]; //1~10
		Scanner sc = new Scanner(System.in);
		int count = 0;
		final int MONEY = 20000;

		while (true) {
			System.out.println("------------------------------------");
			for (int i = 1; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("------------------------------------");
			for (int i = 1; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("좌석번호 선택(종료 -> 0)>>>>>>> ");
			int num = sc.nextInt();
			
			if (!(num < 11 && num > -1)) {
				System.out.println("잘못 선택 하셨습니다. 다시 선택하세요.");
				continue;
			}
			if (num == 0) {
				System.out.println("예약 종료.");
				System.out.println(count + "자리 예약되었습니다.");
				System.out.println("총금액은 " + (count * MONEY));
				break;
			}
			if (seat[num] != 1) {
				seat[num] = 1;
				count++;
				System.out.println(num + "번 예약 되었습니다.");
			} else {
				System.out.println("이미 예매된 좌석입니다. 다시 선택해주세요.");
			}
			
		} // while
		sc.close();
		String num1 = "";
		String num2 = "";

		for (int i = 1; i < seat.length; i++) {
			if (seat[i] == 1) {
				num1 = num1 + i + "번 ";

			}
		}
		System.out.print("예매자리는 : " + num1);

		System.out.println();
		for (int i = 1; i < seat.length; i++) {
			if (seat[i] == 0) {
				num2 = num2 + i + "번.";
			}
		}
		System.out.print("남은자리는 : " + num2);
		
		
		
		
	} //main
} //class

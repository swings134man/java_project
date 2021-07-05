package 배열응용;

import java.util.Scanner;

public class 극장예약시스템 {

	public static void main(String[] args) {
		int[] seat = new int[10];				//좌석의 갯수 10개를 int 배열로 선언
		Scanner sc = new Scanner(System.in);	//좌석번호를 예매할수있는 입력값을 스캐너로 입력 하기위해서
		int count = 0;							//
		final int MONEY = 10000; //항상똑같은 수가 들어가는 변수(상수)
		//final 은 상수를 나타냄, 변경불가능! 
		
		while (true) {
			System.out.println("-----------------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("-----------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("원하시는 좌석번호를 입력(종료 -1) >>> : ");
			int no = sc.nextInt(); // 0번입력
			if (no == -1) {
				System.out.println("예약 시스템 종료합니다.");
				int total = count * MONEY;
				System.out.println("당신의 지불 금액은 " + total + "원");
				break;
			}
			// 예약처리 하기전에 이미 그자리가 예약된 자리인지 확인!!!
			// 확인방법 정해봅시다!
			// 0번을 입력했우면 배열의 인덱스 0번자리를 1로 변경해서
			// 예약되었다라는 것을 저장해두자.
			if (seat[no] != 1) {
				seat[no] = 1;
				count++;
				System.out.println(no + "번 예약 완료.");
				System.out.println(count + "자리 예약됨.");
			} else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 선택해주세요.");
				count--;
			}
		}// while
		sc.close();
		
		//예약된 자리를 배열에 1이 들어간 개수를 세어도 구할 수 있음. 
		//지금까지 배열에 저장된 값 들중 1이 몇개인지 세어보세요.! 
		int count2 = 0; 
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			}
		}
		System.out.println(count2 + "자리 예약됨.");
		//2. 1로 예약된 자리가 어디인지 프린트 
		String sum = "";
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				sum = sum + i + "번 ";
			}
		}
		System.out.println("예약된 자리목록 :" + sum);
		
		
	}//main
}//class

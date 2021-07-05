package 배열응용;

import java.util.Scanner;

public class 극장예약클론 {

	public static void main(String[] args) {

		int[] seat = new int[10];				//좌석의 갯수 10개를 int 배열로 선언
		Scanner sc = new Scanner(System.in);	//좌석번호를 예매할수있는 입력값을 스캐너로 입력 하기위해서
		int count = 0;							//총 몇좌석이 예매됬는지 값을 보기위해서 int 선언.
		final int MONEY = 10000;				//지불해야하는 총금액을 선언해줌. final로 상수 선언 변하지않음. 
		
		while (true) {							
			System.out.println("---------------------------------");
			for (int i = 0; i < seat.length; i++) {					//좌석의 번호를 보기위해서 i 값으로 0부터 9까지 나타냄.
				System.out.print(i + " ");
			}
			System.out.println();									// 한줄을내리기위한 용도.
			System.out.println("---------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");					// 좌석이 예매됬을때 1 아닐떄 0을 보여주기 위해서 배열을 0부터 9까지 프린트 하기위한것.
			}
			System.out.println();
			System.out.print("원하는 좌석 번호 입력.(종료 -1) ->>>>");		// 원하는 좌석을 선택하기 위해서 scanner로 입력값 받음
			
			int no = sc.nextInt();									// scanner 로 입력받은 값을 int 로 변환해서 int no 에 저장. (좌석번호 선택)
			if (no == -1) {											// 입력값이 -1인경우에 예매를 종료하기위해서 조건값에 no == -1 지정
				int total = count * MONEY;							// 총금액 지불값을 알려주기위한 변수
				System.out.println("예약 프로그램이 종료됩니다.");			// 입력값이 -1 일때 프로그램이 종료된다는걸 알려줌. 
				System.out.println("당신의 지불 금액은 " + total + "원");		// 총 지불금액값을 알려줌
				break;												// 입력값이 -1 일떄 while 문 종료 
			}
			if (seat[no] != 1) {									// 입력값이 1이 아닐때 
				seat[no] = 1;										// 입력값은 배열의 번호를 지정하고, 값을 1로 바꿈. 
				count++; 											// 총몇자리를 예약하고있는지 알기위해서 count값에 증감연산
				System.out.println(no + "번 예약 완료.");				
				System.out.println(count + "자리 예약됨.");
			}else {
				System.out.println("이미 예약된 자리입니다. ");			//같은 자리값을 입력했을때 멘트
				System.out.println("다른 좌석 선택. ");					
				
			}
		}
		sc.close();													// scanner 종료. 
		
		int count2 = 0; 
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {										// 예매된 좌석이 몇자리인지 계산하기 위한코드 (배열에 1인 갯수가 몇개인지)
				count2++;
			}
		}
		System.out.println(count2 + "자리 예약됨.");					
			
		String sum = "";	
		String sum1 = "";
		
		for (int i = 0; i < seat.length; i++) {						// 몇번몇번 자리를 예약했는지 한번에 확인하기위한 코드 (배열에 값이 1인것들의 주소값) 
			if (seat[i] == 1) {										// seat배열에 1인것들 일떄
				sum = sum + i + "번 ";								// 좌석번호 
			}
		}
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 0) {
				sum1 = sum1 + i + "번 ";
			}
		}
		
		System.out.println("예약된 자리목록 :" + sum);					// 예약된 좌석번호 프린트.
		System.out.println("남은 자리목록 : " + sum1);
		
	}//main
}//class

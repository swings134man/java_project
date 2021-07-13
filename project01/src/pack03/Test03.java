package pack03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			// scanner 로 입력할수있게 클래스 생성 
		int count = 0;									// 전체 시도 횟수를 위한 변수.
		int fro = 0;									// 앞숫자가 클때 횟수 카운트 변수
		int beh = 0;									// 뒷숫자가 클떄 횟수 카운트 변수
			
		
		
		while (true) {									// 프로그램 종료 문구전까지 반복.
			System.out.print("숫자 입력>> ");
			int a = sc.nextInt();						// 숫자를 비교하기위해 int a 에 저장
			System.out.print("숫자 입력>> ");
			int b = sc.nextInt();						// 앞숫자와 비교하기위해 int b 에 저장
			count++;									// 전체시도 횟수를 카운트 하기위해 count++;
			if (a > b) {
				System.out.println("판결은 앞숫자가 크다.");	// a가 b보다 클떄 출력값
				fro++;									// a가 클때 fro++ (횟수)
			}else if(b > a) {							
				System.out.println("판결은 뒤숫자가 크다.");	// b가 a 보다 클떄 출력값
				beh++;									// b가 클때 beh++ (횟수)
		}
			System.out.print("계속 하시겠습니까(계속: o , 중단: x)");
			String c = sc.next();						// o 나 x 를 입력받아서 저장함
			
			if (c.equals("o")) {						// 입력값이 o 일때 출력
				System.out.println("계속 진행합니다.");
				continue;								// 다시 while 문을 진행하기위해 continue 입력
			} else if(c.equals("x")) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println(("시도 횟수: " + count) + (", 앞숫자가 큰횟수: " + fro) + (", 뒷숫자가 큰횟수: " + beh));
				break;									// 만약 x를 눌렀을떄 while 문을 종료하기위해 break 입력
			}
	}// while
		sc.close();										// 스캐너 종료
		
		
		
		
		
		
		
		
		
	} //main
}// class

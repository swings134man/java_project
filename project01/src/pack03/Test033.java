package pack03;

import java.util.Scanner;

public class Test033 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("원하는 기호를 넣으세요>> ");
			String mo = sc.next();							// 원하는 기호 입력
			System.out.print("원하는 횟수를 넣으세요>> ");
			int co = sc.nextInt();							// 횟수 입력
			for (int i = 0; i < co; i++) {					// 입력한 횟수만큼 실행
				System.out.print(mo);
			}
			break;
		}
		System.out.println();
		
		int count = 0;
			while (true) {
				System.out.print("1)증가, 2)감소, 3)종료를 선택해주세요.>> ");	
				int a = sc.nextInt();									//입력값을 a 에 저장
				if (a == 1) {											//a가 1일경우 카운트+1
					count++;
					System.out.println("카운트 : " + count);				// 출력
				} else if(a == 2) {										// a가 2일경우 카운트 -1
					count--;
					System.out.println("카운트 : " + count);
				}else if(a == 3) {										//a가3일때 프로그램 종료 및 현재 카운트 출력
					System.out.println("시스템을 종료합니다. 현재까지의 카운트는 " + count);
					break;
				} 
			}//while
			sc.close();													// scanner 종료
	} //main
}//class
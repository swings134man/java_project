package 자바심화2;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제풀기2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("1403219");
		list.add("1103219");
		list.add("3203219");
		list.add("2203219");
		list.add("2303219");
		list.add("4103219");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자가 1또는 3이면 남자, 2또는 4이면 여자");
		System.out.println("두번쨰 숫자가 1 = 서울, 2 = 부산, 3 = 제주, 4 = 기타 지역.");
		
		while (true) {
			
			System.out.println("----------------------------------------------------");
			System.out.println("0번을 누르면 종료, 1번을 누르면 입력시작");
			int num1 = sc.nextInt();
			if (num1 == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(num1 == 1) {
				System.out.print("주민번호 뒷자리 7자리를 입력하세요. >>> ");
				String num2 = sc.next();
				
				if (num2.charAt(0) == '1' || num2.charAt(0) == '3') {
					System.out.println("남자 이시군요!");
				}else if(num2.charAt(0) == '2' || num2.charAt(0) == '4') {
					System.out.println("여성 이시군요!");
				}
				if (num2.charAt(1) == '1') {
					System.out.println("서울 시민이시군요.");
				}else if(num2.charAt(1) == '2') {
					System.out.println("부산 시민이시군요.");
				}else if(num2.charAt(1) == '3') {
					System.out.println("제주도 시민이시군요.");
				}else if(num2.charAt(1) == '4') {
					System.out.println("기타지역 시민이시군요.");
				}
			}
		}
		
		
		
		
		
		
	}//main
}//class

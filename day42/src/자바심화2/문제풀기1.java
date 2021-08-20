package 자바심화2;

import java.util.Scanner;

public class 문제풀기1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = {0, 0, 0, 0, 0};
		
		System.out.println("콘도 예약을 진행합니다.");
		while (true) {
			System.out.println("원하는 지역을 선택해주세요. (각 지역은 2명까지 선택 가능.)");
			System.out.println("---------------------------------------------------");
			System.out.println("1)강원도 2)전라도 3)파주 4)제주도 5)서울");
			System.out.println("---------------------------------------------------");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+ "      ");
			}
			System.out.println();
			System.out.println("===================================================");
			System.out.print("원하는 지역코드를 입력하세요. 종료는 0번 >");
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("예약을 종료합니다.");
				break;
			} else if(choice == 1){
				if(num[0] < 2) {
					num[0] = num[0] +1;
					System.out.println("신청이 완료 되었습니다.");
				}else {
					System.out.println("이미 인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른 지역을 신청해주세요.");
				}
			}else if(choice == 2){
				if(num[1] < 2) {
					num[1] = num[1] +1;
					System.out.println("신청이 완료 되었습니다.");
				}else {
					System.out.println("이미 인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른 지역을 신청해주세요.");
				}
			}else if(choice == 3){
				if(num[2] < 2) {
					num[2] = num[2] +1;
					System.out.println("신청이 완료 되었습니다.");
				}else {
					System.out.println("이미 인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른 지역을 신청해주세요.");
				}
			}else if(choice == 4){
				if(num[3] < 2) {
					num[3] = num[3] +1;
					System.out.println("신청이 완료 되었습니다.");
				}else {
					System.out.println("이미 인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른 지역을 신청해주세요.");
				}
			}else if(choice == 5){
				if(num[4] < 2) {
					num[4] = num[4] +1;
					System.out.println("신청이 완료 되었습니다.");
				}else {
					System.out.println("이미 인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른 지역을 신청해주세요.");
				}
			}
		}// while
		sc.close();
	}// main
}// class

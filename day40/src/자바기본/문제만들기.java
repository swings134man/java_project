package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제만들기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0; 
		int[] jumsu = new int[3];
		ArrayList<String> list = new ArrayList<>();
		
		while (true) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. 학생이름           2. 점수           3. 학년");
			System.out.println("------------------------------------------------------");
			System.out.println("차례대로 입력하세요!");
			System.out.println("1) 입력 , 2) 조회하기! 3) 종료");
			
			System.out.print("선택번호 >> ");
			int sele = sc.nextInt();
			if (sele == 3) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}else if(sele == 1 ) {
				System.out.print("이름 입력 >>");
				String name= sc.next();
				System.out.print("점수 입력 >>");
				int jumsu1 = sc.nextInt();
				System.out.print("학년 입력 1~3학년 >>");
				String grade = sc.next();
				
				list.add(name);
				
			}else if(sele == 2) {
				System.out.println();
				System.out.println("학생수는 " + list.size());
				
			}
		} //while
		
		
		
		
		
		
		
		
	} // main
} //class

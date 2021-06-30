package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력>>>>");
		int n1 = sc.nextInt();
		System.out.println("내년 나이는 " + (n1 + 1) + "세 입니다.");
		
		System.out.print("키를 입력하세요 >>>");
		double n2 = sc.nextDouble();
		System.out.println("내년 키는 " + (n2 + 10.0) + "입니다. ");
		
		System.out.print("저녁을 먹었습니까?(true/false) 입력>>>>");
		boolean n3 = sc.nextBoolean();
		if (n3) { 							// boolen n3에 이미 true/false 값이 담겨있기때문에 (n3 == true) => 사용해줄 필요가 없다.
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배가 고프시겠군요!");
		}
		
		sc.nextLine();								// 이자리에 nextline 입력
		System.out.print("올해의 목표는>>>");	
		String n4 = sc.nextLine(); 					// 위에의  println에서 엔터가 먹었기때문에 str n4는 입력이 되질않아서
													// nextline을 한번더 사용해준다. 그럼 아래의 nextline에서 입력이 된다. 
		System.out.println("올해의 목표는 " + n4 );
		
		sc.close();
	}
}

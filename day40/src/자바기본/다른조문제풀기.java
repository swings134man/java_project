package 자바기본;

import java.util.Random;
import java.util.Scanner;

public class 다른조문제풀기 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("4번 입력시 프로그램 종료.");
		System.out.println("1)가위 2)바위 3)보");
		while (true) {
			System.out.println("가위! 바위! 보!");
			int pro = r.nextInt(3) + 1;
			int in = sc.nextInt();
			if (in == 1) {
				if (pro == 1) {
					System.out.println("비겼습니다!");
				} else if(pro == 2){
					System.out.println("졌습니다!!");
				}else if(pro == 3) {
					System.out.println("이겼습니다!");
				}
			} else if(in == 2){
				if (pro == 1) {
					System.out.println("이겼습니다!!");
				} else if(pro == 2){
					System.out.println("비겼습니다!!");
				}else if(pro == 3) {
					System.out.println("졌습니다!");
				}
			}else if(in == 3){
				if (pro == 1) {
					System.out.println("졌습니다!!");
				} else if(pro == 2){
					System.out.println("이겼습니다!!");
				}else if(pro == 3) {
					System.out.println("비겼습니다!");
				}
			}else if(in == 4) {
				System.out.println("프로그램을 종료합니다!");
				break;
			}else {
				System.out.println("잘못입력하셨습니다 다시 입력해주세요.");
			}
			
		}//while
		sc.close();
		
		
		
		
		
		
	}

}

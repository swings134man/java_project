package 문제풀이;

import java.util.Scanner;

public class 문제풀이3 {

	public static void main(String[] args) {
		// 입력 3개를 받는다 
		// 퍼센트로 바꾸고 바꾼값을 더해서 나온 점수로 학점. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학 점수를 입력하세요. >>>>>");
		int n1 = sc.nextInt();
		double n11 = (n1 * 0.3); 
//		System.out.println(n11);
		
		System.out.print("과학 점수를 입력하세요. >>>>>");
		int n2 = sc.nextInt();
		double n22 = (n2 * 0.5); 
//		System.out.println(n22);
		
		System.out.print("물리 점수를 입력하세요. >>>>>");
		int n3 = sc.nextInt();
		double n33 = (n3 * 0.2); 
//		System.out.println(n33);
		
		double result = n11 + n22 + n33;
		System.out.println("총점수 " + result);
		
		if (result > 90) {
			System.out.println(result + "점 최우수 입니다.");
		} else if(result > 80){
			System.out.println(result + "점 우수 입니다.");
		}else if (result > 70) {
			System.out.println(result + "점 보통 입니다.");
		}else {
			System.out.println(result + "점 미달 입니다.");
		}
		sc.close();
		
	} //main
}//class

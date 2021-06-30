package 문제풀이;

public class 점프해서누적 {

	public static void main(String[] args) {
		
		//Q1. 
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
			sum = sum + i;
			System.out.println(i + ": " + sum); 	//오류가 발생해서 일일이 계산과정 봐야할때 확인용도.
		}
		System.out.println(sum);
		
		// Q2.
		int sum1 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		
		//Q3.
		int sum2 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);

		// 2번,3번 문제처럼 2씩, 5씩점프 하는 문제는 i + 2 이다.
		// i++; => i = i + 1;
	}// main
}

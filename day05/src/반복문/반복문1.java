package 반복문;

public class 반복문1 {

	public static void main(String[] args) {

		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	
		//1 부터 10까지 2씩 점프
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		//반복문안에 들어가는 변수는 횟수를 카운트할 때도 사용하고
		//변수에 들어있는 값을 가지고 처리할 때도 사용한다. 
		//2가지 경우가 있다.
		//위의 두가지 경우는 2번 경우이다.
		// i++ = i=i+1;
		
		//1부터 100까지 5씩 점
		for (int i = 1; i < 100; i = i+5) {
			System.out.println(i);
		}
		
		//100부터 1까지 1씩 점프
		for (int i = 100; i >= 1; i = i--) {
			System.out.println(i);
		}
		
		/*
		//1000부터 0까지 8씩 점프
		for (int i = 1000; i >= 0; i = i - 8) {
			System.out.println(i);
		}
		*/
		
		
		
	}

}

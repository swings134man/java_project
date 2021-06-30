package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {

		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {		//i를 3으로 나눴을때 0으로 떨어지면 3의배수임
			sum1 = sum1 + i;		// if문에 괄호안에는 비교연산자를 사용
			}
		}
		System.out.println(sum1);
		
		
		
		
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {		
			continue;	//pass 하라는것 반복은 하지만 이건 하지마~
			// 반복문을 계속하라는 의미
			// 조건에 맞는경우 아래의 있는 코드는 더이상 실행x 
			// 제외의 의미
			}
			if(sum2 > 20) {
				System.out.println("20보다 합이 크므로 stop!");
				break;
			}
			
			sum2 = sum2 + i;		
		}
		System.out.println(sum2);
		
		
		
		
	}//main
}

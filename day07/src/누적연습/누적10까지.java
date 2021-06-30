package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {

		//1부터 10까지 더해봅시다. 
		
		int sum = 0; 	//변수의 초기화 
		
		for (int i = 1; i <= 100; i++) {
			//1+ 2+ 3 + ...
			// 1+2의 값을 램에 저장해두고 그다음 3을더해야 하는 로직임
			sum = sum + i;	// 1 = 0 + 1		1 (ram에 저장) = sum(초기화값) 
							// 3 = 1 + 2		ram에 저장되어있는 1을 i++값인 2이랑 더한값 3을 ram에 저장.
							// 6 = 3 + 3
			
			//0+1 , i의 값 1씩 증가 초기화 되어있는 뒷sum 0, 앞 sum에 더한 결과값을 저장함.
		}
		System.out.println(sum);
		
		
		
	}

}

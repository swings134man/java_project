package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {
		// 두개의 점수의 평균을 내는것. 
		
		// 선언
		int x = 111;
		int y = 222;		
		System.out.println("두 수의 합은 " + x + y);
		System.out.println("두 수의 합은 " + (x + y));
		System.out.println("두 수의 나눗셈은 " + (x / y));
		//	x + y; //이게 안되는 이유(error) 는 cpu가 계산만하고 끝나서. 
		
		// 1. int sum = 333; 
		int sum = x + y;	// 계산 순서 1(int)-> 3(x+y)-> 2(sum) int 라는 값은, x+y연산후 sum 값으로
		int avg1 = sum / 2;
		System.out.println("평균은 " + avg1); 
		// 계산후 남은 소수점 밑이 나오지 않음. 자바에서는 정수와 정수의 계산은 무조건 정수!!
	
		// 2. 자바에서는 하나라도 실수면 무조건 실수의 결과가 도출!!
		double avg2 = sum / 2.0;
		System.out.println("평균은 " + avg2);
		// 가능은 하지만 아래 3번을 쓰는것이 좋음. 
		
		
		// 3. 여기까지 sum의 값은 333 ram에 저장되어 있음 
		int count = 2; 
		avg2 = sum / (double)count;		 
		System.out.println("평균은 " + avg2);
		//강제로 타입 변환, 강제형변환. 위에선 count의 값2 는 int 인데 강제로 -> double 타입으로 바꿈.
		// casting(캐스팅) = cpu가 원래 데이터의 타입을 다른 타입으로 강제로 변환. 
		
		
		
	}

}

package 클래스생성;

public class 계산기 {

	//사칙연산 계산기
	
	public void 더하기(int price, int count) {
			System.out.println("더하기 기능 처리 내용 구현");
		int result1	= price + count;
		System.out.println(result1);
	}
	
	public void 빼기(int price, int count) {
		System.out.println("뺴기 기능 처리 내용 구현");
		int result2 = price - count;
		System.out.println(result2);
}
	
	
	public void	곱하기(int price, int count) {
		System.out.println("곱하기 기능 처리 내용 구현");
		int result = price * count;
		System.out.println(result);
}
	
	public void 나누기(double price, double count) {
		System.out.println("나누기 기능 처리 내용 구현");
		double result3 = price / count;
		System.out.println(result3);
}
	
	public void order(String food) {
		System.out.println("당신이 주문한 것은 " + food + "입니다. ");
	}
	
	
	
	
	
	
	
	
	
	
	
}

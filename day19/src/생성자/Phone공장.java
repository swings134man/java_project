package 생성자;

public class Phone공장 {

	public static void main(String[] args) {
		
		Phone p1 = new Phone("sk", "011", "엄마");
		Phone p2 = new Phone("kt", "010", "아빠");
		
		System.out.println("엄마폰 " + p1);
		System.out.println("아빠폰 " + p2);
		//여기서 p1 은 주소값이 출력이되는데
		//toString으로 ("sk", "011", "엄마") 값을 출력할수
		//있게 해준다.
		// 즉 주소에 담겨있는 결과를 toString으로 string 값
		// 으로 만들어주는것. 
		
		
		
	}
}

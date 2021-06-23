package 연산자;

public class MyInfo {

	public static void main(String[] args) {

		// 나에 대한 정보 
		// 내이름, 내나이, 내키, 성별, 점심먹었나요?
		String name = "홍길동";	//스트링(문자열) 
		int age = 100;			//
		double weighgt = 99.9;	//
		char gender = 'c';		//
		Boolean food = true;	//false, 부울렌
		
		System.out.println(name);
		System.out.println(weighgt);
		System.out.println(age + 1);
		
		weighgt = weighgt - 10;		// 대입연산자=를사용하여 지정하지않으면 weight 변수에(RAM) 저장되지않는다. 
		System.out.println(weighgt);
		
	}

}

package 조건문;

public class 조건문1 {

	public static void main(String[] args) {

		//1. 입력
		int jumsu = 77;
		
		//2. 처리: 학점부여
		//결과를 담을 수있느 변수 필요
		// 변수를 선언할때는 초기값을 넣어줘야함.
		// 기본형이 아닐때는 null로 초기화 한다. 
		
		String result = null;	//변수의 초기화!!!!! , result 에는 하나의값만 들어감 .
		if (jumsu > 90) {
			result = "A학점";
		}else if (jumsu > 80) {
			result = "B학점";
		}else if (jumsu >= 70) {
			result = "C학점";
		}else {
			result = "D학점";
		}
		
		
		//3. 출력 
		
		System.out.println(result);
		
	}

}

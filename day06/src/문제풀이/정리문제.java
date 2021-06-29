package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {

		String food = "떡볶이";
		
		switch (food) {
		case "떡볶이":
			System.out.println("분식집으로");
			break;
		case "우동":
			System.out.println("일식집");
			break;
		case "짜장":
		System.out.println("중국집");
		break;
		default:
			System.out.println("집에서");
			break;
		}
		
		String sn = "970128-1037514";
		char gender = sn.charAt(7);	//'1' 
		
		//if ~else : char 는 기본데이터이기 떄문에 비교연산자 사용가능
		// char 이기떄문에 '' 사용
		if (gender == '1' || gender == '3') {
			System.out.println("남자");
		} else if(gender == '2' || gender == '4'){
			System.out.println("여자");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		switch (gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2':case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			break;
		}
		
		
		
	} //main
}

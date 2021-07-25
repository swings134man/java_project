package 꿀이라서열어봐야함ㅋㅋ;

import java.util.Iterator;
import java.util.Scanner;

public class 스트링을배열로문제풀이 {

	public static void main(String[] args) {

		// 전화번호 입력 >> 011-245-1234
		// 1. 양쪽 공백을 제거하시오.
		// 2. -을 기준으로 분리해내세요(String[])
		// 3. 첫번쨰 문자열이 011 이면 sk, 019 이면lg, 나머지이면 apple
		// 4. 두번쨰 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		// 5. 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효하지 않은 전화번호

		Scanner sc = new Scanner(System.in);

		System.out.println("전화번호 입력 >>>");
		String s = sc.nextLine();

		String s2 = s.trim();
		String[] s3 = s2.split("-");

		for (String a : s3) {
			if (a.equals("011")) {
				System.out.println("sk");
				break;
			} else if (a.equals("019")) {
				System.out.println("LG");
				break;
			} else {
				System.out.println("Apple");
				break;
			}
		} // foreach

		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		if (s2.length() >= 10) {
			System.out.println("유효한 전화번호.");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}

		
		String x = "나는 프로그래머야!";
		String x1 = "진짜!!";
		String x2 = "apple";
		
		System.out.println(x + x1);					//스트링 결합
		System.out.println(x.concat(x1));			//스트링 결합
		System.out.println(x.charAt(0));			//뮨저 1글자 추출
		System.out.println(x.endsWith("야"));		//특정한 문자로 끝나는 지 확인
		System.out.println(x.substring(3));			//인덱스 3이후 글자들 모두 추출
		System.out.println(x.substring(3, 8));		//인덱스 3~7까지 추출
		System.out.println(x.contains(x1));			// x에 x1이 포함되오 있는지
		System.out.println(x.lastIndexOf("프"));		//x중 프글자의 위치
		System.out.println(x2.toUpperCase());		//대문자로
		System.out.println(x2.toLowerCase());		//소문자로
		System.out.println(x.length());				//글자수?
		System.out.println(x.replace("나", "너")); 
		
		// trim사용 예제 
		String nn = " 에베베 약오르징.  ";
		String n2 = nn.trim();
		System.out.println(n2);
		
		
		String numm = "12345";
		
		
	}//main
}//class

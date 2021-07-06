package 문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {

		String[] subject = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 성적이 2학기 향상된 과목의 수를 카운트해보세요
		// 2. 성적이1,2학기 동일한 과목의 수를 카운트.
		// 3. 성적이1,2학기 동일한 과목명을 프린트 해보세요

		// Q1
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
		}
		System.out.println("성적이 향상된 과목 수는 : " + count);

		// Q2 && Q3
		int count1 = 0;
		int location = -1;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count1++;
				location = i;
			}
		}
		System.out.println("성적이 동일한 과목은 : " + count1);
		System.out.println(subject[location]); 		
		// location 에 변수 i 값을 넣어준후에 불러와서 한번에 해결 
		// 문제는 한개밖에 값을 지정할수 없는것. i 값이 0일때 값이 나오지않음(0만 나옴)
		// syso subject[location] 을 for문안에 if 문안에 넣는다.
		// int location = -1; 을 선언 절때 올수없는값을 지정하면 syso에서 찍히지않음. 
		if (location != -1) {
			System.out.println(subject[location]);
		}else {
			System.out.println("동일한 과목이 없습니다.");
		}
		
		
		// Q3
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				System.out.println("성적이 동일한 과목명은 : " + subject[i]);
			}
		}

	}// main
}// class

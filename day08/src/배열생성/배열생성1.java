package 배열생성;

public class 배열생성1 {

	public static void main(String[] args) {

		// Q1. 
		
		int[] s = new int[5];
		
		//Q2. 배열의 크기를 프린트
		System.out.println(s.length);
		
		//Q3. 배열의 첫번쨰 위치에 100을 넣어서, 프린트
		s[0] = 100;
		System.out.print(s[0]);
		
		System.out.println();
		//Q4. 배열의 마지막 위치에 500을 넣어서, 프린트
		s[s.length -1] = 500;		// 배열의 마지막 위치는 s.length -1 로 표기하는것이 좋다. 
//		s[4] = 500;
		System.out.print(s[4]);
		
		System.out.println();
		//Q5. 배열의 3번쨰 위치에 200을 넣어서, 프린트
		s[2] = 200;
		System.out.print(s[2]);
		
		System.out.println();
		//Q6. 배열의 전체 데이터를 프린트
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		//Q7. 배열의 전체 데이터를 인덱스와 함께프린트

		for (int i = 0; i < s.length; i++) {
			System.out.print(i + "번 배열:" + s[i]  + " "   );
		}
		
		
		
		
		
	}

}

package 알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 최소값구하기 {

	public static void main(String[] args) {

		Random r = new Random(100);
		int[] s = new int[10000];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000) + 1;		// +숫자는 숫자만큼최소값 이어서 최소값 ~1000
		}
		int min = s[0];		// 최소값 변수 선언, 첫번째 배열값 할당
		int count = 0;		//1이 몇개인가 ?
		//
		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {			//첫번쨰 값과 배열을 차례대로 비교
				min = s[i];				// min 보다 s[i] 가 작으면 min에 값을 넣음. 
			}
		}
		System.out.println(min);		//1
		String sum = "";
		
		//
		for (int i = 0; i < s.length; i++) {
			if (s[i] == min) {
				count++;
				sum += i + " ";
			}
		}
		System.out.println("최소값인 " + min + "의 개수는 " + count + "개 ");
		System.out.println(sum);
		
		//파괴함수를 써서 정렬후 최소값/최대값을 찾아보자. 
		Arrays.sort(s);
		System.out.println(s[0]);
		System.out.println(s[s.length-1]);
		
		
		
		
	}

}

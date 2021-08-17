package 자바기본;

import java.util.Iterator;

public class 문제5 {

	public static void main(String[] args) {

		
		int sum = 0;
		int i3 = 100;
		while (true) {
			i3++;
			sum += i3;
			if (i3 == 500) {
				break;
			}
		}
		System.out.println(sum);
		
		
	}

}

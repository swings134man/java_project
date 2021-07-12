package 메서드반환값;

import java.util.Random;

public class 다양한리턴사용2 {

	public static void main(String[] args) {

		
		다양한리턴사용22 r2 = new 다양한리턴사용22();
		int result = r2.get(100);		//result = 200
		System.out.println(result);
		
		double result2 = r2.get(); 		//result2 = 11.11;
		System.out.println(result2);
		
		int[] result3 = r2.get2(); 		// {10,20,30,40,50}
		for (int x : result3) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		Random ra = r2.get3();
		System.out.println(ra.nextInt());
		
		
		
	}

}

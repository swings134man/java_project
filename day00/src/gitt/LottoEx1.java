package gitt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class LottoEx1 {

	public static void main(String[] args) {

		
		HashSet set = new HashSet();
		Random r = new Random();				// 랜덤한 숫자 생성
		int[] lotto = new int[6];				// lotto 는 6자리의 숫자 
		int[] gumsa = new int[6]; 
		
//			for (int i = 0; i < 6; i++) {		// 
//				lotto[i] = r.nextInt(45) + 1;	// 0~44 의 값이 나오니까 +1 해줌. 
//			for (int j = 0; j < i; j++) {		// 
//				if (lotto[i] == lotto[j]) {
//					i--;
//				}
//			}
//		}
//		
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = r.nextInt(45) + 1;
//		}
//		
//		
//		for (int i = 0; i < lotto.length; i++) {
//			for (int j = 0; j < gumsa.length; j++) {
//				
//			}
//		}
//		
		
//			System.out.println("로또 번호는 !!");
//			Arrays.sort(lotto);
//			for (int i : lotto) {
//				System.out.print(i + "번  ");
//			}
			
			while (set.size() < 6) {
				int num = r.nextInt(45) +1; 
				System.out.println("랜덤값 : " + num);
				
				set.add(num);
				
			}
			System.out.println("번호는 : " + set);
			
			
			
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class 

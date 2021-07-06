package 문제풀이;

public class 참조형복사 {

	public static void main(String[] args) {

		
		//변수에 들어있는 주소를 복사 
		//얕은복사 = 주소만 복사 하기때문에 값이 그대로 있지 않고
		// 원본을그대로 복사함. 
		// 깊은복사 =  기본형복사처럼 클론으로 복사하는것. 
		
		
		
		int[] x = {1,2,3};
		int[] y = x;  	//참조형 복사 -> 얕은복사 : 주소만 복
//		int[] y =x.clone(); // 깊은복사 : 주소가 가르키는 값들의목록을 복사
	
		
		
		System.out.print("x : ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("Y: ");
		for (int j : y) {
			System.out.print(j + " ");
		}
		System.out.println("\n===원본 x 값 수정후===");
		
		x[0] = 9;
		System.out.print("x : ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("Y: ");
		for (int j : y) {
			System.out.print(j + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package 문제풀이;

public class 문제풀이1 {

	public static void main(String[] args) {

		String[] subject = {"국어","영어","수학","컴퓨터", "회화"};
		int[] term1 = {44,66,22,99,100};
		int[] term2 = term1.clone();
		
		term2[0] = 22;
		term2[2] = 88;

		//1
		for (int i : term1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : term2) {
			System.out.print(i + " ");
		}
		//2
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count++;
			}
		}
		System.out.println("\n동일 성적과목수 : " + count);
		//3
		int count1 = 0; 
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
				System.out.println("성적중 오른과목명 : " + subject[i]);
			}
		}
		System.out.println("오른 과목수 : " + count1);
		
		
		
		
		
		
		
	}

}

package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		
		// 1. 
		int cof = 5;
		int coprice = 5000;
		int total = cof * coprice;
		
		if (total > 20000) {
			JOptionPane.showMessageDialog(null, "할인해드릴게요.");	
		} else {
			JOptionPane.showMessageDialog(null, "총 커피값을 내세요.");
		}
		
		
		
		// 2. 
		int age = 100;
		int age2 = age + 1;
		JOptionPane.showMessageDialog(null, age2);
		
		if (age2 > 100) {
			JOptionPane.showMessageDialog(null, "이제부터 시작.");
		}else {
			JOptionPane.showMessageDialog(null, "아직 젊어요.");
		}
		
		//3. 
		
		int water = 1000;
		int mask = 2000; 
		
		System.out.println(water * 2);
		System.out.println(mask * 3);
		System.out.println((mask * 3) + (water * 2) );
		
		//4.
		for (int i = 0; i < 1000; i++) {
			System.out.println("나는 짱.");
		}
		
		//5. 
		
		int kor = 75;
		int math = 50;
		int avg = 2;
		int sum = kor + math;
		
		System.out.println(sum + "점 입니다.");
		System.out.println("평균은 " + sum / (double)avg + "점 입니다.");
		
		
	}

}

package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {

		Random r = new Random(4);
		int target = r.nextInt(100);

		while (true) { // 종료를 해주지않으면 무한루프임. 
			// 1. 입력을 받아라.
			// 2 숫자로 변환처리 해라.
			// 3. 정답인지 확인.
			// 4. 정답이면, 프로그램 종료
			// 정답이 아니면, 1로 가라!

			String a = JOptionPane.showInputDialog("숫자를 적어주시오 ");
			int a1 = Integer.parseInt(a);
			if (a1 == target) {
				JOptionPane.showMessageDialog(null, "정답입니다!!");
				break; // while break! , if 문은 알아서 멈춤.
//				System.exit(0); //에러뜨는 이유는 break와 같이있고 
			} else {
				JOptionPane.showMessageDialog(null, "정답이 아닙니다!!!");
				if (a1 > target) {
					System.out.println("너무 큽니다.");
				} else {
					System.out.println("너무 작습니다.");
				}
			} // if
		} // while
		System.out.println("게임이 모두 종료되었습니다.");
		
	}// main
}// class

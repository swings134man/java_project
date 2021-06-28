package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 아무거나 {

	public static void main(String[] args) {
		//new 벽돌처럼 사용할 때 ram에 새롭게 복사해서 
		//부품을 사용함. 
		//이프레임을 복사할거야 (변수명)에 ! 
		
		// util 폴더안에 편한게 많음 자주쓰게됨
	/*	
		Random r = new Random();
		JFrame f = new JFrame();
		JButton b1 = new JButton();
	*/
		Random r = new Random(4); //씨앗값(seed), random() 괄호안에 숫자는 고정값을 만들어줌.
		
		int num = r.nextInt(100);  // 0~ 99 까지랜덤 숫자 (이건 기본값이 0임)
		System.out.println(num);
		
		//Q. 50 보다 작은 임의의 수 생성
		int num1 = r.nextInt(50) + 5;
		// 0~44 (5~49)
		
		//Q. 1000 보다 작은 임의의 수 생성
		int num3 = r.nextInt(900) +100; //최소값을 만들어주는 방법 
		//0~899(100~~999) 까지 
		
		
		int num4 = r.nextInt(20) + 3;
		//3~22
		
		
	}// main
}//class

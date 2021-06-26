package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {

		
		String num1 = JOptionPane.showInputDialog("숫자1");
		String num2 = JOptionPane.showInputDialog("숫자2");
		
		int numm1 = Integer.parseInt(num1);
		int numm2 = Integer.parseInt(num2);
		

		System.out.println("더하기는 " + (numm1 + numm2));
		System.out.println("빼기는 " + (numm1 - numm2));
		
		
	}

}

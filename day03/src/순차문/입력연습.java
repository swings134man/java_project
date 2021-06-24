package 순차문;

import javax.swing.JOptionPane;

public class 입력연습 {	// input, 들어온다 뜻.

	public static void main(String[] args) {
		
		//String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		//System.out.println(name + "님 안녕히 가세요.");
	

		String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요");
		System.out.println("당신은 " + name + "님 안녕히가세요.");
		
		JOptionPane.showMessageDialog(null, name + "님 안녕히 가세요.");
		
		
		
	}

}

package 조건문;

import javax.swing.JOptionPane;

public class 조건문1 {

	public static void main(String[] args) {

		int temp = 25;
		if(temp > 27) {
			//조건이 true 이면 실행시키고 싶은 부분 코드 
			JOptionPane.showMessageDialog(null, "에어컨ON");
		}else {
			// 조건이 false 이면 실행시키고 싶은 부분 코드 
			JOptionPane.showMessageDialog(null, "에어컨OFF");
		} 
		
		
		
	}

}

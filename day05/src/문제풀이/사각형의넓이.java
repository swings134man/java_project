package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형의넓이 {

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("가로크기는?");
		String y = JOptionPane.showInputDialog("세로크기는?");
		
		double x2 = Double.parseDouble(x);
		double y2 = Double.parseDouble(y);
		
		double result =  x2 * y2;
		
		JOptionPane.showMessageDialog(null, "사각형의 넓이는 " + result + "입니다.");
		
		
		
	}

}

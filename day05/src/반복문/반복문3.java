package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {

		
		//시작값: 3
		//종료값: 10
		//3,4,~10
		
		String start = JOptionPane.showInputDialog("시작값");
		String	end = JOptionPane.showInputDialog("종료값");
 		
		int start1 = Integer.parseInt(start);
		int end1 = Integer.parseInt(end);
		
		int i = start1;
		while (i <= end1) { //조건식
			System.out.println(i);
			i++; //증감식
		}//for 
		
		
		
		
	}

}

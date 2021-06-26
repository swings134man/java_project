package 순차문;

import javax.swing.JOptionPane;


public class 순차문2 {

	public static void main(String[] args) {

		 
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?");
		
		// 2.처리, "금요일은 27.5도"
		int yes = 28; //어제온도
//		int temp2 = Integer.parseInt(temp); // 기본데이터만 casting 가능함.
		double temp3 = Double.parseDouble(temp);
		
		
//		int result = yes - temp2; 
		double result2 = yes - temp3;
		// string temp 를 int로 바꾸고 -> parseInt(분석), string을 기본데이터로 변환함. 
		//parsei 소괄호 안의 내용을 분석하여 int 로 변환.
		// 사용자로 하여금 숫자만 쓰도록 안내해야한다. "27도는 위의부품으로바꿀수없다"
		
		// 3.출력, sysout + cmd + spacebar
//		System.out.println(result + "도 차이가 나요.");
		System.out.println(result2 + "도 차이가 나요.");
		
		
	} //main
} //class 

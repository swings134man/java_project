package 조건문;

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			// ++, -- : 증감연산자, ram 의변수값을 1씩증가/감소시켜주는 처리
			//for (int i = 0; i < 3; i= i+1) {
			//for(시작값; 조건식; 증감식)
			
			// 1. 입력
			String data = JOptionPane.showInputDialog("점수를 입력하세요 ");
			// string-> int 로 변환해서 jumsu에 넣어준다.
			int jumsu = Integer.parseInt(data);

			// 2. 처리
			String result = null;
			if (jumsu >= 90) {
				result = "A학점";
			} else if (jumsu >= 80) {
				result = "B학점";
			} else if (jumsu >= 70) {
				result = "c학점";
			} else {
				result = "f학점";
			}

			// 3. 출력
			System.out.println("당신의 학점은 " + result);
			
		} // for
	} // main
}// class

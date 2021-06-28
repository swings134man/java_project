package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
		
		//1. 입력
		 String data = JOptionPane.showInputDialog("점수를 입력하세요 ");
		//string-> int 로 변환해서 jumsu에 넣어준다.
		 
		 int jumsu = Integer.parseInt(data);
		 
		 
		//2. 처리
		String result = null; //선언 : 램에 공간이 할당(4바이트)
		//처음에 공간을 할당할 떄 쓰레기값이 들어있는 공간이 할당이 됨.
		//쓰레기값은 프린트도 안되고, 연산도 불가능
		// 공간을 깨끗하게 비우는 작업을 처음에 초기에 해두는 것이 좋다.
		//변수의 초기화

		if (jumsu >= 90 ) {
			result = "A학점";
		}else if (jumsu >= 80) {
			result = "B학점";
		}else if (jumsu >= 70) {
			result = "c학점";
		}else  {
			result = "f학점";
		}
		
		//3. 출력
		System.out.println("당신의 학점은 " + result);
		
		
	} 
}

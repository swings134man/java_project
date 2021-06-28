package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class 랜덤문제1 {

	public static void main(String[] args) {

		
		   // Q.1 
		   
		  Random r = new Random(); 		// 무작위의 숫자 값을 생성
		  int r1 = r.nextInt(50); 		// 정수 r1을 선언하고 0부터 49의 랜덤숫자를 r1에 저장  
		  int r2 =r.nextInt(80);		// 정수 r2을 선언하고 0부터 79의 랜덤숫자를 r2에 저장
		  System.out.println(r1);		// 랜덤숫자 r1의 값 출력
		  System.out.println(r2);		// 랜덤숫자 r2 의 값 출력
		  if (r1 > r2 ) { System.out.println("첫번째가 더 커요!");  // 출력된 랜덤의 숫자를 비교 r1이 크면 syso 값 출력
		  } else if(r1 < r2 ) {									// r2가 더 크다면 else if안의 syso 값 출력
			  System.out.println("두번째가 더 커요!"); 
			  }else {
				System.out.println("동점입니다!");  // 두수의 숫자가 같을때 출력 값.
			  }// 1번문제 fin.
		 

		  
		// Q.2
		while (true) { 		// 무한루프이고 프로그래머가 정지를 원할때까지 반복하게 해줌.  
			String fi = JOptionPane.showInputDialog("게임을 계속하시습니까? 0: 계속, 1: 종료");		// 별도의 창에 질문을 띄우고 계속할지 말지 정수값을 입력하게함. 
			int fi2 = Integer.parseInt(fi);													// String 입력값을 int 로 변환해줌
			if (fi2 == 1) {
				JOptionPane.showMessageDialog(null, "게임을 중지합니다. ");						// 입력값이 1일때 프로그램을 중지함.
				break;
			} else if(fi2 == 0) {															// 입력값이 0일때 아래의 코드들을 실행함. 
				JOptionPane.showMessageDialog(null, "게임을 계속 합니다. ");						
				String a = JOptionPane.showInputDialog("1번 사람 숫자 입력");					// a 값 입력		
				String b = JOptionPane.showInputDialog("2번 사람 숫자 입력");					// b 값 입력
				int a1 = Integer.parseInt(a);												// 입력 값을 string -> int 로 변환
				int b1 = Integer.parseInt(b);												// 입력 값을 string -> int 로 변환
				if (a1 > b1) {																// a1이 클때 syso값 출력
					System.out.println("첫번쨰 사람 승! ");
				} else if (b1 > a1) {														// b1이 클때 syso값 출력
					System.out.println("두번쨰 사람 승!");
			} else {																		// 같은 숫자일때 무승부 메세지 
				System.out.println("비겼습니다! ");
			}
				
			}//else 
		}//while
	}//main
}//class


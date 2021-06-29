package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		//사원번호 입력 : 기103
		//사원번호 중  첫글자가 '기'인 경우 '기획부 이군요'
		//					'기'인 경우 '기획부 이군요'
		// 번호중 두번쨰 글자 1, 2'임원'
		//               3 부장
		//      		 4,5 평사원
		//				 나머지 해당 직급 없음
		
		//2. 나이 입력:2
		// 태어난 연도는 2020년 (date)이용
		//  태어난 시각 :10 
		// => 오전에 태어나셨군요 (오전,오후,밤,새벽)
		
		
		
		// Q1.
		//  첫번째
		String a = JOptionPane.showInputDialog("사원번호를 입력하세요.");
		
		char num1 = a.charAt(0);
		char num2 = a.charAt(1);
		
		if (num1 == '기') {
			System.out.println("기획부이군요");
		}else if(num1 == '인') {
			System.out.println("인사부이군요");
		}else {
			System.out.println("개발부이군요");
		}
		// 두번째
		if (num2 == '1') {
			System.out.println("임원");
		} else if(num2 == '3'){
			System.out.println("부장");
		}else if (num2 == '4' || num2 == '5') {
			System.out.println("사원");
		}else {
			System.out.println("해당 직급이 없음.");
		}
		
		// Q2.
		Date date = new Date();
		String age = JOptionPane.showInputDialog("나이를 입력");
		String hour = JOptionPane.showInputDialog("시간을 입력");

		int agee = Integer.parseInt(age);
		int hour11 = Integer.parseInt(hour);
		int year = date.getYear() + 1900;
		int year1 = year - agee + 1; 
		
		if (agee <= 0) {
			System.out.println("아직 태어나지 않았습니다.");
		} else {
			System.out.println("태어난 연도는 " + year1 + "입니다.");
		}
		//태어난 연도는 올해년도 - 나이 +1
		
		if (hour11 <= 12) {
			System.out.println("오전에 태어나셨군요");
		} else if(hour11 <= 20){
			System.out.println("오후에 태어나셨군요");
		}else if(hour11 <= 24) {
			System.out.println("밤에 태어나셨군요");
		}else {
			System.out.println("새벽에 태어나셨군요");
		}
		
		
		
		
		
	}//main
}//class

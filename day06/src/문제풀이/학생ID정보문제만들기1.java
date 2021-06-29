package 문제풀이;

import javax.swing.JOptionPane;

public class 학생ID정보문제만들기1 {

	public static void main(String[] args) {
		
		 // 1. 학생ID 입력: 정163
	      //    학생ID 중 첫글자가 '생'인경우 '생물학과입니다.'
	      //                 '물'인 경우 '물리학과입니다.'
	      //                 '화'인 경우 '화학과입니다.'
	      //                그 외의 경우 '이과대학이 아닙니다.'
	      //                   메세지가 뜨도록

	      // id 중 두번째, 세번째 글자의 조합이 '16'인 경우 '16학번입니다.'
	      //                              '17'인 경우 '17학번입니다.'
	      //                              '18'인 경우 '18학번입니다.'
	      //                              '19'인 경우 '19학번입니다.'
	      //                        그 외의 경우 '정확한 학번이 아닙니다.'
	      //                   메세지가 뜨도록

	      // id 중 네번째 숫자가 '1'인 경우 '1학년입니다.'
	      //                '2'인경우 '2학년입니다.'
	      //               '3'인경우 '3학년입니다.'
	      //               '4'인경우 '4학년입니다.'
	      //               그 외의 경우 '졸업생입니다.'
	      //                   메세지가 뜨도록
		//정163
		String id = JOptionPane.showInputDialog("id를 입력하세요!!");

		char a = id.charAt(0);
		String sub = id.substring(1, 3);
		char d = id.charAt(3);

		switch (a) {
		case '생':
			JOptionPane.showMessageDialog(null, "생물학과 입니다.");
			break;
			
		case '화':
			JOptionPane.showMessageDialog(null, "화학과 입니다.");
			break;
		case '물':
			JOptionPane.showMessageDialog(null, "물리학과 입니다.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "이과대학이 아닙니다.");
			break;
		}
		
		 switch (sub) {
	      case "16":
	         JOptionPane.showMessageDialog(null, "16학번입니다.");
	         break;
	      case "17":
	         JOptionPane.showMessageDialog(null, "17학번입니다.");
	         break;
	      case "18":
	         JOptionPane.showMessageDialog(null, "18학번입니다.");
	         break;
	      case "19":
	         JOptionPane.showMessageDialog(null, "19학번입니다.");
	         break;
	      default:
	         JOptionPane.showMessageDialog(null, "정확한 학번이 아닙니다.");
	         break;
	      }
	      
	      
	      switch (d) {
	      case '1':
	         JOptionPane.showMessageDialog(null, "1학년입니다.");;
	         break;
	         
	      case '2':
	         JOptionPane.showMessageDialog(null, "2학년입니다.");
	         break;
	         
	      case '3':
	         JOptionPane.showMessageDialog(null, "3학년입니다.");
	         break;
	         
	      case '4':
	         JOptionPane.showMessageDialog(null, "4학년입니다.");
	         break;

	      default:
	         JOptionPane.showMessageDialog(null, "졸업생입니다.");
	         break;
	      }

		
		
		
		
	}

}

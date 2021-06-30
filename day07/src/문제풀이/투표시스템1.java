package 문제풀이;

import javax.swing.JOptionPane;

public class 투표시스템1 {

	public static void main(String[] args) {
		
		int iu = 0, su = 0, be = 0;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("인기 투표하세요. (아이유:1, 수지:2, 비욘세:3)");
			
			switch (reply) {
			case "1":
				iu++;
				break;
			case "2":
				su++;
				break;
			case "3":
				be++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2,3 중에 하나만 숫자로만 입력하세요.");
				i--;
				count--;
				break;
			}//switch
			count++;
		}//for
		System.out.println("아이유: " + iu + "표.");
		System.out.println("수지: " + su + "표.");
		System.out.println("비욘세: " + be + "표.");
		System.out.println(count);
		
	
	}//main
}//class

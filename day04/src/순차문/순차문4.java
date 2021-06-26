package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		/*내가 먹고싶은 음식은? 팥빙수
		친구가 먹고싶은 음식은? 팥빙수
		아하! 나랑 친구랑 같아요!
		크~! 나랑 친구랑 달라요!
		*/
		
		String a = JOptionPane.showInputDialog("내가 먹고싶은 음식은?");
		String b = JOptionPane.showInputDialog("친구가 먹고싶은 음식은?");
		String aa = "팥빙수";
		String bb = "팥빙수";
		
		
		if (a.equals(aa) && b.equals(bb)) {
			JOptionPane.showMessageDialog(null, "아하! 나랑 친구랑 같아요!");
			System.out.println("아하! 나랑 친구랑 같아요!");
		} else {
			System.out.println("크~! 나랑 친구랑 달라요!");
			JOptionPane.showMessageDialog(null, "크~! 나랑 친구랑 달라요!");
		}
		
		
	} //main
} //class

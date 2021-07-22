package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우화면 {

	public static void main(String[] args) {

		JFrame f = new JFrame("생성자 테스트");
		f.setSize(300, 300);
		
		JButton b = new JButton("나는 버튼");
		f.add(b);
		
		JButton b2 = new JButton("나는 버튼2");
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b.setFont(font); //font는 참조형이기 때문에 주소값이 들어가있음. 
		b2.setFont(font);
		
//		b.setFont(new Font("굴림", Font.BOLD, 30));
		
		f.setVisible(true);
	}

}

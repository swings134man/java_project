package 그래픽프로그램;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		
		// flow 설정 
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		for (int i = 0; i < 300; i++) {
			JButton b1 = new JButton( (i + 1) + "번");		// b1이라는 버튼을 생성
			f.add(b1);		//f에 버튼 b1을 추가
		}
		
		
		
		
		
		
		f.setVisible(true);
		
		
		
	}

}

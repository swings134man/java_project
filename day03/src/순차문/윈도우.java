package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame(); 		//벽돌을 새로 만들어줌.나중에 new를 벽돌수만큼 만들어야함.(나중에 for문사용으로 해결함)
		f.setSize(1000, 800);			// 부품을 . 찍은후에 사용한것. 
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		b1.setText("나는 첫번째 버튼");
		b2.setText("나는 두번째 버튼");
		f.add(b1);
		f.add(b2);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); 					//null=없다는뜻.
		
		f.setVisible(true); //이 코드 밑으로는 인식하지 않음. (맨마지막줄로 가야함)
		
	}

}

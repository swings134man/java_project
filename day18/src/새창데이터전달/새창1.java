package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창1 {

	
	public void open1(String m) {
		
		JFrame f = new JFrame("새창1화면@@");
		f.setSize(500, 500);
		JButton b1 = new JButton(m + " 창 화면닫기");
		f.add(b1);
		b1.setBackground(Color.green);
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창1을 닫습니다.");
//				System.exit(0); 	// 프로그램 종료!!
				f.dispose();		// 이 프레임만 닫힘. <-> //새창만 닫힘. 
			}
		});
		
		
		
		f.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {

	
	public void open3(String id, String pw) {
		
		JFrame f = new JFrame("로그인 확인 화면");
		f.setSize(500, 500);
		if (id.equals("root") && pw.equals("pass")) {
			JButton b1 = new JButton(" 로그인 성공 ");
			f.add(b1);
			b1.setBackground(Color.green);
			b1.setOpaque(true);
			b1.setBorderPainted(false);
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "로그인 화면을 닫습니다. 화면을 클릭하면 종료");
//				System.exit(0); 	// 프로그램 종료!!
					f.dispose();		// 이 프레임만 닫힘. <-> //새창만 닫힘. 
				}
			});
		}else {
			JButton b2 = new JButton("로그인 실패! ");
			f.add(b2);
			b2.setBackground(Color.green);
			b2.setOpaque(true);
			b2.setBorderPainted(false);
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "창을 닫습니다 재시도 해주세요.");
					f.dispose();
				}
			});
			
		}
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

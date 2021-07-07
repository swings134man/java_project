package 그래픽문제;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pay {

	
	public void pay() {
		JFrame f = new JFrame("결제창");
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel label = new JLabel("결제 하시겠습니까?");
		f.add(label);
		
		JButton bb = new JButton("yes");
		bb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				Pay su = new Pay();
				one();	//호
			
			}
		});
		f.add(bb);
		
		JButton b1 = new JButton("no");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				Pay su1 = new Pay();
				two();
			}
		});
		f.add(b1);
		f.setVisible(true);
		
	}
	
	public void one() {
		JFrame f = new JFrame("success!!");
		f.setSize(300, 300);
		JButton b = new JButton("결제 성공!!");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				f.dispose();		// 현재 보이는창만 종료
				System.exit(0);		// 프로그램 아예종료
			}
		});
		f.add(b);
		f.setVisible(true);
	}
	public void two() {
		JFrame f = new JFrame("error!!!!");
		f.setSize(300, 300);
		JButton b = new JButton("결제 실패!! 처음부터 다시 예매하세요!!");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		f.add(b);
		f.setVisible(true);
		
		
	}
	
	
	
}

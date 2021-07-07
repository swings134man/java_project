package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽Solo {

	public static void main(String[] args) {

		JFrame f = new JFrame("영화예매 예약창");
		f.setSize(600, 1030);
		
		f.setTitle("현재 예매인원수 : " );
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int[] seat = new int[201];
		
		
		//버튼 200개 만들기
		for (int i = 1; i < seat.length; i++) {
			JButton b = new JButton(String.valueOf(i));
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				int s1 = Integer.parseInt(s); 
				
				seat[s1] = 1; 
				JOptionPane.showMessageDialog(f, s1 + "번 예약되었습니다.");
				
				b.setEnabled(false);
					b.setBackground(Color.red);
						b.setOpaque(true);
						b.setBorderPainted(false);
				}
			});
			
			f.add(b);
		}
		
		// 결제
		JButton b1 = new JButton("<<<<< 결제하기 >>>>>");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				final int PAY = 10000;
				int count = 0;
				String sum = "";
				
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						sum = sum + i + "번 ";
					}
				}//for 
				JOptionPane.showMessageDialog(f, "선택하신 좌석 번호는 " + sum);
				JOptionPane.showMessageDialog(f, "총금액은 " + (count * PAY) +"원 입니다.");
				
				// 
				Pay pay = new Pay();
				pay.pay();
			
			}
		});
		b1.setBackground(Color.orange);
			b1.setOpaque(true);
			b1.setBorderPainted(false);
		f.add(b1);
		
		// --------------------
		f.setVisible(true);
	} //main
}//class

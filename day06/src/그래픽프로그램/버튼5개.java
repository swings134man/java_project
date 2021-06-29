package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼5개 {

	public static void main(String[] args) {

			JFrame f = new JFrame("나의 버튼 5개");
			f.setSize(500, 500);
			f.getContentPane().setLayout(new BorderLayout(0, 0));
			
			JButton btnNewButton = new JButton("북쪽");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "북쪽입니다."); 
					
				}
			});
			btnNewButton.setBackground(Color.ORANGE);
			btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
			
			JButton btnNewButton_1 = new JButton("서쪽");
			btnNewButton_1.setBackground(Color.CYAN);
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
			
			JButton btnNewButton_2 = new JButton("가운데");
			btnNewButton_2.setBackground(Color.ORANGE);
			btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
			
			JButton btnNewButton_3 = new JButton("동쪽");
			btnNewButton_3.setBackground(Color.CYAN);
			btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
			
			JButton btnNewButton_4 = new JButton("남쪽");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "남쪽입니다.");
				}
			});
			btnNewButton_4.setBackground(Color.ORANGE);
			btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
			// set 의 반대 get. set 은 void. get은 return값이 있으므로 void가 없음.
			
			
			
			
			f.setVisible(true);
		
	}
}

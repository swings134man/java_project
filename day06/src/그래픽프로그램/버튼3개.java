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

public class 버튼3개 {

	public static void main(String[] args) {

			JFrame f = new JFrame("나의 버튼 5개");
			f.getContentPane().setBackground(Color.ORANGE);
			f.setSize(500, 500);
			f.getContentPane().setLayout(null);		// 지정하지 않겠다. 내가원하는 위치에 넣을수있음(x,y)
			// layout을 지정하지 않으면 내가 넣고싶은 위치에 넣을수있다.

			
			JButton btnNewButton = new JButton("별 10개");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < 10; i++) {
						System.out.print("*");
					}
					System.out.println(); 		//공백하면 엔터 쳐진것 처럼됨

				}
			});
			btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			btnNewButton.setBounds(124, 82, 260, 64);
			f.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("커피*5");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < 5; i++) {
						System.out.print("커피*");
					}
					System.out.println();
					 
					
				}
			});
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			btnNewButton_1.setBounds(124, 170, 260, 64);
			f.getContentPane().add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("커피*우유3");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < 3; i++) {
						System.out.println("커피*우유");
					}
				}
			});
			btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			btnNewButton_2.setBounds(124, 259, 260, 64);
			f.getContentPane().add(btnNewButton_2);
			
			JButton btnNewButton_2_1 = new JButton("1:짱!");
			btnNewButton_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < 4; i++) {
						System.out.println((i+1) + ": 짱!");
					}
				}
			});
			btnNewButton_2_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
			btnNewButton_2_1.setBounds(124, 342, 260, 64);
			f.getContentPane().add(btnNewButton_2_1);
			
			
			
			
			
			
			f.setVisible(true);
		
	}
}

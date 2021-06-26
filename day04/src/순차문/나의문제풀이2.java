package 순차문;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 나의문제풀이2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		
		JFrame f = new JFrame(); 		
		f.getContentPane().setBackground(new Color(224, 255, 255));
		f.setSize(1000, 800);			
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고싶은 음식");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(71, 43, 218, 52);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는?");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(71, 203, 218, 52);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어점수");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(71, 369, 218, 52);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학점수");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(71, 463, 218, 52);
		f.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBackground(new Color(250, 250, 210));
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t1.setBounds(445, 43, 297, 52);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(250, 250, 210));
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t2.setColumns(10);
		t2.setBounds(445, 203, 297, 52);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(255, 140, 0));
		t3.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t3.setColumns(10);
		t3.setBounds(445, 369, 297, 52);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(new Color(255, 160, 122));
		t4.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t4.setColumns(10);
		t4.setBounds(445, 463, 297, 52);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("차")) {
					JOptionPane.showMessageDialog(btnNewButton, "카페로가자");
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "편의점가자");
				}
				
			}
		});
		btnNewButton.setBounds(196, 107, 509, 43);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년나이는?");
		btnNewButton_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int age = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(btnNewButton_1, age + 1);
				
				
			}
		});
		btnNewButton_1.setBounds(196, 277, 509, 43);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두과목의 평균은?");
		btnNewButton_2.setBackground(new Color(255, 228, 196));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				int a1 = Integer.parseInt(s3);
				int a2 = Integer.parseInt(s4);
				int total = a1 + a2;
				double avg = total / 2.0;
				JOptionPane.showMessageDialog(btnNewButton_2, avg);
				
				
			}
		});
		btnNewButton_2.setBounds(196, 525, 509, 43);
		f.getContentPane().add(btnNewButton_2);
	
		
		
		
		f.setVisible(true); 		
		
	}

}

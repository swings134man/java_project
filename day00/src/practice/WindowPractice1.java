package practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowPractice1 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("계산기 연습");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel.setBounds(21, 33, 256, 59);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1 입력");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1.setBounds(21, 167, 256, 59);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("숫자2 입력");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_2.setBounds(21, 246, 256, 59);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setForeground(Color.ORANGE);
		t1.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		t1.setBounds(289, 173, 293, 59);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.ORANGE);
		t2.setBackground(Color.LIGHT_GRAY);
		t2.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		t2.setColumns(10);
		t2.setBounds(289, 246, 293, 59);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String se1 = t1.getText();
				String se2 = t2.getText();
				int re1 = Integer.parseInt(se1);
				int re2 = Integer.parseInt(se2);
				int re3 = re1 + re2;
				JOptionPane.showMessageDialog(btnNewButton, re3);
				
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton.setBounds(21, 435, 196, 69);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("뺴기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String se1 = t1.getText();
				String se2 = t2.getText();
				int re1 = Integer.parseInt(se1);
				int re2 = Integer.parseInt(se2);
				int re3 = re1 - re2;
				JOptionPane.showMessageDialog(btnNewButton, re3);
			}
		});
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(289, 435, 196, 69);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("곱하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String se1 = t1.getText();
				String se2 = t2.getText();
				int re1 = Integer.parseInt(se1);
				int re2 = Integer.parseInt(se2);
				int re3 = re1 * re2;
				JOptionPane.showMessageDialog(btnNewButton, re3);
			}
		});
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(563, 435, 196, 69);
		f.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
	}//main
}//class

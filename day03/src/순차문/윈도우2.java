package 순차문;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame(); 	
		f.setSize(500, 500);			 
		f.getContentPane().setLayout(null);
		
		//공부해야될것
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저를 누르셨군요");			// 콘솔창에만 출
				JOptionPane.showMessageDialog(f, "저를 누르셨군요"); // Jframe 이라는 가상의 화면에출력 ,출력용은 입력란이 2개
				
			}
		});
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setFont(new Font("Luminari", Font.PLAIN, 13));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(180, 123, 151, 53);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저도 누르셨군요");
				JOptionPane.showMessageDialog(f, "저도 누르셨군요");
			}
		});
		btnNewButton_1.setFont(new Font("LiSong Pro", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(180, 207, 151, 53);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(178, 332, 184, 47);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(30, 339, 114, 39);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(30, 400, 114, 39);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(180, 391, 184, 39);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		f.setVisible(true); 
		
	}
}

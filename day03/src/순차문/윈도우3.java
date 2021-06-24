package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우3 {
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;

	public static void main(String[] args) {
		JFrame f = new JFrame(); 		
		f.getContentPane().setBackground(Color.GRAY);
		f.setSize(500, 500);			 
		f.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 135, 290, 26);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("번호");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel.setBounds(59, 138, 38, 16);
		f.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(109, 160, 290, 26);
		f.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("날짜");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(59, 163, 38, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(109, 191, 290, 26);
		f.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("제목");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(59, 194, 38, 16);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.PINK);
		textField_4.setBounds(109, 229, 290, 187);
		f.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("내용");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(59, 313, 38, 16);
		f.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저장 성공!");
				JOptionPane.showMessageDialog(f, "저장 성공!");
				
			}
		});
		btnNewButton.setBounds(72, 428, 101, 29);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.setBounds(185, 428, 101, 29);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("잠깐저장");
		btnNewButton_2.setBounds(298, 428, 101, 29);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("나의 일기장");
		lblNewLabel_4.setBackground(Color.ORANGE);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
		lblNewLabel_4.setBounds(147, 16, 190, 65);
		f.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("<<<<<<<<<<<<<<<오늘의 일기작성을 시작합니다.>>>>>>>>>>>>>>>>");
		lblNewLabel_5.setBounds(28, 103, 455, 16);
		f.getContentPane().add(lblNewLabel_5);
		
		f.setVisible(true); 
		
	}

}

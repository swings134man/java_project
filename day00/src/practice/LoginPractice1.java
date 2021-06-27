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

public class LoginPractice1 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("로그인 test01");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 33));
		lblNewLabel.setBounds(0, 0, 600, 82);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1.setBounds(25, 208, 135, 48);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(25, 290, 135, 48);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		t1.setBounds(172, 208, 288, 48);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		t2.setColumns(10);
		t2.setBounds(172, 290, 288, 48);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = t1.getText();
				String b = t2.getText();
				
				String log1 = "ID1";
				String log2 = "PW1";
				
				if (a.equals(log1) && b.equals(log2)) {
					JOptionPane.showMessageDialog(btnNewButton, "login 성공!!");
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "id, 혹은 password가 틀립니다,");
				}
			}
		});
		btnNewButton.setBounds(154, 414, 282, 48);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
	}

}

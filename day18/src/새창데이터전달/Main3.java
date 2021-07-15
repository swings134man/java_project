package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main3 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t11;
	private static JTextField t22;
	private static JTextField t33;

	public static void main(String[] args) {

		JFrame f = new JFrame("main창 여기서 시작.");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel.setBounds(26, 38, 70, 56);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblPw.setBounds(26, 115, 70, 56);
		f.getContentPane().add(lblPw);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 온도는");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(26, 326, 109, 56);
		f.getContentPane().add(lblNewLabel_2);
		
		t11 = new JTextField();
		t11.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		t11.setBounds(129, 56, 254, 38);
		f.getContentPane().add(t11);
		t11.setColumns(10);
		
		t22 = new JTextField();
		t22.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		t22.setColumns(10);
		t22.setBounds(129, 133, 254, 38);
		f.getContentPane().add(t22);
		
		t33 = new JTextField();
		t33.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		t33.setColumns(10);
		t33.setBounds(147, 344, 254, 38);
		f.getContentPane().add(t33);
		
		
		JButton b11 = new JButton("로그인처리");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t11.getText();
				String pw = t22.getText();
				새창3 w1 = new 새창3();
				w1.open3(id, pw);
			}
		});
		b11.setBounds(123, 183, 217, 56);
		f.getContentPane().add(b11);
		
		JButton b22 = new JButton("결정");
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = t33.getText();
				int temp2 = Integer.parseInt(temp);
				
				새창4 w1 = new 새창4();
				w1.open4(temp2);
			}
		});
		b22.setBounds(129, 410, 217, 56);
		f.getContentPane().add(b22);
		
		
		
		
		
		f.setVisible(true);
	}// main
}// class


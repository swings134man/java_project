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

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {

		JFrame f = new JFrame("main창 여기서 시작.");
		f.setSize(500, 500);
		Font font = new Font("궁서", Font.BOLD, 45);
		
		
		t1 = new JTextField();
		t1.setBackground(Color.MAGENTA);
		t1.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		t1.setBounds(120, 6, 259, 62);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		f.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		t2.setColumns(10);
		t2.setBackground(Color.MAGENTA);
		t2.setBounds(120, 70, 259, 62);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		lblNewLabel.setBounds(6, 6, 92, 62);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		lblPw.setBounds(6, 70, 92, 62);
		f.getContentPane().add(lblPw);
		
		t3 = new JTextField();
		t3.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		t3.setColumns(10);
		t3.setBackground(Color.MAGENTA);
		t3.setBounds(164, 310, 259, 62);
		f.getContentPane().add(t3);
		
		JLabel lblPw_1 = new JLabel("오늘의 온도");
		lblPw_1.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		lblPw_1.setBounds(6, 310, 146, 62);
		f.getContentPane().add(lblPw_1);
		
		String id = t1.getText();
		String pw = t2.getText();
		
		
		JButton b1 = new JButton("로그인처리");
		b1.setBounds(120, 144, 259, 62);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				새창3 w1 = new 새창3();
				w1.open3(id, pw);
				
			}
		});
		
		f.getContentPane().add(b1);
		
		
		
		String temp = t3.getText();
		int temp2 = Integer.parseInt(temp);
		
		JButton b3 = new JButton("결정!");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창4 w4 = new 새창4();
				w4.open4(temp2);
				
			}
		});
		b3.setFont(new Font("Dialog", Font.BOLD, 45));
		b3.setBounds(164, 386, 259, 62);
		f.getContentPane().add(b3);
		
		
		
		b1.setFont(font);
		b3.setFont(font);
		
		f.setVisible(true);
	}// main
}// class


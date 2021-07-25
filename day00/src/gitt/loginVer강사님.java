package gitt;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginVer강사님 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		
		String id = "root";
		String pw = "1234";
		
		
		
		
		
		// 화면 창
		JFrame f = new JFrame();
		f.setSize(800, 800);
		f.getContentPane().setLayout(null);
		
		
		JLabel la1 = new JLabel("아이디:");
		la1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		la1.setBounds(33, 127, 177, 61);
		f.getContentPane().add(la1);
		
		JLabel la2 = new JLabel("패스워드:");
		la2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		la2.setBounds(33, 228, 177, 61);
		f.getContentPane().add(la2);
		
		JLabel result = new JLabel("로그인 실패");
		result.setForeground(Color.RED);
		result.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		result.setBounds(33, 484, 177, 61);
		f.getContentPane().add(result);
		result.setText(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		t1.setBounds(243, 127, 312, 61);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		t2.setColumns(10);
		t2.setBounds(243, 228, 312, 61);
		f.getContentPane().add(t2);
		
		JButton bt1 = new JButton("로그인확인");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tt1 = t1.getText();
				String tt2 = t2.getText();
				
				if (id.equals(tt1) && pw.equals(tt2)) {
					result.setText("로그인 성공");
				}else if(!id.equals(tt1) || !pw.equals(tt2)){
					result.setText("로그인 실패");
				}
			}
		});
		bt1.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		bt1.setBounds(127, 379, 214, 76);
		f.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("지우기");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				
			}
		});
		bt2.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		bt2.setBounds(406, 379, 214, 76);
		f.getContentPane().add(bt2);
		
		
		
		
		
		f.setVisible(true);
		
		
		
		
	}
}

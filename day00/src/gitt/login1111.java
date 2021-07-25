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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login1111 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		
		String id = "root";
		String pw = "1234";
		
		// 화면 창
		JFrame f = new JFrame("로그인 처리 화면");
		f.getContentPane().setBackground(Color.ORANGE);
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
		
		JLabel la3 = new JLabel("로그인 실패");
		la3.setForeground(Color.RED);
		la3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		la3.setBounds(33, 484, 177, 61);
		f.getContentPane().add(la3);
		la3.setText(null);
		
		t1 = new JTextField();
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t1.setText("");
				
			}
		});
//		t1.addKeyListener(new KeyAdapter() {			// 여기부터
//			@Override
//			public void keyPressed(KeyEvent e) {
//				int key = e.getKeyCode();				// enter 를 쳤을때 t1 필드안에 글자가없어짐!
//				if(key == KeyEvent.VK_ENTER) {
//					t1.setText("");
//				}
//			}
//		});												// 여기까지
		
		t1.setText("아이디를 입력하세요.");
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		t1.setBounds(222, 127, 312, 61);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.addMouseListener(new MouseAdapter() {			// 여기부터
			@Override
			public void mouseClicked(MouseEvent e) {		// 마우스 클릭했을때(특정위치에), t2에 텍스트가 null값으로 사라짐. 
				t2.setText("");
			}
		});													// 여기까지
		t2.setText("패스워드를 입력하세요.");
		t2.setBackground(Color.LIGHT_GRAY);
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		t2.setColumns(10);
		t2.setBounds(222, 228, 312, 61);
		f.getContentPane().add(t2);
		
		JButton bt1 = new JButton("로그인확인");
		//여기 밑에 저장해야댐
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tt1 = t1.getText();
				String tt2 = t2.getText();
				
				if (id.equals(tt1) && pw.equals(tt2)) {
					JOptionPane.showMessageDialog(bt1, "로그인 성공!!");
					la3.setText(""); 
				}else {
					JOptionPane.showMessageDialog(bt1, "로그인 실패!!");
					la3.setText("로그인 실패!!"); 
//					!id.equals(tt1) || !pw.equals(tt2)
					
				}
			}
		});
		bt1.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		bt1.setBounds(127, 379, 214, 76);
		f.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("지우기");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				
			}
		});
		bt2.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		bt2.setBounds(406, 379, 214, 76);
		f.getContentPane().add(bt2);
		
		
		f.setVisible(true);

	}//main
}//class

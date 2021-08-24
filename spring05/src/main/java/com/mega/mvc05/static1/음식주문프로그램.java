package com.mega.mvc05.static1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	private static JTextField count;
	static int sum;
	//main 이 static이므로, 객체생성하지 않아도 접근이 가능한 변수여야 한다.
	//main안에서 사용하는 전역변수는 반드시 static으로 만들어주어야 한다.
	final static int price = 5000; //상수 
	static int total;

	public static void main(String[] args) {

		// main이 static인 이유는
		// 객체생성하지 않아도 main 부터 시작하기 때문 
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수 :");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(414, 30, 61, 25);
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField();
		count.setForeground(Color.BLUE);
		count.setBackground(Color.ORANGE);
		count.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		count.setBounds(478, 6, 210, 67);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("우동.png"));
		img.setBounds(307, 132, 291, 248);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(Color.RED);
		result.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		result.setBounds(35, 380, 654, 67);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("우동");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("우동.png");
				img.setIcon(icon);
				total += price;
				result.setText("결제금액은 : " + total + "원");
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		btnNewButton.setBounds(6, 19, 110, 75);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("짬뽕");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("짬뽕.png");
				img.setIcon(icon);
				total += price;
				result.setText("결제금액은 : " + total + "원");
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		btnNewButton_1.setBounds(142, 19, 110, 75);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("짜장.png");
				img.setIcon(icon);
				total += price;
				result.setText("결제금액은 : " + total + "원");
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		btnNewButton_2.setBounds(274, 19, 110, 75);
		f.getContentPane().add(btnNewButton_2);
		
		
		
		f.setVisible(true);
	}//main
}//class

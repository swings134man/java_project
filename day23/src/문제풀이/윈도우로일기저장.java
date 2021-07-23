package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 윈도우로일기저장 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {

		JFrame f = new JFrame("이것은 일기장이여.");
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(50, 90, 148, 43);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(50, 158, 148, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(50, 303, 148, 43);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(222, 90, 249, 43);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(222, 158, 249, 43);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(222, 303, 249, 135);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String day = t1.getText();
				String title = t2.getText();
				String con = t3.getText();
				try {
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(con);
					file.close();
					JOptionPane.showMessageDialog(f, "일기가 저장됬습니다.");
					
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(f, "에러발생 삐빅.");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton.setBounds(160, 478, 261, 57);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}

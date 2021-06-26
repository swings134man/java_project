package 순차문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel.setBounds(53, 150, 106, 59);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel_1.setBounds(53, 243, 106, 59);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		t1.setBounds(222, 150, 186, 59);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(222, 243, 186, 59);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int a1 = Integer.parseInt(s1);
				int a2 = Integer.parseInt(s2);
				
				int result = a1 + a2;
//				int result1 = a1 - a2;
				
				
				JOptionPane.showMessageDialog(btnNewButton, result);
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		btnNewButton.setBounds(53, 378, 158, 59);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int a1 = Integer.parseInt(s1);
				int a2 = Integer.parseInt(s2);
				
				int result1 = a1 - a2;
				
				
				JOptionPane.showMessageDialog(btnNewButton, result1);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		btnNewButton_1.setBounds(250, 378, 158, 59);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		f.setVisible(true);
	}

}

package sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;

public class MyWindowSample1 {
	private static JTable table;
	private static JTable table_1;
	private static JTable table_2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1200, 1000);
		f.getContentPane().setLayout(null);
		
		
		
		String[] title = {"컴퓨터", "영어", "수학","체육"};
		
		String[][] contents = {
				{"100", "48", "23","15"},
				{"85", "28", "28","14"},
			
		};
		
	
		
		JLabel lblNewLabel = new JLabel("상품주문/결제");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 41));
		lblNewLabel.setBounds(44, 40, 296, 88);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("----------------------------------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		lblNewLabel_1.setBounds(25, 112, 1145, 44);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("구매자 정보");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_2.setBounds(44, 140, 171, 54);
		f.getContentPane().add(lblNewLabel_2);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setCellSelectionEnabled(true);
		//
		JTable table = new JTable(contents, title);
		f.getContentPane().add(table);
		
		// 
		table.setBounds(44, 218, 1059, 141);
		f.getContentPane().add(table);
		
		JLabel lblNewLabel_2_1 = new JLabel("상품 정보");
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(44, 371, 171, 54);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("결제 정보");
		lblNewLabel_2_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(44, 608, 171, 54);
		f.getContentPane().add(lblNewLabel_2_1_1);
		
		table_1 = new JTable();
		table_1.setCellSelectionEnabled(true);
		table_1.setBackground(Color.LIGHT_GRAY);
		table_1.setBounds(44, 415, 1059, 184);
		f.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setCellSelectionEnabled(true);
		table_2.setBackground(Color.LIGHT_GRAY);
		table_2.setBounds(44, 660, 1059, 184);
		f.getContentPane().add(table_2);
		
		JButton btnNewButton = new JButton("취소");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnNewButton.setBounds(346, 885, 237, 65);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("결제하기");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnNewButton_1.setBounds(713, 885, 237, 65);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}//main
}//class

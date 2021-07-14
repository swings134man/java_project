package db연결;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class TestPro1 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(800, 800);
		f.getContentPane().setLayout(null);
		
		JLabel la1 = new JLabel("대인");
		la1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		la1.setBounds(157, 139, 60, 82);
		f.getContentPane().add(la1);
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1명", "2명", "3명", "4명", "5명", "6명", "7명", "8명", "9명", "10명"}));
		comboBox_1.setBounds(280, 162, 135, 40);
		f.getContentPane().add(comboBox_1);
		
		JLabel la2 = new JLabel("소인");
		la2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		la2.setBounds(165, 318, 52, 82);
		f.getContentPane().add(la2);
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"0명", "1명", "2명", "3명", "4명", "5명", "6명", "7명", "8명", "9명", "10명"}));
		comboBox_1_1.setBounds(260, 341, 135, 40);
		f.getContentPane().add(comboBox_1_1);
		
		
		
		
		
//		JLabel lblNewLabel_1_1_1 = new JLabel("대인");
//		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
//		lblNewLabel_1_1_1.setBounds(514, 595, 51, 45);
//		f.getContentPane().add(lblNewLabel_1_1_1);
//		
//		JComboBox comboBox_1 = new JComboBox();
//		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1명", "2명", "3명", "4명", "5명", "6명", "7명", "8명", "9명", "10명"}));
//		comboBox_1.setBounds(561, 596, 135, 40);
//		f.getContentPane().add(comboBox_1);
//		
//		JLabel lblNewLabel_1_1_1_1 = new JLabel("소인");
//		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
//		lblNewLabel_1_1_1_1.setBounds(830, 595, 51, 45);
//		f.getContentPane().add(lblNewLabel_1_1_1_1);
//		
//		JComboBox comboBox_1_1 = new JComboBox();
//		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"0명", "1명", "2명", "3명", "4명", "5명", "6명", "7명", "8명", "9명", "10명"}));
//		comboBox_1_1.setBounds(877, 598, 135, 40);
//		f.getContentPane().add(comboBox_1_1);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}

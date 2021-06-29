package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {

			JFrame f = new JFrame("나의 버튼 5개");
			f.getContentPane().setBackground(Color.WHITE);
			f.setSize(500, 500);
			f.getContentPane().setLayout(null);
			
			JButton b = new JButton("");
			b.setBackground(Color.LIGHT_GRAY);
			b.setBounds(81, 32, 340, 78);
			f.getContentPane().add(b);
			
			JLabel m = new JLabel("");
			m.setBackground(Color.LIGHT_GRAY);
			m.setBounds(81, 147, 337, 169);
			f.getContentPane().add(m);		//add 라는것으로 추가해줌.
			
			ImageIcon car1 = new ImageIcon("car1.png");		//image 1개당 따로 따로 만들어줘야함
			ImageIcon car2 = new ImageIcon("car2.png");
			b.setIcon(car1);
			m.setIcon(car2);
			
			
			
			
			f.setVisible(true);
		
	}
}

package sample;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exa1 {

	public static void main(String[] args) {

		JFrame f1 = new JFrame();
		f1.setSize(800, 450);
		f1.getContentPane().setLayout(null);
		
		JButton b12 = new JButton("창닫기");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.dispose();
			}
		});
		b12.setBounds(290, 286, 187, 52);
		f1.getContentPane().add(b12);
		
		
		
		
		
		
		f1.setVisible(true);
	}

}

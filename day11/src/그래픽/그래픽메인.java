package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽메인 {

	public static void main(String[] args) {

		
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		
		JButton b1 = new JButton("나는 왼쪽");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UP left =new UP();
				left.left();
				
				
			}
		});
		JButton b2 = new JButton("나는 오른쪽");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UP right = new UP();
				right.right();
			}
		});
		JButton b3 = new JButton("나는 가운데");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UP center = new UP();
				center.right();
			}
		});
		JButton b4 = new JButton("나는 아랫쪽");
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UP down = new UP();
				down.right();
			}
		});
		JButton b5 = new JButton("나는 윗쪽");
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1 을 눌렀을  때 처리하는 내용을 쓴다. 
				UP up = new UP();
				up.up();
				
			}
		});
		f.add(b1, BorderLayout.WEST);
		f.add(b2,BorderLayout.EAST);
		f.add(b3,BorderLayout.CENTER);
		f.add(b4,BorderLayout.SOUTH);
		f.add(b5,BorderLayout.NORTH);
		
		b1.setBackground(Color.orange);
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		
		b2.setBackground(Color.pink);
		b2.setOpaque(true);
		b2.setBorderPainted(false);
		
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setOpaque(true);
		b3.setBorderPainted(false);
		
		b4.setBackground(Color.green);
		b4.setOpaque(true);
		b4.setBorderPainted(false);
		
		b5.setBackground(Color.BLUE);
		b5.setOpaque(true);
		b5.setBorderPainted(false);
		
		Font font = new Font("궁서", Font.BOLD, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
		
		
	}

}

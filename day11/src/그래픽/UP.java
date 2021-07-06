package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UP {

	public void up() {
		
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요,,");
		f.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UP one = new UP();
				one.one();
			}
		});
		f.setVisible(true);
	}
	
	public void left() {
		JFrame f = new JFrame("래프트프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요,,");
		f.add(b);
		f.setVisible(true);
		
	}
	
	public void right() {
		JFrame f = new JFrame("오른쪽프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요,,");
		f.add(b);
		f.setVisible(true);
		
	}public void down() {
		JFrame f = new JFrame("아래프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요,,");
		f.add(b);
		f.setVisible(true);
		
	}public void center() {
		JFrame f = new JFrame("센터프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요,,");
		f.add(b);
		f.setVisible(true);
		
	}
	
	public void one() {
		JFrame f = new JFrame("창속의 창");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌렀네!");
		f.add(b);
		f.setVisible(true);
		
		
	}
	
	
	
	
	
}//class

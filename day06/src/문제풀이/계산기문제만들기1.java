package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기문제만들기1 {
	private static JTextField t1;

	public static void main(String[] args) {

		/* q.계산기 만들기  
		 * 1. 계산기 모양을 만들고
		 * 2. 텍스트 입력창 1개
		 * 3. 평수에서 -> 제곱미터로, 제곱미터에서 ->평수로 바꾸는 버튼을 만들어라.
		 * 평수 -> 제곱미터는 * 3.3, 제곱미터에서 -> 평수는 /3.3 이다. 
		 * 
		 */
		// 게산기
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("평수 계산기");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 34));
		lblNewLabel.setBounds(33, 36, 216, 49);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("숫자 입력 ");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1.setBounds(33, 207, 142, 34);
		f.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setBounds(215, 207, 371, 42);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JButton b1 = new JButton("평수로");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				double num = Double.parseDouble(s1);
				double result1 = num / 3.3;
				JOptionPane.showMessageDialog(b1, result1 + "평 입니다.");
			}
		});
		b1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b1.setBounds(113, 369, 204, 62);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("제곱미터로");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t1.getText();
				double num1 = Double.parseDouble(s2);
				double result2 = num1 * 3.3;
				JOptionPane.showMessageDialog(b1, result2 + "제곱미터 입니다.");
			}
		});
		b2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b2.setBounds(436, 369, 204, 62);
		f.getContentPane().add(b2);

		f.setVisible(true);
	}
}

package pack04;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test04 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame();									// jframe 생성
		f.setSize(500, 500);										// 사이즈를 지정
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel.setBounds(53, 150, 106, 59);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel_1.setBounds(53, 243, 106, 59);
		f.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();									//숫자1 입력창
		t1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		t1.setBounds(222, 150, 186, 59);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();									// 숫자2 입력창
		t2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(222, 243, 186, 59);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("더하기");				//더하기 버튼을 눌렀을때
		btnNewButton.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {		// 클릭했을때의 실행될 코드
				String s1 = t1.getText();						// 숫자1에서 숫자를 가져온다
				String s2 = t2.getText();						// 숫자2에서 숫자를 가져온다
				int a1 = Integer.parseInt(s1);					// 숫자1을 string -> int 로 변환
				int a2 = Integer.parseInt(s2);					// 숫자2를 string -> int 로 변환

				int result = a1 + a2;							// int 값으로 두숫자를 더한다.
				
//						int result1 = a1 - a2;

				JOptionPane.showMessageDialog(btnNewButton, result); //결과값을 joption으로 출력
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		btnNewButton.setBounds(53, 378, 158, 59);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("빼기");				//빼기 버튼을 눌렀을때
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// 실행될코드
				String s1 = t1.getText();						//	숫자1 저장
				String s2 = t2.getText();						//	숫자2 저장
				int a1 = Integer.parseInt(s1);					//	숫자1을 int 로 변환
				int a2 = Integer.parseInt(s2);					// 	숫자2를 int 로 변환

				int result1 = a1 - a2;							// 2개의 변수 - 연산

				JOptionPane.showMessageDialog(btnNewButton, result1);	// 결과값 출력

			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		btnNewButton_1.setBounds(250, 378, 158, 59);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel la5 = new JLabel("");											// 이미지를 위한 라밸생성
		la5.setBounds(53, 6, 375, 120);
		f.getContentPane().add(la5);
		
		la5.setIcon(new ImageIcon("/Users/seokjunkang/Desktop/계산기.png"));		// j라벨에 이미지 삽입.
		
		f.setVisible(true);
	} //main
} //class

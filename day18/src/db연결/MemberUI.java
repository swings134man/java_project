package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel.setBounds(53, 26, 143, 63);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(208, 26, 243, 63);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1.setBounds(53, 104, 143, 63);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(208, 104, 243, 63);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_2.setBounds(53, 192, 143, 63);
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(208, 192, 243, 63);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_3.setBounds(53, 270, 143, 63);
		f.getContentPane().add(lblNewLabel_3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(208, 270, 243, 63);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// member테아블에 저장하려고함.
				//=> 해결책, 우리가 원하는 기능을 가진 메소드를 가지고 있는 부품을 찾아야함.\
				// 	램에 가져다 놓으면됨.
				
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel);	//1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					}else {
						JOptionPane.showMessageDialog(f, "가입 실패! 다시 시도하세요!");
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				// 입력한거 지워버리자!
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton.setBounds(6, 356, 117, 92);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				MemberDAO db = new MemberDAO();
			
				try {
				int	result = db.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원 탈퇴가 완료되었습니다.");
				} else {
					JOptionPane.showMessageDialog(f, "없는 아이디입니다.");
				}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_1.setBounds(129, 356, 117, 92);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();
				MemberDAO db = new MemberDAO();
				
				try {
					int result = db.update(tel, id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원정보 수정이 완료되었습니다!");
					}else {
						JOptionPane.showMessageDialog(f, "오류가 생겼습니다 다시 시도하세요.");
					} 
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_2.setBounds(258, 356, 117, 92);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("검색");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO db = new MemberDAO();
				try {
					String[] a = db.read(id);
					JOptionPane.showMessageDialog(f, a);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_2_1.setBounds(377, 356, 117, 92);
		f.getContentPane().add(btnNewButton_2_1);
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	} //main
} //class

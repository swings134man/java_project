package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TravelReservationTableUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel la1 = new JLabel("전화번호 뒷자리");
		la1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la1.setBounds(22, 26, 118, 63);
		f.getContentPane().add(la1);
		
		t1 = new JTextField();
		t1.setBounds(208, 26, 243, 63);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel la2 = new JLabel("성인");
		la2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la2.setBounds(22, 102, 39, 63);
		f.getContentPane().add(la2);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(208, 104, 243, 63);
		f.getContentPane().add(t2);
		
		JLabel la3 = new JLabel("어린이");
		la3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la3.setBounds(22, 192, 53, 63);
		f.getContentPane().add(la3);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(208, 192, 243, 63);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("예약");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String id = t1.getText();
				String adult = t2.getText();
				String child = t3.getText();
				// member테아블에 저장하려고함.
				//=> 해결책, 우리가 원하는 기능을 가진 메소드를 가지고 있는 부품을 찾아야함.\
				// 	램에 가져다 놓으면됨.
				
				TravelReservationTableDAO db = new TravelReservationTableDAO();
				try {
					int result = db.createCard(id, adult, child);	//1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "예약 성공");
					}else {
						JOptionPane.showMessageDialog(f, "예약 실패! 다시 시도하세요!");
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				// 입력한거 지워버리자!
				t1.setText("");
				t2.setText("");
				t3.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton.setBounds(53, 356, 117, 92);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("예약 취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				TravelReservationTableDAO db = new TravelReservationTableDAO();
			
				try {
				int	result = db.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "예약 취소가 완료되었습니다.");
				} else {
					JOptionPane.showMessageDialog(f, "없는 예약번호입니다.");
				}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_1.setBounds(208, 356, 117, 92);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("예약 정보 수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String adult = t2.getText();

				TravelReservationTableDAO db = new TravelReservationTableDAO();
				
				try {
					int result = db.update(id, adult);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "예약 정보 수정이 완료되었습니다!");
					}else {
						JOptionPane.showMessageDialog(f, "오류가 생겼습니다 다시 시도하세요.");
					} 
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_2.setBounds(357, 356, 117, 92);
		f.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	} //main
} //class

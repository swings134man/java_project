package connectToDB;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TravelReservationTableUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);
		
		JLabel la1 = new JLabel("전화번호 뒷자리");
		la1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la1.setBounds(239, 495, 118, 63);
		f.getContentPane().add(la1);
		
		t1 = new JTextField();
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t1.setText("");
			}
		});
		t1.setText("숫자 4자리를 입력하세요.");
		t1.setBounds(425, 495, 243, 63);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel la2 = new JLabel("성인");
		la2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la2.setBounds(239, 571, 39, 63);
		f.getContentPane().add(la2);
		t2 = new JTextField();
		t2.setText("인원을 입력하세요.");
		t2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t2.setText("");
			}
		});
		t2.setColumns(10);
		t2.setBounds(425, 573, 243, 63);
		f.getContentPane().add(t2);
		
		JLabel la3 = new JLabel("어린이");
		la3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la3.setBounds(239, 661, 53, 63);
		f.getContentPane().add(la3);
		
		t3 = new JTextField();
		t3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t3.setText("");
			}
		});
		t3.setText("인원을 입력하세요.");
		t3.setColumns(10);
		t3.setBounds(425, 661, 243, 63);
		f.getContentPane().add(t3);
		//----------------------------------------
		JButton btnNewButton = new JButton("예약");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String id = t1.getText();
				String adult = t2.getText();
				String child = t3.getText();
				String day = "";
				// member테아블에 저장하려고함.
				//=> 해결책, 우리가 원하는 기능을 가진 메소드를 가지고 있는 부품을 찾아야함.\
				// 	램에 가져다 놓으면됨.
				
				TravelReservationTableDAO db = new TravelReservationTableDAO();
				try {
					int result = db.createCard(id, adult, child, day);	//1
					if (result == 1) {
//						JOptionPane.showMessageDialog(f, "예약 성공");
						ReserveButton button1 = new ReserveButton();
						button1.reserve();
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
		btnNewButton.setBounds(835, 554, 117, 92);
		f.getContentPane().add(btnNewButton);
		//---------
		
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
		btnNewButton_1.setBounds(239, 736, 117, 92);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("예약 정보 수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				String adult = t2.getText();
				String child = t3.getText();
				String day = "";

				TravelReservationTableDAO db = new TravelReservationTableDAO();
				
				try {
					int result = db.update(id, adult, child, day);
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
		btnNewButton_2.setBounds(388, 736, 176, 92);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("예약 조회");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame f1 = new JFrame();
				f1.setSize(500, 450);
				
				JLabel la01 = new JLabel("예약 조회 결과입니다.");
				la01.setFont(new Font("Lucida Grande", Font.BOLD, 15));
				la01.setBounds(50, 50, 150, 150);
				f1.getContentPane().add(la01);
				t2.setText("");
				t3.setText("");
				
//				 --------- 메서드 호출
				String id = t1.getText();
				TravelReservationTableDAO db = new TravelReservationTableDAO();
				
				try {
					String[] a = db.read(id);
//					System.out.println(a[0] + a[1] + a[2] + a[3]);
					
				// 예약 조회 결과창 
				JLabel la00 = new JLabel(a[0] + a[1] + a[2] + a[3]);
				la00.setFont(new Font("Lucida Grande", Font.BOLD, 15));
				la00.setBounds(169, 521, 53, 63);
				f1.getContentPane().add(la00);
				
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				f1.setVisible(true);
				
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_1_1.setBounds(589, 736, 117, 92);
		f.getContentPane().add(btnNewButton_1_1);
		
//		-------------------------------
		
		
		
		
		
		
		
		
		f.setVisible(true);
	} //main
} //class

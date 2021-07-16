package backup;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ReserveMain {
	private static JTextField t10;
	private static JTextField t1;
	private static JTextField t2;
//	private static Component t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);
		
		JLabel la10 = new JLabel("날짜 선택");
		la10.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la10.setBounds(239, 409, 118, 63);
		f.getContentPane().add(la10);
		
		
		//-----콤보박스
		JComboBox travelDay = new JComboBox();
		travelDay.setToolTipText("예약 가능 날짜");
		travelDay.setBounds(425, 426, 188, 39);
		travelDay.setModel(new DefaultComboBoxModel(new String[] {"예약 가능 날짜", "2021년 07월 20일 화요일", "2021년 07월 21일 수요일", "2021년 07월 22일 목요일", "2021년 07월 23일 금요일", "2021년 07월 24일 토요일", "2021년 07월 25일 일요일", "2021년 07월 26일 월요일", "2021년 07월 27일 화요일", "2021년 07월 28일 수요일", "2021년 07월 29일 목요일", "2021년 07월 30일 금요일", "2021년 07월 31일 토요일"}));
		f.getContentPane().add(travelDay);
		
		t10 = new JTextField();
		t10.setBounds(6, 783, 173, 61);
		f.getContentPane().add(t10);
		t10.setColumns(10);
		t10.setVisible(false);
		//예약 날짜 구하기
		travelDay.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String reserve_day = travelDay.getSelectedItem().toString();//예약날짜
				t10.setText(reserve_day);
				System.out.println(reserve_day);
			}
		});
		// ------------- 라벨 + 텍스트 
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
		
		
//		t3 = new JTextField();
//		t3.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
////				t3.setText("");
//			}
//		});
//		
////		t3.setText("인원을 입력하세요.");
////		t3.setColumns(10);
//		t3.setBounds(139, 766, 243, 63);
//		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t4.setText("");
			}
		});
		t4.setText("인원을 입력하세요.");
		t4.setColumns(10);
		t4.setBounds(425, 661, 243, 63);
		f.getContentPane().add(t4);
		
		
		//-----------------버튼 -----------------------
		JButton btnNewButton = new JButton("예약");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String id = t1.getText();
				String adult = t2.getText();
				String child = t4.getText();
				String day = t10.getText();
				// member테아블에 저장하려고함.
				//=> 해결책, 우리가 원하는 기능을 가진 메소드를 가지고 있는 부품을 찾아야함.\
				// 	램에 가져다 놓으면됨.
				
				TravelReservationTableDAO db = new TravelReservationTableDAO();
				try {
					int result = db.createCard(id, adult, child, day);	// 괄호안에 child 
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
				t4.setText("");
				t10.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton.setBounds(280, 736, 117, 92);
		f.getContentPane().add(btnNewButton);
		
		JButton b2 = new JButton("예약 조회창으로");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TravelReservationTableUI2 m2 = new TravelReservationTableUI2();
				m2.search();
				
			}
		});
		b2.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		b2.setBounds(435, 736, 202, 92);
		f.getContentPane().add(b2);
		
		JLabel lblNewLabel = new JLabel("상품 예약&주문");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblNewLabel.setBounds(18, 20, 260, 81);
		f.getContentPane().add(lblNewLabel);
		
		
		//---------
		
		
		
//	
		
		
		f.setVisible(true);
	}
}

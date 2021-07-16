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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class TravelReservationTableUI2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t10;

//	public static void main(String[] args) {
		public void search() 	{
		
		JFrame f = new JFrame();
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("예약 조회창");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 33));
		lblNewLabel.setBounds(36, 37, 192, 74);
		f.getContentPane().add(lblNewLabel);
				
				JLabel la10 = new JLabel("날짜 선택");
				la10.setFont(new Font("Lucida Grande", Font.BOLD, 18));
				la10.setBounds(377, 371, 118, 63);
				f.getContentPane().add(la10);
				
			
		//-----콤보박스
				JComboBox travelDay = new JComboBox();
				travelDay.setToolTipText("예약 가능 날짜");
				travelDay.setBounds(563, 395, 188, 39);
				travelDay.setModel(new DefaultComboBoxModel(new String[] {"예약 가능 날짜", "2021년 07월 20일 화요일", "2021년 07월 21일 수요일", "2021년 07월 22일 목요일", "2021년 07월 23일 금요일", "2021년 07월 24일 토요일", "2021년 07월 25일 일요일", "2021년 07월 26일 월요일", "2021년 07월 27일 화요일", "2021년 07월 28일 수요일", "2021년 07월 29일 목요일", "2021년 07월 30일 금요일", "2021년 07월 31일 토요일"}));
				f.getContentPane().add(travelDay);
				
				t10 = new JTextField();
				t10.setBounds(6, 840, 21, 26);
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
		
		
		
		JLabel la1 = new JLabel("전화번호 뒷자리");
		la1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la1.setBounds(377, 464, 118, 63);
		f.getContentPane().add(la1);
		
		t1 = new JTextField();
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t1.setText("");
			}
		});
		t1.setText("숫자 4자리를 입력하세요.");
		t1.setBounds(563, 464, 243, 63);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel la2 = new JLabel("성인");
		la2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la2.setBounds(377, 540, 39, 63);
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
		t2.setBounds(563, 542, 243, 63);
		f.getContentPane().add(t2);
		
		JLabel la3 = new JLabel("어린이");
		la3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la3.setBounds(377, 630, 53, 63);
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
		t3.setBounds(563, 630, 243, 63);
		f.getContentPane().add(t3);
		//----------------------------------------
//		
		
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
				String day = t10.getText();

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
				t10.setText("");
			}
			
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_2.setBounds(388, 736, 176, 92);
		f.getContentPane().add(btnNewButton_2);
		
		
		JLabel ra3 = new JLabel("");
		ra3.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		ra3.setBounds(187, 123, 815, 130);
		f.getContentPane().add(ra3);
		
		
		JButton btnNewButton_1_1 = new JButton("예약 조회");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame f1 = new JFrame();
				f1.setSize(800, 450);
				
				JLabel la01 = new JLabel("예약 조회 결과입니다.");
				la01.setFont(new Font("Lucida Grande", Font.BOLD, 15));
				la01.setBounds(50, 50, 150, 150);
				f1.getContentPane().add(la01);
				t2.setText("");
				t3.setText("");
				t10.setText("");
				JButton b12 = new JButton("창닫기");
				b12.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f1.dispose();
					}
				});
				b12.setBounds(290, 286, 187, 52);
				f1.getContentPane().add(b12);
				
				
//				 --------- 메서드 호출
				String id = t1.getText();
				TravelReservationTableDAO db = new TravelReservationTableDAO();
				
				try {
					String[] a = db.read(id);
//					System.out.println(a[0] + a[1] + a[2] + a[3]);
					
				// 예약 조회 결과창 
				JLabel la00 = new JLabel(a[0] + a[1] + a[2] + a[3] + a[4]);
				la00.setFont(new Font("Lucida Grande", Font.BOLD, 15));
				la00.setBounds(169, 521, 150, 150);
				f1.getContentPane().add(la00);
				
				ra3.setText(a[0] + a[1] + a[2] + a[3] + a[4]);
				
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				f1.setVisible(true);
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton_1_1.setBounds(589, 736, 117, 92);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("창 닫기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		btnNewButton_3.setBounds(736, 736, 192, 92);
		f.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("* 수정시, 날짜, 대인, 소인 인원수필수체크! 뒷자리는 입력하신 번호를 입력하세요");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(377, 349, 429, 26);
		f.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
		
//		-------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		-------------------------------
		f.setVisible(true);
	} //main
} //class

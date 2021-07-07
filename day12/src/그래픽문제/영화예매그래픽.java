package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {

		JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(660, 1000);

		// flowlayout -> 틀없앰. 
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200];		//for문안에 들어가면 0으로 초기화되기 때문에 밖에서 선언. 
		
		
		//string.valueOf(0);
		
		for (int i = 1; i < 201; i++) {
			JButton b = new JButton(i + "");
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {	// 클릭하면 액션퍼폼에 저장
					String s = e.getActionCommand();			//s 는 자리값의 인덱스 
					int index = Integer.parseInt(s);			// int 로 변경한 이유는
					int count = 0;
					seat[index] = 1;							// [] = 1; 은 int 이고 string 으로 바꿔줘야 error가 안뜸.  type맞춰.
					JOptionPane.showMessageDialog(f, index +"번 예약됨.");			// 중복일때 비활성을 시켜라 
					
					
					// 여기 밑으로 중복 버튼은 비활성화!!! 
					b.setEnabled(false);						// 비활성화.
					b.setBackground(Color.red);					// 비활성후에 -> 색 변경 
						b.setOpaque(true);
						b.setBorderPainted(true);
				}
			});
			f.add(b);
			
		} //for
		
		
		//결제하기 버튼을 누르면
		// 1) 배열안에 1이 몇개인지 세서
		// 2) 금액 10000원씩 계산 후에
		// 3) 결제금액 알려주세요
		// 4) 몇번좌석을 예약했는지 출력
		
		// 결제하기 버튼.
		JButton b2 = new JButton("<<<<< 결제 하기 >>>>>");
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = e.getActionCommand();
				int count = 0;
				final int MONEY = 10000;
				String sum = "";
				// 
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						sum = sum + i + "번 ";					// sum = sum+i 1~10 까지 더한걸 string 값으로. 
					}
					
				}
				
				int payment = count * MONEY;
				JOptionPane.showMessageDialog(f, "당신이 결제할 금액은 " + payment + "원 입니다");
				JOptionPane.showMessageDialog(f, "당신이 예약한 좌석번호는 " + sum + "입니다");
				
			}
		});

		//
		b2.setBackground(Color.ORANGE);
		b2.setOpaque(true);
		b2.setBorderPainted(true);
		f.add(b2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}//main
}//class

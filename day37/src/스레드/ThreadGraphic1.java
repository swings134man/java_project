package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame{
	
	// static이라 붙으면 객체생성하지 않아도 CPU가 바로 호출해서 사용가능. 
	// 멤버변수가 있으면 static 메서드에서 바로 사용 불가. 접근할수가 없음. 
	// 전역변수에도 static을 붙여주면 객체생성하지 않아도 static 메서드안에서 접근가능. 
	// RAM에  상주하고 있음. 언제든지 CPU가 접근해서 사용 가능. 
	// static을 많이 사용하면 안된다. 
	
	JLabel count, image, timer;
	
	public ThreadGraphic1() {
		setSize(1300, 400);
		setTitle("나의 스레드 프로그램");
		
		 count = new JLabel("카운트 들어가는 부분");
		 image = new JLabel("");
		 timer = new JLabel("타이머 들어가는 부분");
		add(count, BorderLayout.WEST);
		add(image);
		add(timer, BorderLayout.SOUTH);
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		
		count.setFont(font);
		timer.setFont(font2);
		
				//객체생성
				Count2 thread1 = new Count2();
				Image2 thread2 = new Image2();
				Timer2 thread3 = new Timer2();
		
				// cpu에 스레드를 등록해주어야 한다. 
				thread1.start();
				thread2.start();
				thread3.start();

		
		
		setVisible(true);
	}
	
	// 클래스간 변수를 공유할 목적으로 클래스내에 클래스를 끼워넣을 수 있다. 
	// 내부 클래스(inner class, 이너 클래스)
	// 내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다. 
	public class Count2 extends Thread {
		@Override
		public void run() {
			// i --(증감 연산자) --> i = i -1;
			// n 번씩 감소할때는 i = i-2; 이러면 2씩 뺌. 
			for (int i = 500; i >= 0; i--) {
				count.setText("Count <->" + i);
			
				try {
					Thread.sleep(500); //밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} //for
		} //run
	}//class
	
	public class Image2 extends Thread {
		@Override
		public void run() {
			String[] list = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg"};
			for (int i = 0; i < list.length; i++) {
				//image.setText(list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000); //밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}// for
		}// run
	}//class

	
	public class Timer2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				timer.setText(date + "");
				//System.out.println(date);
				try {
					Thread.sleep(1000); //밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//for
		}//run
	}//class

	
	
	
	
	public static void main(String[] args) {
		
		ThreadGraphic1 s = new ThreadGraphic1();
		
	}

}

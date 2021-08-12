package 스레드;

public class 동시처리Main2 {

	public static void main(String[] args) {

		//객체생성
		Count thread1 = new Count();
		Image1 thread2 = new Image1();
		Timer1 thread3 = new Timer1();
		// cpu에 스레드를 등록해주어야 한다. 
		thread1.start();
		thread2.start();
		thread3.start();
		
	} //main
}//class

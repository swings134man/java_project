package 문제풀이;

public class DollarThread extends Thread{

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("$" + i);
		}
		
	}
	
	
}

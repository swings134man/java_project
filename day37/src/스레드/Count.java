package 스레드;


public class Count extends Thread {

	@Override
	public void run() {
		// i --(증감 연산자) --> i = i -1;
		// n 번씩 감소할때는 i = i-2; 이러면 2씩 뺌. 
		for (int i = 500; i >= 0; i--) {
			System.out.println("Count <->" + i);
		
			
			try {
				Thread.sleep(500); //밀리세컨즈(1/1000초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} //for
	
	} //run
	
}//class

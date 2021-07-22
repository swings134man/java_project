package mega;


import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 200; i++) {
			// client 객체를 생성하자. 
			Socket client = new Socket("localhost", 9100);
			System.out.println("client request1 ------" + i);
		}
		
		
		
		
		
	} //main
}//class 

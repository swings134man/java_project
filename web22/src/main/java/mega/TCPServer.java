package mega;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPServer {

	public static void main(String[] args) throws Exception {

		// 서버객체를 생성하자. 
		
		ServerSocket server = new ServerSocket(9100);
		System.out.println("server start!!");
		int count = 0;
		
		// 서버는 계속 살아있어야 하기때문에 무한루프. 
		while (true) {
			System.out.println("wait request,,,");
			server.accept();
			System.out.println("클라이언트가 연결됨...!!" + ++count);
			if (count == 100) {
				break;
			}
		}
		System.out.println("server closed,,!!");
		server.close();
		
		
		
		
		
		
	} //main
}//class 

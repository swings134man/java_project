package com.mega.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {

		// 비연결성, 신뢰성x, 패킷(데이터그램) 
		// 패킷이 데이터와 주소를 가지고 찾아간다. 
		// 데이터는 네트워크로 전송될 때는 바이트 단위로 만들어주어야 한다.
		// 바이트 배열을 사용.
		
		// 1. UDP용 소켓
		DatagramSocket socket = new DatagramSocket();
		
		// 2. 전송될 데이터 정해야함. 
		String data = "today is Friday";
		
		// 3. 전송될 데이터를 바이트배열로 변환시켜야함. 
		byte[] buf = data.getBytes();
		
		// 4. 전송할 단위인 데이터그램 패킷으로 만들어야함.
		//    데이터(데이터+크기) + 주소(IP + port) 
		InetAddress ip = InetAddress.getByName("127.0.0.1"); // IP 가져온것.
		int port = 5000; //받을 상대방 포트
		DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, port);
		
		// 5. 소켓으로 패킷을 전송. 
		socket.send(packet);
		
		// 6. 통신 끝.
		socket.close();
		
	} //main
}//class

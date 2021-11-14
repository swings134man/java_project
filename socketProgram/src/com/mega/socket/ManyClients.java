package com.mega.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ManyClients {

	public static void main(String[] args) throws Exception {
			
			// TCP 방식 .
		
		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhost", 9100); // 네트워크 통신을 위해서는 ip , port가 필요함. 파라메터 : 요청할 곳의 ip, 포트 입력
			System.out.println("클라이언트 소켓 시작됨 ...");
			System.out.println("서버로 요청 보냄 ...");
			
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = buffer.readLine();
			System.out.println("서버로 부터 받은 데이터 : " + data);
//			
//			InputStream input = socket.getInputStream(); //받아온 데이터 1바이트
//			InputStreamReader reader = new InputStreamReader(input); // 1바이트를 2바이트로 변환
//			BufferedReader beffer2 = new BufferedReader(reader); // 글자를 읽을 수 있는 버퍼드리더에 저장. 
			
			
		} //for
		
		
		
		
		
		
	} //main
}//class

package com.mega.socket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerA extends JFrame {
		// 1. 받는 소켓 객체 생성
		DatagramSocket socket;
		// JFrame 
		JTextArea list;
		JTextField input;
		
		
	public MessengerA() throws Exception {
		
		socket = new DatagramSocket(5555); // 1번만 만들어져야 하기 떄문에 밖으로 뻄. 
		
		setTitle("메신저 A");
		setSize(500, 500);
		
		// 채팅 리스트
		list = new JTextArea();
		
		// 채팅 입력창
		input = new JTextField();
		// 추가 
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		// 폰트
		Font font = new Font("굴림", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);
		
		// 백그라운드 색.
		list.setBackground(Color.green);
		input.setBackground(Color.orange);
		// 글자색깔
		list.setForeground(Color.blue);
		input.setForeground(Color.red); 
		list.setEditable(false); //리스트에 글씨 쓰는거 막는것.
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력값 가져오기. 
				String data = input.getText();
				// 2. 리스트에 올리기. 
				list.append("나 >> " + data + "\n"); // 내가 보낸 텍스트.
				input.setText("");
				// 3. 상대편에 패킷을 만들어서 보내라.
				// 1. UDP용 소켓
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					// 2. 전송될 데이터 정해야함. 
					
					// 3. 전송될 데이터를 바이트배열로 변환시켜야함. 
					byte[] buf = data.getBytes();
					// 4. 전송할 단위인 데이터그램 패킷으로 만들어야함.
					InetAddress ip = InetAddress.getByName("127.0.0.1"); // IP 가져온것.
					int port = 7777; //받을 상대방 포트
					DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, port);
					// 5. 소켓으로 패킷을 전송. 
					socket.send(packet);
					// 6. 통신 끝.
					socket.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		setVisible(true);
	} // 생성자.
	// static 안에 많이 코드를 넣는것은 안좋은 코드.
	
	public void process() throws Exception {
		while(true) {
			// 2. 받는 패킷을 만들어 놓아야 한다.
			byte[] buf = new byte[256]; // 받은 데이터 저장 장소
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			// 소켓으로 받아서 패킷에다가 넣어줌. -> 그럼 패킷안에 buf에 넣어줌.
			socket.receive(packet);
			list.append("친구 >> " + new String(buf) + "\n"); // 친구가 보낸 텍스트.
			
		}//while
	}//process
	
	public static void main(String[] args) throws Exception {
		MessengerA m = new MessengerA();
		m.process();
		
		
	} //main
}//class

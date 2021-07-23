package file;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기 {

	public static void main(String[] args) {

		
		try {
			//1. test2.txt 스트링을 file 객체로 만들어준다.
			//2. test2.txt 파일과 java 프로그램간에 stream까지 만들어준다.
			
			FileWriter file = new FileWriter("test3.txt");
			//3. stream으로 데이터를 보내면 된다.
			file.write("hello" + "\n");
			file.write("hi"+ "\n");
			file.close(); // 끝났다라고 인식하고 스트림닫음. 반드시 닫아야함. 
		} catch (IOException e) {
			System.err.println("파일 저장하는 동안 에러가 발생함 !");
		
		}

		// 스트림을 사용하면(네트워크 연결하거나, 파일스거나, 외부자원이거나, ) try,catch 무조건 사용, 대응해줘야함. 
		
		
		
		
		
		
		
		
	}

}

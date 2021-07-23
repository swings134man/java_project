package file;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기2일기 {

	public static void main(String[] args) {

		
		try {
			//1. test2.txt 스트링을 file 객체로 만들어준다.
			//2. test2.txt 파일과 java 프로그램간에 stream까지 만들어준다.
			String day = JOptionPane.showInputDialog("날짜입력");
			String title = JOptionPane.showInputDialog("제목입력");
			String content = JOptionPane.showInputDialog("내용입력");
			String we = JOptionPane.showInputDialog("날씨입력");
			FileWriter file = new FileWriter( day + ".txt");
			//3. stream으로 데이터를 보내면 된다.
			file.write(day + "\n");
			file.write(title + "\n");
			file.write(content + "\n");
			file.write(we + "\n");
			file.close(); // 끝났다라고 인식하고 스트림닫음. 반드시 닫아야함. 
			JOptionPane.showMessageDialog(null, "일기가 저장됨.");
			
		} catch (IOException e) {
			System.err.println("파일 저장하는 동안 에러가 발생함 !");
		
		}

		
		
		
		
		
		
		
		
	}

}

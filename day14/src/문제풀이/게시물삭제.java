package 문제풀이;

import javax.jws.Oneway;
import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {

		
		
		String pw = JOptionPane.showInputDialog("게시물을 삭제하려면 \n비밀번호를 입력하세요");
		
		
		BbsDB db = new BbsDB();
		
		db.delete(pw);
		
		
		
		
		
		
	}

}

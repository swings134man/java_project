package 문제풀이;

import javax.swing.JOptionPane;

public class 게시물등록 {

	
	public static void main(String[] args) {

		
		
		String cre = JOptionPane.showInputDialog("게시물을 입력하세요.");
		
		

		BbsDB db = new BbsDB();
		db.create(cre);
		
		
		
		
		
		
		
		
		
	}

}

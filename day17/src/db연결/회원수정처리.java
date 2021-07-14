package db연결;

import javax.swing.JOptionPane;

public class 회원수정처리 {

	public static void main(String[] args) throws Exception {

		//stirng sql = "update member set tel = ? where id = ?"
		
		String tel = JOptionPane.showInputDialog("수정될 전화 번호 입력");
		String id = JOptionPane.showInputDialog("id 입력");
		
		MemberDAO db = new MemberDAO();
		db.update(tel, id);
		
		
		
//		db.create(id, pw, name, tel);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

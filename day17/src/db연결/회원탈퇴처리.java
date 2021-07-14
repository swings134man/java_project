package db연결;

import javax.swing.JOptionPane;

public class 회원탈퇴처리 {

	public static void main(String[] args) throws Exception {

		
		// string sql = "delete from member where id =''";
		String id = JOptionPane.showInputDialog("id 입력");
		
		MemberDAO db = new MemberDAO();
		db.delete(id);
		
		
		
//		db.create(id, pw, name, tel);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

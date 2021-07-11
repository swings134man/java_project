package 클래스사용;

import javax.swing.JOptionPane;

public class 회원가입처리 {

	public static void main(String[] args) throws Exception {

		
		
		String id = JOptionPane.showInputDialog("id 입력");
		String pw = JOptionPane.showInputDialog("pw 입력");
		String name = JOptionPane.showInputDialog("이름입력");
		String tel = JOptionPane.showInputDialog("전화 번호 입력");
		
		MemberDB db = new MemberDB();
		db.create(id, pw, name, tel);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

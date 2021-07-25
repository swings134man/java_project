package dbConnect;

import javax.swing.JOptionPane;

public class DBtoSQLMain {

	public static void main(String[] args) throws Exception {

		
		
//		String id = JOptionPane.showInputDialog("id 입력");
//		String pw = JOptionPane.showInputDialog("pw 입력");
//		String name = JOptionPane.showInputDialog("이름입력");
//		String tele = JOptionPane.showInputDialog("전화 번호 입력");
//		
//		DBtoSQL db = new DBtoSQL();
//		db.create(id, pw, name, tele);
//		
		
		
//		db.create(id, pw, name, tel);
		
		
		String id = JOptionPane.showInputDialog("id 입력");
		String pw = JOptionPane.showInputDialog("pw 입력");
		String name = JOptionPane.showInputDialog("이름입력");
		String tele = JOptionPane.showInputDialog("전화 번호 입력");
		
		DBtoSQL db = new DBtoSQL();
		db.create(id, pw, name, tele);
		
		
		
		
		
		
		
		
		
		
		
	}

}

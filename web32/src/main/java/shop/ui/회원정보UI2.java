package shop.ui;

import javax.swing.JOptionPane;

import shop.db.회원DAO2;
import shop.dto.회원Bag;

public class 회원정보UI2 {

	public static void main(String[] args) {

		
		String id = JOptionPane.showInputDialog("회원가입 id 입력");
		String pw = JOptionPane.showInputDialog("회원가입 pw 입력");
		String name = JOptionPane.showInputDialog("회원가입 name 입력");
		String tel = JOptionPane.showInputDialog("회원가입 tel 입력");
		
		회원DAO2 dao2 = new 회원DAO2();
		회원Bag bag = new 회원Bag();	//1. 가방 만들기
		
		bag.setId(id);		// 2. 입력값저장(가방에 넣음)
		bag.setName(name);
		bag.setPw(pw);
		bag.setTel(tel);
		dao2.create(bag);	//3. 가방전달. to dao2에 create 메서드로  

		System.out.println("dao2의 create()하고나서 연이어 실행됨.");
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}

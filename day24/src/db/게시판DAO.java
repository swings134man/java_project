package db;

import dto.게시판Bag;

public class 게시판DAO {
	
	
	public void create(게시판Bag bag) {
		System.out.println("아이디는 : " + bag.getId());
		System.out.println("글쓴이는 : " + bag.getWriter());
		System.out.println("제목은 : " + bag.getTitle());
		System.out.println("내용은 : " + bag.getContent());
	}
	public void read(String id) {

	}
	public void read() {

	}
	
	public void update() {

	}

	public void delete() {

	}

	
	
	
	
	
	
	
	
	
	
}//class

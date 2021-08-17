package shop.ui;

import javax.swing.JOptionPane;

import shop.db.게시판DAO;
import shop.dto.게시판Bag;

public class 게시판정보UI {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String writer = JOptionPane.showInputDialog("글쓴이 입력");
		String title = JOptionPane.showInputDialog("제목 입력");
		String content = JOptionPane.showInputDialog("내용 입력");
		
		게시판DAO dao = new 게시판DAO();
		게시판Bag bag = new 게시판Bag();
		bag.setId(id);
		bag.setWriter(writer);
		bag.setTitle(title);
		bag.setContent(content);
		dao.create(bag);
		
	}

}

package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import shop.dto.게시판Bag;

public class 게시판DAO {
	
	
	public void create(게시판Bag bag) {
		System.out.println("아이디는 : " + bag.getId());
		System.out.println("글쓴이는 : " + bag.getWriter());
		System.out.println("제목은 : " + bag.getTitle());
		System.out.println("내용은 : " + bag.getContent());
		 try {
	         Class.forName("com.mysql.jdbc.Driver");
	         System.out.println("1. connector연결 성공!!!");
	         
	         String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
	         String username = "root";
	         String password = "1234";
	         Connection con = DriverManager.getConnection(url, username, password);
	         System.out.println("2. shoes db연결 성공!!!");
	         //3. sql문을 만든다.
	         String sql = "insert into board values (?, ?, ?, ?)";
	         PreparedStatement ps = con.prepareStatement(sql);
	         ps.setString(1, bag.getId());
	         ps.setString(2, bag.getTitle());
	         ps.setString(3, bag.getContent());
	         ps.setString(4, bag.getWriter());
	         System.out.println("3. sql문 생성 성공!!!");
	         //4. sql문을 mysql로 전송한다.
	         int result = ps.executeUpdate();
	         System.out.println("4. sql문 전송 전송");
	         System.out.println(result);
	      } catch (ClassNotFoundException e) { //1단계
	         System.out.println("1번 에러>> 드라이버 없음.!!!!");
	      } catch (SQLException e) { //2-4단계
	         System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
	      }
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

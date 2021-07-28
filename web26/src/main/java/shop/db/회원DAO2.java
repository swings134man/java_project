	package shop.db;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	import shop.dto.회원Bag;

	public class 회원DAO2 {

	   
	   public void create(회원Bag bag) {
	      
	      System.out.println("전달된 id는 " + bag.getId());
	      System.out.println("전달된 pw는 " + bag.getPw());
	      System.out.println("전달된 name는 " + bag.getName());
	      System.out.println("전달된 tel는 " + bag.getTel());
	      
	      try {
	         Class.forName("com.mysql.jdbc.Driver");
	         System.out.println("1. connector연결 성공!!!");
	         
	         String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
	         String username = "root";
	         String password = "1234";
	         Connection con = DriverManager.getConnection(url, username, password);
	         System.out.println("2. shoes db연결 성공!!!");
	         //3. sql문을 만든다.
	         String sql = "insert into member values (?, ?, ?, ?)";
	         PreparedStatement ps = con.prepareStatement(sql);
	         ps.setString(1, bag.getId());
	         ps.setString(2, bag.getPw());
	         ps.setString(3, bag.getName());
	         ps.setString(4, bag.getTel());
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
	   // finally {} 를 넣어주면 예외처리인 catch 가 실행되고 나서도 실행함
	   // finally 는 예외가 발생하더라도 항상 실행하는것임. 
	   public void delete(회원Bag bag) {
		      
		      System.out.println("전달된 id는 " + bag.getId());
		      try {
		         Class.forName("com.mysql.jdbc.Driver");
		         System.out.println("1. connector연결 성공!!!");
		         
		         String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
		         String username = "root";
		         String password = "1234";
		         Connection con = DriverManager.getConnection(url, username, password);
		         System.out.println("2. shoes db연결 성공!!!");
		         //3. sql문을 만든다.
		         String sql = "delete from member where id = ?";
		         PreparedStatement ps = con.prepareStatement(sql);
		         ps.setString(1, bag.getId());
		      
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
		   } //delete end
	
	   
	   		public void update(회원Bag bag) {
		      System.out.println("전달된 id는 " + bag.getId());
		      try {
		         Class.forName("com.mysql.jdbc.Driver");
		         System.out.println("1. connector연결 성공!!!");
		         String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
		         String username = "root";
		         String password = "1234";
		         Connection con = DriverManager.getConnection(url, username, password);
		         System.out.println("2. shoes db연결 성공!!!");
		         //3. sql문을 만든다.
		         String sql = "update member set tel =?, name =? where id = ?";
		         PreparedStatement ps = con.prepareStatement(sql);
		         ps.setString(1, bag.getTel());
		         ps.setString(2, bag.getName());
		         ps.setString(3, bag.getId());
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
		   } //update end
	   
	   
	   
	   
	   
	   
	   
//	   public void read(String id) {
//
//	   }
//	   public void read() {
//	      
//	   }
//	   
//	   public void update() {
//	      
//	   }
//	   
//	   public void delete() {
//	      
//	   }
//
//	}
//
//	public void read(String id) {
//
//	}
//	public void read() {
//
//	}
//	
//	public void update() {
//
//	}
//

	
}//class

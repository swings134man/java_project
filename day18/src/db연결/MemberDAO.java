package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

	
	public int create(String id, String pw, String name, String tel) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/book?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");
		
		
		String sql = "insert into member values (?, ?, ?, ?)";    

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문 생성 성공!!!");
		
		//4. sql문을 mysql로 전송한다. 
	int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println("SQL 문 수행 개수 " + result + "개");
		return result;
		
	}//create end
	
	public int delete(String id) throws Exception {
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/book?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");

		String sql = "delete from member where id = ?";		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result);
		return result;
	}//create end
	
	
	
	public int update(String tel, String id) throws Exception {
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/book?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");
		
		
		//3.sql 문을 만든다.			//개체로 만들지않으면 인식불가. 
		String sql = "update member set tel = ? where id = ?";
//	
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		
		System.out.println("3. sql문 생성 성공!!!");
		
		//4. sql문을 mysql로 전송한다. 
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result);
		return result;
	}//create end
	
	
	public String[] read(String id) throws Exception {
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/book?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");

		String sql = "select * from member where id = ?";		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공!!!");
//		System.out.println(rs.next());
		String[] result = new String[4];
		if (rs.next()) {
			// 테이블에 검색 결과가 있다라는 얘기!
			String id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
//			System.out.println(id2 + " " + pw + " " + " " + name + " " + tel);
			result[0] = "id : "+ id2 + " ";
			result[1] = "pw : "+ pw + " ";
			result[2] = "name : "+ name + " ";
			result[3] = "tel : "+ tel + " ";
		}
		return result;
		
		
	}//read end
	
	
	
	
	
	
	
} // class end 

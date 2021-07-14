package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ATravelReservationTableDB {

	
	public int create(String id, String pw, String name, String tel) throws Exception {
		//자바와 db 연결하는 프로그램(JDBC) 순서
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2.자바에서 db 연결: 연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/book?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");
		
		
		//3.sql 문을 만든다.			
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
	
	public void delete(String id) throws Exception {
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2.자바에서 db 연결: 연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/book?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");
		
		
		//3.sql 문을 만든다.			

		String sql = "delete from member where id = ?";		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
		
		//4. sql문을 mysql로 전송한다. 
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result);
		
		
		
	}//create end
	
	public void update(String tel, String id) throws Exception {
		//자바와 db 연결하는 프로그램(JDBC) 순서
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2.자바에서 db 연결: 연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/shoes?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db연결 성공!!!");
		
		
		//3.sql 문을 만든다.			//개체로 만들지않으면 인식불가. 
//		String sql = "insert into member values ('apple','apple','apple','011')";    
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
		
	}//create end
	
	
	
	
	
	
	
	
} // class end 

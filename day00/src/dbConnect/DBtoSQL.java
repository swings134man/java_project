package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBtoSQL {

	// 자바에서 db 처리할때는 DML중심으로  클래스를 만든다. 
	// DB 연결할 때는 DB 를 단위로 연결한다. 
	// DB 연결하여 데아터 처리를 하는 클래스를 만들 때는 테이블 단위로 만든다.
	// 테이블 (entity, 개체)
	// create(insert ~ into values)
	
	public void create(String id, String pw, String name, String tele) throws Exception {
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
		String sql = "insert into bom values (?, ?, ?, ?)";    
//												('apple, 'apple' ,,,) 
//		String sql = "insert into member values ('apple2','apple2','apple2','019')";
//		String sql = "delete from member where id = 'apple'";			// 지우는 명령어. 
		
//		String sql = "delete from member where id = 'bom'";				// 지우는 명령어.
		
		//PrepareStatement ---> java.sql  :: sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 있으면됨. 
		//ps 부품을 2단계에서 획득한 com 부품이 만들어서 return.!!!!
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tele);
		
		System.out.println("3. sql문 생성 성공!!!");
		
		
		//4. sql문을 mysql로 전송한다. 
		
	int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result);
		
		
		
		
		
		
		
	}//create end
	public void delete(String id) throws Exception {
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

		String sql = "delete from member where id = ?";			// 지우는 명령어. 
		
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

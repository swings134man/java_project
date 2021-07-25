package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBPractice {

	
	
	public void create(String id, String pw, String name, String tele) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1번 연결 성공");
		
		
		String url = "jdbc:mysql://localhost:3306/shoes?useSSL=false";
		String user = "root";
		String password = "1234";
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("2번 DB 성공");
		
		// SQL 
		String sql = "insert into bom values(?,?,?,?)";
		
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tele);
		System.out.println("3. sql 만들기 성공");
		
		int result = ps.executeUpdate();
		System.out.println("4. 전송 성공 ");
		System.out.println(result);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}

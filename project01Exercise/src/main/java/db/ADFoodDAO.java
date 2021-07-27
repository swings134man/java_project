package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import dto.ADFoodDTO;

public class ADFoodDAO {
	// bag 받아와서 DB 로 넣는곳. 
	
	public int create(ADFoodDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		String url = "jdbc:mysql://localhost:3306/oksusu?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");
		String sql = "insert into ADFood values (?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getAd_Writer());
		ps.setString(2, dto.getAd_Title());
		ps.setString(3, dto.getAd_Info());
		ps.setString(4, dto.getAd_IAddress());
		ps.setString(5, dto.getAd_ITime());
		
		System.out.println("3. sql문 생성 성공!!!");
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println("SQL문 수행 개수 " + result + "개");
		return result;
		}//create end
	
	
	
}
//String ad_writer, String ad_Title, String ad_Info, String ad_IAddress, String ad_ITime
package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TravelReservationTableDAO {

	
	public int createCard(String reserveID, String reserveAdult, String reserveChild) throws Exception {
																					//,String totalCoast
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/TravelDB?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");
		
		
		String sql = "insert into TravelReservationTable values (?, ?, ?, ?)";    

		//adult = 27900
		//child = 10900
		int totalCoast1 = Integer.parseInt(reserveAdult);
		int totalCoast2 = Integer.parseInt(reserveChild);
		int totalCoast3 = (totalCoast1 * 27900) + (totalCoast2 * 10900);
		// 총금액 계산 되는것. 
		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, reserveID);
		ps.setString(2, reserveAdult);
		ps.setString(3, reserveChild);
//		ps.setString(4, totalCoast);
		ps.setInt(4, totalCoast3);
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
		
		String url = "jdbc:mysql://localhost:3306/TravelDB?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. Travel db연결 성공!!!");

		String sql = "delete from TravelReservationTable where reserve_ID = ?";		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result);
		return result;
	}//create end
	
	
	
	public int update(String ID, String Adult) throws Exception {
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/TravelDB?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. Travel db연결 성공!!!");
		
		
		//3.sql 문을 만든다.			
		String sql = "update TravelReservationTable set reserve_Adult = ? where reserve_ID = ?";
//	
		// 예약 정보 수정
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, Adult);
		ps.setString(2, ID);
		
		System.out.println("3. sql문 생성 성공!!!");
		
		//4. sql문을 mysql로 전송한다. 
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result);
		return result;
	}//create end
	
	
	
	
	
	
	
	
} // class end 

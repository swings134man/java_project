package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		String sql = "insert into ADFood values (null ,?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, dto.getAd_Num());					//auto increment -> 글번호(id)
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
	
	public int delete(ADFoodDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		String url = "jdbc:mysql://localhost:3306/oksusu?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");
		String sql = "delete from ADFood where ad_Writer = ?";		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1 , dto.getAd_Writer());														// 추후 글을 작성한 본인만 삭제 권한. 
		System.out.println("3. sql문 생성 성공!!!");
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println("SQL문 수행 개수 " + result + "개");
		return result;
	} //delete end
	
//	public String[] read(String id) throws Exception {
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("1. connector 연결 성공!");
//		
//		String url = "jdbc:mysql://localhost:3306/travelDB?useSSL=false";
//		String username = "root";
//		String password = "1234";
//		Connection con = DriverManager.getConnection(url, username, password);
//		System.out.println("2. Travel db연결 성공!!!");
//		String sql = "select * from ADFood where reserve_ID = ?";		
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		System.out.println("3. sql문 생성 성공!!!");
//		
//		ResultSet rs = ps.executeQuery();
//		System.out.println("4. sql문 전송 성공!!!");
//		String[] result = new String[5];
//		if (rs.next()) {
//			// 테이블에 검색 결과가 있다라는 얘기!
//			String number = rs.getString(1);
//			String adult = rs.getString(2);
//			String child = rs.getString(3);
//			String day = rs.getString(4);
//			String total = rs.getString(5);
////			System.out.println(id2 + " " + pw + " " + " " + name + " " + tel);
//			result[0] = "예약번호는 : "+ number + "     ";
//			result[1] = "대인 : "+ adult + " 명   ";
//			result[2] = "소인 : "+ child + " 명   ";
//			result[3] = "날짜 : " + day + "     ";
//			result[4] = "총금액 : "+ total + " 원입니다   ";
//		}
//		return result;
//	}//read end
	
	
	
}
//String ad_writer, String ad_Title, String ad_Info, String ad_IAddress, String ad_ITime
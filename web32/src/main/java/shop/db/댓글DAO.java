package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.게시판Bag;
import shop.dto.게시판Bag2;
import shop.dto.게시판Bag3;
import shop.dto.댓글DTO;

public class 댓글DAO {

	public int create(댓글DTO bag) {
		System.out.println("전달된 bag은 : " + bag);
		int result =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "insert into reply values (null, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getContent());
			ps.setString(2, bag.getBoardId());
			ps.setString(3, bag.getWriter());
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			e.printStackTrace();
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
		}
		return result;
	}

	public 댓글DTO read(댓글DTO bag) {
		System.out.println("전달된 id는 " + bag.getId());
		댓글DTO bag2 = new 댓글DTO();
		ResultSet rs = null; // 참조형이기때문에 null 로 초기화
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "select * from board where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getBoardId());
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			if (rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				System.out.println(id + " " + name + " " + content + " " + price);
				bag2.setId(0);
				bag2.setWriter(null);
				bag2.setContent(content);
				bag2.setContent(content);
			} else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return bag2;
	} // read end

	
	
		public ArrayList<댓글DTO> read(String boardId) {
		ArrayList<댓글DTO> list = new ArrayList<댓글DTO>();
		ResultSet rs = null; // 참조형이기때문에 null 로 초기화
//		게시판Bag2 bag2 = new 게시판Bag2();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "select * from reply where boardId = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, boardId);
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			while(rs.next()) {
				댓글DTO bag2 = new 댓글DTO();	// 가방 만듬. 
				System.out.println("검색 결과가 있음.");
				bag2.setId(rs.getInt(1));
				bag2.setContent(rs.getString(2));
				bag2.setBoardId(rs.getString(3));
				bag2.setWriter(rs.getString(4));
				System.out.println(bag2);
				list.add(bag2);
				System.out.println(list.size());
			}//while
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return list;
	} // read end

}// class

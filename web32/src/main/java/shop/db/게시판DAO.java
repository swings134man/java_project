package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.게시판Bag;
import shop.dto.게시판Bag2;

public class 게시판DAO {
	
	Connection con; //전역변수, 클랴스 아래에 선언한 변수, 클래스 전체에서 접근하여 사용가능한 변수, 자동초기화 <--> null 로 초기화 되어있음
	
	// 생성자 메서드, 생성자(constructor) 
	// new 키워드로 객체 생성할 때 클래스 이름과 동일한 메서드가 있으면 자동 호출되는 메서드. 
	//객체 생성시 자동으로 꼭 해야하는 작업이 있는 경우, 이 생성자 안에 넣어놓으면 무조건 처리하게 할 수 있다.
	public 게시판DAO() {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} //생성자 end
	
	public void create(게시판Bag bag) {
		System.out.println("아이디는 : " + bag.getId());
		System.out.println("글쓴이는 : " + bag.getWriter());
		System.out.println("제목은 : " + bag.getTitle());
		System.out.println("내용은 : " + bag.getContent());
		
		try {
			// 3. sql문을 만든다.
			String sql = "insert into board values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (SQLException e) { // 2-4단계
			System.out.println("3-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
		}
	}

	public 게시판Bag2 read(게시판Bag2 bag) {
		System.out.println("전달된 id는 " + bag.getId());
		게시판Bag2 bag2 = new 게시판Bag2();
		ResultSet rs = null; // 참조형이기때문에 null 로 초기화
		try {
			// 3. sql문을 만든다.
			String sql = "select * from board where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			if (rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println(id + " " + title + " " + content + " " + writer);
				bag2.setId(id);
				bag2.setTitle(title);
				bag2.setContent(content);
				bag2.setWriter(writer);
			} else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (SQLException e) { // 2-4단계
			System.out.println("3-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return bag2;
	} // read end

	public ArrayList<게시판Bag2> read() {
		ArrayList<게시판Bag2> list = new ArrayList<게시판Bag2>();
		ResultSet rs = null; // 참조형이기때문에 null 로 초기화
		try {
			// 3. sql문을 만든다.
			String sql = "select * from board";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			while(rs.next()) {
				게시판Bag2 bag2 = new 게시판Bag2();	// 가방 만듬. 
				System.out.println("검색 결과가 있음.");
//				String content = rs.getString(3);		//변수에 넣는것을 아래처럼 바로 넣어도 가능. 
				bag2.setId(rs.getString(1));
				bag2.setTitle(rs.getString(2));
				bag2.setContent(rs.getString(3));
				bag2.setWriter(rs.getString(4));
				System.out.println(bag2);
				list.add(bag2);
				System.out.println(list.size());
			}//while
		} catch (SQLException e) { // 2-4단계
			System.out.println("3-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return list;
	} // read end

}// class

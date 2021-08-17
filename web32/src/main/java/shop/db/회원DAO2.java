	package shop.db;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.회원Bag;

	public class 회원DAO2 {

	   
	   public int create(회원Bag bag) {
	      
	      System.out.println("전달된 id는 " + bag.getId());
	      System.out.println("전달된 pw는 " + bag.getPw());
	      System.out.println("전달된 name는 " + bag.getName());
	      System.out.println("전달된 tel는 " + bag.getTel());
	      int result = 0;		//메서드 안에서선언된 변수는 모두 지역변수  지역변수는 초기화를 해주어야 한다. 
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
	         result = ps.executeUpdate();
	         System.out.println("4. sql문 전송 전송");
	         System.out.println(result);
	      } catch (ClassNotFoundException e) { //1단계
	         System.out.println("1번 에러>> 드라이버 없음.!!!!");
	      } catch (SQLException e) { //2-4단계
	         System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
	      }
	      return result;
	      
	   } //create end 
	   // finally {} 를 넣어주면 예외처리인 catch 가 실행되고 나서도 실행함
	   // finally 는 예외가 발생하더라도 항상 실행하는것임. 
	   
	   
	   
	   
	   
	   public int delete(회원Bag bag) {
		      
		      System.out.println("전달된 id는 " + bag.getId());
		      int result = 0;
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
		         result = ps.executeUpdate();
		         System.out.println("4. sql문 전송 전송");
		         System.out.println(result);
		      } catch (ClassNotFoundException e) { //1단계
		         System.out.println("1번 에러>> 드라이버 없음.!!!!");
		         e.printStackTrace();
		      } catch (SQLException e) { //2-4단계
		         System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
		         e.printStackTrace();
		      }
		      return result;
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
		         e.printStackTrace();
		      } catch (SQLException e) { //2-4단계
		         System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
		         e.printStackTrace();
		      }
		   } //update end
	   
	   	 public 회원Bag read(회원Bag bag) {
		      System.out.println("전달된 id는 " + bag.getId());
		      회원Bag bag2 = new 회원Bag();			// trycatch 안에 만들면 리턴인식불가.
		      ResultSet rs = null;					// 참조형이기때문에 null 로 초기화 
		      try {
		         Class.forName("com.mysql.jdbc.Driver");
		         System.out.println("1. connector연결 성공!!!");
		         
		         String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
		         String username = "root";
		         String password = "1234";
		         Connection con = DriverManager.getConnection(url, username, password);
		         System.out.println("2. shoes db연결 성공!!!");
		         //3. sql문을 만든다.
		         String sql = "select * from member where id = ? ";
		         PreparedStatement ps = con.prepareStatement(sql);
		         ps.setString(1, bag.getId());
		        
		         System.out.println("3. sql문 생성 성공!!!");
		         //4. sql문을 mysql로 전송한다.
//		         result = ps.executeUpdate();   // cud 일때만 사용가능
		         rs = ps.executeQuery();				// 검색은 executeQuery(); 사용해야함.
		         System.out.println("4. sql문 전송 전송");
//		         System.out.println("검색 결과는 >>" + rs.next());		//rs.next 가 두번반복되면 결과가 false 로 나옴 
		         if (rs.next()) {									// rs.next true 값이면 전달한 ID 가 존재. 
		        	 System.out.println("검색 결과가 있음."); 
		        	 String id = rs.getString(1); //apple 값이 옴 ,	해당검색값의 인덱스1 값. rs.getString("id"); ==> 컬럼값을 가져옴 
		        	 String pw = rs.getString(2); //apple 값이 옴		()괄호안은 컬럼의 인덱스 값임 .
		        	 String name = rs.getString(3); // name 값이 옴
		        	 String tel = rs.getString(4); // tel 값이 옴
		        	 System.out.println(id + " " + pw + " " + name + " " + tel );
		        	 bag2.setId(id);
		        	 bag2.setPw(pw);
		        	 bag2.setName(name);
		        	 bag2.setTel(tel);
				}else {
					System.out.println("검색 결과가 없음.");
				}
		      } catch (ClassNotFoundException e) { //1단계
		         System.out.println("1번 에러>> 드라이버 없음.!!!!");
		         e.printStackTrace();
		      } catch (SQLException e) { //2-4단계
		         System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
		         e.printStackTrace();
		      }
		      return bag2;
		   } //read end 
	   
	   
	   
	   	 public ArrayList<회원Bag> read() {			// 이름이 달라도 입력값 달라서 ㄱㅊ 오버로딩
		      // 가방을 넣어줄 컨테이너를 하나 만들어주자. 
	   		 // cmd+shift +O --> java파일에서 자동임포트
		      ArrayList<회원Bag> list = new ArrayList<회원Bag>();
		      			
		      
		      ResultSet rs = null;					
		      
		      try {
		         Class.forName("com.mysql.jdbc.Driver");
		         System.out.println("1. connector연결 성공!!!");
		         
		         String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
		         String username = "root";
		         String password = "1234";
		         Connection con = DriverManager.getConnection(url, username, password);
		         System.out.println("2. shoes db연결 성공!!!");
		         //3. sql문을 만든다.
		         String sql = "select * from member";		// 멤버 테이블을 전체 가져올것이라서 .
		         PreparedStatement ps = con.prepareStatement(sql);
		        
		         System.out.println("3. sql문 생성 성공!!!");
		         //4. sql문을 mysql로 전송한다.
		        
		         rs = ps.executeQuery();				
		         System.out.println("4. sql문 전송 전송");
		         while(rs.next()) {						// 조건이 트루일때까지 -> row개수만큼 반복하게 됨. 	 
		        	// 가방을 만들어서 table 에서 하나의 row 를 꺼내준다음 가방에 넣어야 한다. 
		        	 회원Bag bag2 = new 회원Bag();
		        	 // row 를 가져옴 
		        	 String id = rs.getString(1); 
		        	 String pw = rs.getString(2); 
		        	 String name = rs.getString(3); 
		        	 String tel = rs.getString(4); 
		        	 System.out.println(id + " " + pw + " " + name + " " + tel );
		        	 // 가방에 넣음 
		        	 bag2.setId(id);
		        	 bag2.setPw(pw);
		        	 bag2.setName(name);
		        	 bag2.setTel(tel);
		        	 // 만들어진 가방을 컨테이너(arraylist)에 넣어주어야 한다. 가방에 넣는 부분
		        	 list.add(bag2);	//row 의 개수만큼 가방을 리스트에 넣어주는 구문 
				}// while 
		      } catch (ClassNotFoundException e) { //1단계
		         System.out.println("1번 에러>> 드라이버 없음.!!!!");
		         e.printStackTrace();
		      } catch (SQLException e) { //2-4단계
		         System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
		         e.printStackTrace();
		      }
		      return list;
		   } //read end 
	   

	
}//class

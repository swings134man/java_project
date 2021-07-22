package mega;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
   public int create(String id, String pw, String name, String tel) throws Exception {
      //1.JDBC Connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector 연결성공!!");
    
      //2.java에서 DB로 연결 : 연결할 주소 URL(ip, port, DB명), user name, password
      String url = "jdbc:mysql://localhost:3306/shop";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      //import java.sql.Connection;경로확인
      System.out.println("2. db 연결성공!");
      
      //3.sql문을 만든다.
      String sql = "insert into member values (?, ?, ?, ?)";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, id);
      ps.setString(2, pw);
      ps.setString(3, name);
      ps.setString(4, tel);
      System.out.println("3. SQL문 연결성공!!");
      
      //4.sql문을 mysql로 전송한다.
      int result = ps.executeUpdate();
      System.out.println("4. SQL문 전송 성공!");
      System.out.println("SQL문 수행개수 " + result);
      return result; 
   }//create end
}
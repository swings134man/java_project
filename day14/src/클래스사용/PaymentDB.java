package 클래스사용;

public class PaymentDB {
	String ip = "localhost";		
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = "PayMent";
	
	
	public void create() {
		System.out.println("카드정보 입력");
		System.out.println("주문정보 정리 입력");
	}
	
	public void read() {
		System.out.println("주문정보 검색");
	}
	
	public void update() {
		System.out.println("카드 입력정보 수정");
	}
	
}

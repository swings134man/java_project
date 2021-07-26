package dto;

public class 회원Bag {
	
	//public String id => 모든패키지에서 접근 가능
	// private String id: // 해당 클래스안에서만 접근 가능. 
	private String id;	//default접근제어자, 같은 패키지내에서만 접근 가능
	private String pw;
	private String name;
	private String tel; 	// String tel = null;
	// 멤버변수, 클래스 바로 아래 선언됨. 
	// 선언의 위치는 생존범위를 결정. => 클래스 전역에서 사용가능. 
	// 전역변수(Global, 글로벌변수), 자동 초기화
	// 참조형인 경우 null 로 초기화됨. 
	
	// 값을 넣을 때는 set변수명(), setId 변수명 첫글자는 대문자. 
	// 값을 꺼낼 떄는 get변수명()	, getId
	// getters/setters 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "회원Bag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	
	
	
	
}

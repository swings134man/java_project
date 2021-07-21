package 생성자;

public class Phone {

	String com;
	String num;
	String who;
	public Phone(String com, String num, String who) {
		this.com = com;
		this.num = num;
		this.who = who;
	}

	public String toString() {
		return "Phone [com=" + com + ", num=" + num + ", who=" + who + "]";
	}
	
	
	
	
	
	
	
//	public Phone(String com, String num, String who) {
//		//this는 이 클래스를 나타냄. this.com의미는 이 클래스의 바로 아래에 있는 com변수
//		this.com = com;
//		this.num = num;
//		this.who = who;
//	}
//	public String toString() {
//		return com +", " + num +", "+ who;
//	}
	
	
	
	
	
	
	
}

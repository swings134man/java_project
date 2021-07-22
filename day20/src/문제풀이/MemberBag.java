package 문제풀이;

public class MemberBag {

	
	String id;
	String pw;
	String name;
	String tel;
	public MemberBag(String id, String pw, String name, String tel) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "MemberBag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}

	
	
	
	
}

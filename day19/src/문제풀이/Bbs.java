package 문제풀이;

public class Bbs {

	String no;
	String title;
	String content;
	String writer;
	public Bbs(String no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public String toString() {
		return  no +"   " + title + "   " + content + "   " + writer;
	}
	
	
	
	
	
	
}

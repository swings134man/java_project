package 문제풀이;

public class BbsDB {

	
	
	public void create(String cre) {
		System.out.println(cre);
	System.out.println("해당 글이 등록되었습니다");
	}
	
	
	String pw = "1111";
	
	public void delete(String del) {
		System.out.println();
		if (pw.equals("1111")) {
			System.out.println("게시물이 삭제 되었습니다!");
		}else {
			System.out.println("비밀번호가 틀렸습니다 다시 입력하세요.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

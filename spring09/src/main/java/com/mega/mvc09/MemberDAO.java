package com.mega.mvc09;

import org.springframework.stereotype.Repository;

// DAO 는 무조건 싱글톤으로 만들어주어야 한다.
@Repository //싱글톤으로 만들어준다. 싱글톤을 만들어줄 객체가 아니면 어노테이션 달지 않는다. 
public class MemberDAO {

	
	
	public boolean login(MemberDTO dto) {
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false;		//컨트롤러에 결과를 알려주기 위한 변수.
		if (dto.getId().equals(dbId) && dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
	}//login
	
	
	
	
	
	public void create() {
		
	}
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
	
}//DAO END

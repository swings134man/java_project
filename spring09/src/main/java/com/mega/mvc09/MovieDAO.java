package com.mega.mvc09;

import org.springframework.stereotype.Repository;

@Repository
public class MovieDAO {

	public boolean pay() {
		System.out.println("결제가 완료 되었습니다.");
		return true;
	}
	
}

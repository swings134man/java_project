package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 싱글톤 객체, 스프링에 컨트롤로 등록. 
@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; //스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다...!!!
	
	
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO) {
		// 컨트롤러의 메서드내에 선언된 파라메터는 무조건 프로토타입으로 만들어준다. 
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소 : " + dao);
		boolean result = dao.login(memberDTO);
		if (result) {
			return "ok";		//views/ok.jsp
		}else {
			return "no";		//views/no.jsp
		}//else
	}//login
	
	
	@RequestMapping("check.mega")
	public String check(String nick) {
		System.out.println(nick);
		if (nick.equals("superman")) {
			return "super";
		}else {
			return "common";
		}
	}
	
	@RequestMapping("password.mega")
	public String password(String pass) {
		System.out.println(pass);
		if (pass.equals("1234")) {
			return "pass";
		}else {
			return "redirect:index.jsp";
			//response.sendRedirect("index.jsp");
		}
	}
	
	
	
	
	
}

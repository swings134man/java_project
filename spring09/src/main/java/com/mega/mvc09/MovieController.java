package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@Autowired
	MovieDAO dao;
	
	@RequestMapping("movie.do")
	public String movie(String name, int price) {
		System.out.println(name + ", " + price +100);
		if (price >= 10000) {
			return "pay";
		}else {
			return "redirect:movie.jsp";
		}
	}
	
	
	@RequestMapping("pay.do")
	public String moviePay() {
		
		boolean result = dao.pay();
		if (result) {
			return "ok2";
		}else {
			return "redirect:movie.jsp";
		}//else
	}//moviePay()
	
	
	
	
}

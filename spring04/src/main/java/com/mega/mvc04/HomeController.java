package com.mega.mvc04;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping("create.mega")
	public void create(BbsDTO dto) {
		System.out.println("전송됨.");
		System.out.println("전달받은 no :" + dto.getNo());
		System.out.println("전달받은 title :" + dto.getTitle());
		System.out.println("전달받은 content :" + dto.getContent());
		System.out.println("전달받은 writer :" + dto.getWriter());
	}
	
}

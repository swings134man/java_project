package com.mega.mvcTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {

	
	@RequestMapping("jsonResponse1")	
	@ResponseBody
	public BookBag json1() {
		// db 에서 row 1개를 가지고 와서 데이터를 클라이언트에게 주고 싶은 경우.
		BookBag bag = new BookBag();
		bag.setId("naver");
		bag.setUrl("monday2");
		bag.setName("http://www.naver.com");
		bag.setImg("resources/img/car.png");
		return bag;
	} //json1
	
	@RequestMapping("jsonResponse2")	
	@ResponseBody
	public List<BookBag> json2() {

		List<BookBag> list = new ArrayList<BookBag>(); //업캐스팅
		for (int i = 0; i < 100; i++) {
			BookBag bag = new BookBag();
			bag.setId("naver" + i);
			bag.setUrl("monday2"  + i);
			bag.setName("http://www.naver.com");
			bag.setImg("resources/img/car.png");
			
			list.add(bag);
		}
		return list;
	} //json1
	
	@Autowired
	SkiDAO dao;
	
	@RequestMapping("dbGO")
	@ResponseBody
	public void dbdb(String name, String tel) {
		dao.insert(name, tel);
	}
	
}//class

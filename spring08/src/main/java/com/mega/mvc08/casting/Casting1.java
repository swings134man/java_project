package com.mega.mvc08.casting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.mega.mvc08.MemberDTO;

public class Casting1 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		MemberDTO dto = new MemberDTO();
		dto.setId("kang");

		list.add(dto);		////Object(큰) <--자동형변환-- MemberDTO(작)
		list.add("hong"); //Object(큰) <--자동형변환-- String(작)
		list.add(new Date()); //Object(큰) <--자동형변환-- Date(작)
		list.add(new Random()); //Object(큰) <--자동형변환-- Random(작)
		
		list.add(100); //Object <--자동형변환(업캐스팅,UpCasting)-- Integer(작) <---auto-boxing---int(기본형)
		list.add(11.1); //object <--자동형변환 -- Float(작) <---auto-Boxing--- float(기본형)
		
		System.out.println(list);
		
		
		Object dto2 = list.get(0);
		//System.out.println(dto2.getId());
		// 업캐스팅되어 Object로 들어간 객체는 원래클래스가 가지고 있던
		// 자식에서 추가된 메서드를 쓸 수 없게 된다.
		// 부모클래스로 업캐스팅하는 경우는 자식에서 추가된 메서드를 인식못한다.
	
		// 자식에서 추가된 메서드를 사용하고 싶으면
		// 다시 자식타입으로 변환해야 한다.
		// 자식타입은 부모타입보다 작으므로 강제형변환이 필요하다. 
		MemberDTO dto3 = (MemberDTO)list.get(0);
		//MemberDTO(작) <--강제형변환(다운캐스팅)-- Object 
		System.out.println(dto3.getId());
		
		int a = (Integer)list.get(4);
		System.out.println(a + 1);
		// int <--오토언박싱 -- Integer <- 다운캐스팅 --Object
		
		double b = (double)list.get(5);
		System.out.println(b + 100);
		// double <--오토언박싱 -- Double <- 다운캐스팅 --Object
		
		
		
	}
}

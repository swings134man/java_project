package com.mega.mvc08.casting;

import java.util.ArrayList;

public class CastingQuestion01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		
		System.out.println(list);
		
		int money = (Integer)list.get(0);
		System.out.println(money + 2000);
		// int <--오토언박싱 <--Integer <-- 다운캐스팅 <--object
		
		double height = (Double)list.get(1);
		System.out.println(height + 10);
		// double <-- 오토언박싱 <--Double <-- 다운캐스팅 <--object
		
		boolean morning = (Boolean)list.get(2);
		if (morning) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		char gender = (Character)list.get(3);
		if (gender == '남') {
			System.out.println("주민 번호는 1,3 이에요");
		}else if(gender == '여'){
			System.out.println("주민 번호는 2,4 이에요");
		}
		
		
		
		
	}
}

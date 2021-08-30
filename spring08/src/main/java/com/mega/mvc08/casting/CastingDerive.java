package com.mega.mvc08.casting;

import com.mega.mvc08.extend.BallPen;
import com.mega.mvc08.extend.Product;

public class CastingDerive {

	public static void main(String[] args) {

		// 파생된 데이터, 참조형변수 
		// 참조형 변수는 전부 클래스임. 
		// 형변환(Casting)
		// 참조형 형변환은 "상속관계에 있는 클래스간" 가능.
		Product p = new Product(); //부모, 수퍼클래스, 큼
		BallPen b = new BallPen(); //자식, 서브클래스, 작음
		// 클래스간의 크기는 "개념" 을 가지고 큰지 작은지를 판별한다.
		
		p = b; // 큰 <--자동형변환-- 작
		System.out.println(p);
		
		b = (BallPen)p; // 작 <--강제형변환-- 큰
		System.out.println(b);
		
		
	}
}

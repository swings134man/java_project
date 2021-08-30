package com.mega.mvc08.extend;

public class BallPen extends Product{

	float thick;
	
	
	public void write() {
		System.out.println("글을쓰다.");
		
	}


	@Override
	public String toString() {
		return "BallPen [thick=" + thick + ", price=" + price + ", company=" + company + "]";
	}
	
	
	
	
}

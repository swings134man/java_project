package com.mega.mvc08.extend;

public class PenMain {

	public static void main(String[] args) {

		
		BallPen t = new BallPen();
		t.company = "mega";
		t.price = 1000;
		t.thick = (float) 1.1;
		t.buy();
		t.write();
	
		System.out.println(t);
	}

}

package 메서드반환값;

import java.util.Random;

public class 다양한리턴사용22 {

	public int get(int x) {
		
		return x * 2;
	}

	
	public double get() {
		double d = 11.11;
		return d;
	}
	
	
	public int[] get2() {
		int[] b = {10,20,30,40,50};
		return b;
	}
	
	
	public Random get3() {
		Random r = new Random();
		return r; 
		
	}	
	
	
	
	
	
}

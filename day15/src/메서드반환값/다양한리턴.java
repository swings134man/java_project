package 메서드반환값;

import java.util.Date;

public class 다양한리턴 {

	public int add() {
		return 100;
	}

	public double add2() {
		return 11.11;
	}

	public char add3() {
		return 'a';
	}

	public boolean add4() {
		boolean result = true;
		return result;
	}

	public String add5() {
		return "ok";
	}

	public Date add6() {
		Date date = new Date();
		return date;
	}

	public int[] add7() {
		int[] num = { 1, 2, 3 };
		return num;
	}

	public 계산기 add8() {
		계산기 cal = new 계산기();
		return cal;
	}

	
	
	
	
	
	
	
	
	
	
}

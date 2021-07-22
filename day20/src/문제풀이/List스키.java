package 문제풀이;

import java.util.ArrayList;

public class List스키 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		list.remove(1);
	
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "등: " + list.get(i));
		}
		for (Object o : list) {
			System.out.println(o);
		}
		
	}
}

package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;

public class 문제풀이1 {

	public static void main(String[] args) {

		
		// 1.
		ArrayList list = new ArrayList();
		list.add("김연아");
		list.add("김영아");
		list.add("김양아");
		list.add("김용아");

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i +1) +"등 : " + list.get(i));
		}
		list.remove(3);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i +1) +"등 : " + list.get(i));
		}
		
		
		System.out.println();
		
		//2. 
		HashSet set = new HashSet();
		set.add("휴지");		
		set.add("휴대폰");		
		set.add("볼펜");		
		set.add("휴지");		
		System.out.println("가방에 들어간 물건 : " + set);
		System.out.println("물건의 개수 " + set.size());
		
		
		
		
	}//main
}//class

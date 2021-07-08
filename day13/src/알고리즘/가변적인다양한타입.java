package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입 {

	public static void main(String[] args) {

		//set : 집합, 중복된 값을 허용하지 않음. 
		HashSet set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(100);
		
		System.out.println(set.size());
		System.out.println(set);
		
		
		ArrayList list = new ArrayList();
		//많은 양의 데이터를 다룰 때, 가변, 다양한 데이터 타입인경우 사용 
		//입력값은 전부 참조형으로 들어간다 . 
		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("감자");
		Random r = new Random();
		list.add(r);
		System.out.println(list);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
		
		System.out.println(list.size());
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		
		list.remove(5);				// 해당 인덱스 삭제. 
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		
		
		
		int[] s = {11,22,33}; 
		System.out.println(s[0]);
		
		
		
		
		
		
		
		
	}//main
}

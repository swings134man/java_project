package 문제풀이;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션문제 {

	public static void main(String[] args) {

		//1. 
		HashSet set1 = new HashSet();
		set1.add("디자이너");
		set1.add("프로그래머");
		set1.add("DB관리자");
		System.out.println("팀원목록: " + set1);
		//2. 
		LinkedList queue1 = new LinkedList();
		queue1.add("상한우유");
		queue1.add("싱싱우유");
		queue1.remove();
		System.out.println(queue1);
		//3. 
		HashMap map = new HashMap();
		map.put("1번", "엄마");
		map.put("2번", "아빠");
		map.put("3번", "친구");
		map.put("4번", "동생");
		System.out.println("2번은 " + map.get("2번"));
		//4.
		
		LinkedList queue = new LinkedList();
		queue.add("국어");
		queue.add("수학");
		queue.add("영어");
		queue.add("컴퓨터");
		System.out.println( "전체 시험볼 과목 : " + queue);
		for (int i = 0; i < queue.size()+1; i++) {
			queue.remove();
			System.out.println((i +1 ) + "일차 시험본후 남은 과목: " + queue);
		}
		
		
	}

}

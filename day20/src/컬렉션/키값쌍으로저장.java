package 컬렉션;

import java.util.HashMap;

public class 키값쌍으로저장 {

	public static void main(String[] args) {

		HashMap dic = new HashMap();
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("메론", "melon");
		System.out.println(dic);
//		dic.clear();
		System.out.println(dic.size());
		System.out.println(dic.get("사과"));
		dic.put("사과", "blueApple");
		System.out.println(dic.get("사과"));
		dic.remove("바나나");
		System.out.println(dic);
		
	}

}

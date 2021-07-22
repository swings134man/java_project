package 컬렉션;

import java.util.ArrayList;

import javax.swing.JFrame;

public class 순서있는목록 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);	//기본형 -> 클래스변환 -> Object 
		list.add(22.22);
		list.add(true);
		list.add('남');
		list.add(new JFrame());
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(4)); //인덱스로 지운것
		list.add("목요일");
		System.out.println(list.size());
		list.remove(5);
		list.remove("홍길동");
		//list.remove(new Integer(100)); //100값을 삭제
		System.out.println(list.size());
		System.out.println(list.get(0));
		list.add(0, "김길동");			//0번앞에 김길동을 add !
		System.out.println(list.get(0));
		System.out.println(list);
		list.set(0, "홍길동");
		System.out.println(list);
		
		
	}

}

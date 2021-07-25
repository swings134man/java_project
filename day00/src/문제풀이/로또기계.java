package 문제풀이;

import java.util.HashSet;
import java.util.Random;

public class 로또기계 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet set = new HashSet();
			while (set.size() < 6) {
				int num = r.nextInt(45) + 1;
				System.out.println("번호 " + set.size() + " : " + num);
				set.add(num);
			}
			System.out.println("번호는 : " + set);
			System.out.println(set.size());
	}//main
}//class

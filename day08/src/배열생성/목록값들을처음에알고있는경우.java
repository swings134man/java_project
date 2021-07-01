package 배열생성;

public class 목록값들을처음에알고있는경우 {

	public static void main(String[] args) {

		//배열을 만들떄는 처음부터 값들을 알고있는 경우/ 모르는경우 

		String[] names = {"홍길동", "송길동" , "박길동" , "정길동" , "장길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String s : names) {
			System.out.println(s);
		}
		
		int[] ages = {100, 88, 55, 10, 4};
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		for (int x : ages) { 			//오른쪽에는 항상 큰값. ex.배열
			System.out.println(x);
		}
		
		double[] eyes = {2.0, 1.5, 1.2, 0.8, 1.0};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		
		for (double d : eyes) {
			System.out.println(d);
		}
		
		char[] gendes = {'남', '여', '남', '여','남'};
		for (int i = 0; i < gendes.length; i++) {
			System.out.println(gendes[i]);
		}
		
		for (char c : gendes) {
			System.out.println(c);
		}
		
		boolean[] food = {true, false, true, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
		for (boolean b : food) {
			System.out.println(b);
		}
		
		
		
		
	}

}

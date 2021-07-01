package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {

		
		// int[] : int배열을 가르키는 주소가 들어간다는 의미
		// s : 힙영역에 할당된 저장공간의 주소가 들어간다. 
		// = : 힙영역에 할당된 저장공간의 주소를 변수에 넣는다. 
		// new :  힙영역에 지정된 타입의 크기만큼 배열을 만들어라. 
		// int[10] : 배열로 만들어질 타입과 크기 설정.

		int[] s = new int[10];
		// 1(int[] s) - 3(new int[10]) - 2(=) 
			System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " "); 	//배열은 자동 초기화이기때문에 결과값이 0
			//배열은 자동초기화. 
		}
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + 1 + " ");
		}
		
		
	}
}

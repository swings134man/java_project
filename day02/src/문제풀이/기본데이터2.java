package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		/*색을 저장(r)
		호실을 저장 (709)
		평균나이를 저장 (27.5)
		--------------------
		1.선언
		2.대입
		3.출력
		4.그
		예약어는 저장공간의 공간을 쓸 수 없다.
		char, int, class
		1. 선언 
*/
		//color = 'y' // 변수가 선언되지 않아 값을 대입할 수 없다. 
		
		char color;
		int num;		// 숫자는 계산을 할때 int로 지정, 아니면 문자로 지정
		double avgAge;  // 낙타표기법, avg_age*(파이썬,뱀표기법 snake 표기법)
		
		// 2. 할당, 대입
		color = 'r';
		num = 709;
		avgAge = 27.5;
		// 변수(variable, 값이 변한다) : ram에 저장공간에 들어갈 값은 변할 수 있다.
		// 램에 만들어지는 저장공간을 변수라고 부른다. 
		// color = 'b' 
		// 변수하나에는 값이 하나만 저장! b를 다시 지정하면 변수 'r' 은 사라짐. 
		
		// 3. 출력(프린트)
		System.out.println("색은 " + color); //결합연산자 
		System.out.println("방번호는 " + num + "호"); 
		System.out.println("평균나이 " + avgAge);
		
		//한줄 복사: mac: command + option +방향키	 window: ctrl + alt + 화살표아래
		//한줄 이동: mac: opt + 방향키 				 window: alt + 이동화살표
		//한줄 삭제: mac: command + d 			     window: ctrl + d
		
	}	
}

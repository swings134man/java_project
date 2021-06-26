package 복습;

import javax.swing.JOptionPane;
	// 위같은경우 javax 라는 폴더에 들어가라 (.) 그다음 swing(폴더) 안에 jop

public class 순차문1 {

	public static void main(String[] args) {

		// 순차문은 입력-> 처리-> 출력의 순
		// 1.입력, 클릭하고 f2 : import를 안썻을때 사용하려면. 또는 마지막글자를 지우고 다시 자동완성
		// 모든 입력 데이터는 컴퓨터는 스트링으로 읽어온다!
		// 숫자로 쓸지, 스트링 그대로 쓸지는 프로그래머가 결정한다. 
		// 숫자로 써야한다면 숫자로 변환하는 처리를 해주어야 한다. (캐스팅)
		// 변환하는 처리 기능을 가진 부품을 찾아서 쓰면 된다. integer. ~~~
		// jop라는 부품을 갔다놓고 .를 찍어서 어떤걸쓸건지 고름. 
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?");
		
		// 2.처리, "금요일은 27.5도"
		String result = today + "은 " + temp + "도";
		
		// 3.출력, sysout + cmd + spacebar
		System.out.println(result);
	
		
	} //main
} //class 

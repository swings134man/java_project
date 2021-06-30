package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 입력>>>");
		int n1 = sc.nextInt();
		
		System.out.print("숫자2 입력>>>");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("숫자1이 더 큽니다.");
		} else if(n2 > n1){
			System.out.println("숫자2가 더 큽니다.");
		}else {
			System.out.println("숫자1과 2가 같습니다.");
		}
		
		
		
		System.out.print("과목을 입력(자바, c, python) >>>");
		String data = sc.next();
		if (data.equals("자바")) {
			System.out.println("jsp점프@@");
		}else if (data.equals("c++")) {
			System.out.println("asp점프@@");
		}else {
			System.out.println("python로 점프@@");
		}
		
		switch (data) {
		case "자바":
			System.out.println("jsp점프@@");
			break;
		case "c":
			System.out.println("c++점프@@");
			break;
		default:
			System.out.println("python로 점프@@");
			break;
		}
		
		
		
		
		
		
		
		
//		
//		String s2 = "java";
//		String s3 = "c++";
//		String s4 = "swift";
//		
//		if (s1.equals(s2)) {
//			System.out.println("java");
//		} else if(s1.equals(s3)){
//			System.out.println("c++");
//		}else if(s1.equals(s4)) {
//			System.out.println("swift");
//		} else {
//			System.out.println("해당값이 존재하지 않습니다.");
//		}
//		
		
		
		
		
		
		
		
		
	}//main
}//class

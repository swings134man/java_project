package pack02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

//		2) 스캐너 이용
		Scanner sc = new Scanner(System.in);		// 스캐너로 입력할수있게 스캐너 생성
		
//		
		System.out.print("당신의 소속은>> ");
		String a = sc.next(); 								//입력값을 string 으로 a에넣어줌.
		System.out.println("당신의 소속은 " + a + "이시군요!");	// 입력값 결과를 출력 
		
//		3)
		System.out.print("당신의 나이는>> ");
		int b = sc.nextInt();								// 입력값을 int 로 변환및 저장.
		System.out.println("당신의 작년나이는 " + (b -1) + "세였겠군요!");	//작년나이를 구해야해서입력한 현재나이에 -1 살
		
		
		System.out.print("현재 당신의 몸무게는>> ");
		double c = sc.nextDouble();
	
		if (c >= 90) {										// 입력값이 90이상일때 조건
			System.out.println("당신은 지금 과체중!");
		}else if (c >= 70) {								// 입력값이 70이상일때 조건
			System.out.println("당신은 지금 보통체중이군요!");	
		}else {												// 입력값이 70미만일때 조건
			System.out.println("미달입니다!");
		}
		
		System.out.print("당신은 결혼하셨나요? >> ");
			String d = sc.next();									// 입력값을 string 값으로 저장 
		if (d.equals("false")) {									// 입력값이 true 일때 false 이면?
			System.out.println("당신은 배우자가 없겠군요!");
		} else if (d.equals("true")){											// true일때 조건
			System.out.println("당신은 배우자가 있겠군요.");
		}
		
		
		
		
	}

}

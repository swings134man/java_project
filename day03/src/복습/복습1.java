package 복습;

public class 복습1 {

	public static void main(String[] args) {
/*
		//기온변수
		float toTemp = 26.2f; 
		float yeTemp = 27.5f; 
		
		// 오늘정보
		String day = "목요일";
		String date = "6월 24일 ";
		
		// 오늘온도, 어제온도 비교  
		boolean a = toTemp == yeTemp;
		boolean b = toTemp > yeTemp;
		
		
		System.out.println("오늘은 " + date + day + "입니다!");
		System.out.println(a);
		System.out.println(b);
		*/
		
		// 강사님이 사용하신코드 
		double temp = 26.2;		//8바이트
		int classNo = 8;		//4바이트
		char day = '목'; 		//2바이트
		boolean food = false; //1 바이트
		String lunch = "1층가서 생각해보자.";	//11(글자수) *2 = 22바이트 + 8바이트(lunch)  
		
		System.out.println("오늘 온도 " + temp + "도");
		System.out.println("오늘 수업 수 " + classNo);
		System.out.println("오늘 요일 " + day);
		System.out.println("아침 먹었나요 " + food);
		System.out.println("점심 어떻게 하지? " + lunch);
		System.out.println(temp == 27.5);
		System.out.println(temp > 27.5);
		// Q. 오늘 온도 29.2로 변경, 어제의 온도보다 낮은
		temp = 29.2;
		System.out.println(temp < 27.5);
		
		
		
		
		
	}

}

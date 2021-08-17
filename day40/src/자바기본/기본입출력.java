package 자바기본;

import java.util.Scanner;

public class 기본입출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 콘솔과 자바프로그램간 입력스트림(입력용 연결통로)이 만들어진다. 
		// 에러의 원인 -> 기본생성자를 만들어두지 않았기 때문에 호출 불가. 
		// 기본생성자는 자동으로 생성됨. 단 !! 파라메터있는 생성자가 없는경우에만 가능
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇도인가요?>>>> ");
			int temp = sc.nextInt();
			if (temp >= 30) {
				System.out.println("너무 더워요!!!");
			} else if (temp < 30) {
				System.out.println("괜찮아요!");
			}
			sum = sum + temp;
		}
		
//		for (int i = 0; i < 3; i++) {						//3번 비교
//			System.out.print("어제온도는 몇도입니까? >> ");		
//			float yest = sc.nextFloat();						//어제 온도값 int 값으로 변환 및 변수 저장.
//			System.out.print("오늘온도는 몇도입니까? >> ");
//			float today = sc.nextFloat();						//오늘 온도값 int 값으로 변환 및 변수 저장.
//			if (yest == today) {							//어제,오늘 온도가 같으면.
//				System.out.println("어제와 오늘의 온도가 같아요!!"); // 출력
//			} else if (yest > today) {						// 어제 온도가 오늘 온도보다 높으면
//				System.out.println("어제가 더 더워요!!!");		// 출력
//			} else if (yest < today) {						//오늘 온도가 어제 온도보다 높으면
//				System.out.println("오늘이 더 더워요!!!");		// 출력
//			} 
//		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print("국어점수는? >>");
			int eng = sc.nextInt();
			System.out.print("수학점수는? >>");
			int math = sc.nextInt();
			if (eng > math) {
				System.out.println("문과를 가시겠습니까?");
				boolean eng1 = sc.nextBoolean();
				if (eng1) {
					System.out.println("간다");
				}else {
					System.out.println("안간다.");
				}
			} else if(math > eng){
				System.out.println("이과를 가시겠습니까?");
				boolean math1 = sc.nextBoolean();
				if (math1) {
					System.out.println("간다");
				}else {
					System.out.println("안간다.");
				}
			}else if(eng == math) {
				System.out.println("점수가 같습니다! 문과를 가시려면 1번 이과를 가려면 2번");
				int con = sc.nextInt();
				if (con == 1) {
					System.out.println("문과를 선택하셨습니다!");
				} else if(con == 2){
					System.out.println("이과를 선택하셨습니다!");
				}
			}
			
		}
		
		
		sc.close();	 //입력스트림 꼭 닫아줘야함. 
	}// main
}// class

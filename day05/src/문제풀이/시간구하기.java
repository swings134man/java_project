package 문제풀이;

import java.util.Date;

public class 시간구하기 {

	public static void main(String[] args) {

		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int day = date.getDay();
		int month = date.getMonth() + 1;

		// hour
		if (10 > hour) {
			System.out.println("굿모닝");
		} else if (15 > hour) {
			System.out.println("굿애프터눈");
		} else if (20 > hour) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}

		// day
		if (day == 0 || day == 6) {
			System.out.println("토/일요일 이면 쉬어요.");
		} else {
			System.out.println("나머지 요일이면 달려요.");
		}
		
		// month
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		} else if (month == 6 || month == 7 || month == 8){
			System.out.println("여름");
		}else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}

	} //main
} //class

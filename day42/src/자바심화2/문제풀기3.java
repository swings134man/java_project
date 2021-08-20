package 자바심화2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 문제풀기3 {

	public static void main(String[] args) {

		HashMap<String, String> list = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		int army = 0;
		int noarmy = 0;
		
		while (true) {
			System.out.println("1) 입력 2) 종료");
			int choice = sc.nextInt();
			if (choice == 2) {
				Iterator<String> mapIter = list.keySet().iterator();
				 
		        while(mapIter.hasNext()){
		        	
		            String key = mapIter.next();
		            String value = list.get( key );
		            
		            System.out.println(key+" : "+value);
		        }//while
				
				System.out.println("현역은 : " + army + "명");
				System.out.println("면제자는 : " + noarmy + "명");
				System.out.println("프로그램 종료");
				break;
			}else if(choice == 1) {
				System.out.print("주민번호 : ");
				String number = sc.next();
				System.out.print("키 : ");
				float height = sc.nextFloat();
				System.out.print("몸무게 : ");
				float weight = sc.nextFloat();
				System.out.print("시력 : ");
				float eyes = sc.nextFloat();
				System.out.println("병명 : 1)없음, 2)평발, 3)고혈압.");
				int hos = sc.nextInt();
				
				float bmi = weight / height ;
				if (height < 150 || height > 190 || eyes <= 0.0 || bmi >= 30) {
					System.out.println("면제입니다.");
					list.put(number, "면제");
					noarmy++;
					grade = 0;
				}else {
				if (height >= 150 || height <= 190) {
					grade += 20;
				}else if(weight >= 35 || weight <= 100) {
					grade += 20;
				}else if(eyes >= 0.1) {
					grade += 10;
					if (eyes >= 0.5) {
						grade += 10;
					}else if(eyes >= 1.0) {
						grade += 10;
					}
				}//eyes 
				if (hos == 1) {
					grade += 30;
				}else if(hos == 2) {
					grade += 20;
				}else if(hos == 3) {
					grade += 10;
				}
				
				if (grade >= 40) {
					System.out.println("현역입니다.");
					System.out.println("점수는 : " + grade);
					army++;
					list.put(number, "현역");
				}else if(grade < 40) {
					System.out.println("면제입니다.");
					System.out.println("점수는 : " + grade);
					noarmy++;
					list.put(number, "면제");
				}
				
				}// else
			}// choice else if
			
		}//while
	
		
		
		
		
		
		
		
	}//main
}//class

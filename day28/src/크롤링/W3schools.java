package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;	//tag 가 담긴 arraylist 

public class W3schools {

	public static void main(String[] args) {

	try {
		Document doc = Jsoup.connect("http://www.w3schools.com/tags/default.asp").get();
		System.out.println("1. 사이트 연결 성공.@@");
		System.out.println("2. 소스 받아오기 성공.@@");
//		System.out.println(doc);

		Elements list = doc.select("a.w3-bar-item");
		System.out.println(list.size() + "개");
//		for (Element tag : list) {
////			System.out.println(tag.text());	
//			System.out.println(tag);	
//		}
		for (int i = 0; i < list.size(); i++) {		//인덱스 번호검색 
			System.out.println(i + ": " +list.get(i));
		}
		for (int i = 8; i < 18; i++) {				// 해당 인덱스 번호 a태그 사이에 string 값
				System.out.println(list.get(i).text());
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	
		
	} // main
} // class

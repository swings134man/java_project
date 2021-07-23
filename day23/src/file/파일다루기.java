package file;

import java.io.File;

public class 파일다루기 {

	public static void main(String[] args) {

		
		File file = new File("/Library/data");
//		File file = new File("data.rtf");
//		File file = new File("test.txt");
		
//		file.delete();
		boolean result = file.exists();
		if (result) {
			System.out.println("파일이나 폴더 존재함");
			System.out.println(file.getAbsolutePath());
			if (file.isDirectory()) {
				System.out.println("폴더입니다.!!!");
			}else {
				System.out.println("파일입니다.!!!");
			}
		}else {
			System.out.println("파일이나 폴더가 존재하지 않음.");
		}
		
		File[] list = file.listFiles();
		System.out.println(list.length);
		for (File x : list) {
			System.out.println(x);
		}
		System.out.println();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		
		
		
		
		
		
	}// main

}//class

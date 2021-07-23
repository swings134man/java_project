package file;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {

		
		File file = new File("/Library/Java/JavaVirtualMachines/jdk1.8.0_291.jdk/Contents");
		
//		file.delete();
		boolean result = file.exists();
		
		if (result) {
			if (file.isDirectory()) {
				System.out.println("폴더 존재");
			}else {
				System.out.println("파일입니다.");
			}
		}else {
			System.out.println("존재하지 않음");
		}
		
		
		File[] list = file.listFiles();
		System.out.println(list.length);
		
		for (File x : list) {
			System.out.println(x);
			System.out.println(x.isDirectory());
		}
		System.out.println(list.length + "개");
		
		
		
	}// main

}//class

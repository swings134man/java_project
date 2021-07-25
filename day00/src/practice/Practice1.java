package practice;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Practice1 {

	public static void main(String[] args) {
		

//		String a = "진석 성진 하영"; 
//		
////		String[] re1 = a.split(" ");
//		String re2 = a.replace(" ", "");
//		
////		System.out.println(re1[0]);
////		System.out.println(re1[1]);
////		System.out.println(re1[2]);
//
//		System.out.println(re2);
//		
//		
//		String nn = " 에베베 약오르징.  ";
//		String n2 = nn.trim();
//		System.out.println(n2);
//		
//		String k = "010-1111-2222";
//		String[] k1 = k.split("-");
//
//		for (String i : k1) {
//			System.out.println(i);
//		}
//		
//		String n3 = nn.replace("에","베");
//		String n4 = n3.trim();
//		String[] n5 = n4.split(" ");
//		for (String ii : n5) {
//			System.out.println(ii);
		
//		JFrame f = new JFrame();
//		f.setSize(300, 300);
//		
//		String[] s = {"아이패드", "맥북", "아이폰"};
//		String[][] s1 = {
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"},
//				{"10","30","20"}
//		};
//
//		
//	
//		
//		
//		JTable table = new JTable(s1,s);
//		
//		JScrollPane sc = new JScrollPane(table);
//		f.add(sc);
//			
//		
//		
//		f.setVisible(true);
		
		
		
//		int[][] a = new int[3][];
//		
//		int[] b = new int[4];
//		int[] c = new int[2];
//		int[] d = new int[6];
//		a[0] = b;
//		a[1] = c;
//		a[2] = d;
//		
//		a[1][0] = 1;
//		a[2][5] = 2;
//		
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println(a[0].length);
//		System.out.println(a[1].length);
//		System.out.println(a[2].length);
//		
		
		
		int[][] aa = new int[3][4];
		
		aa[0][3] = 1;
		
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				System.out.print(aa[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		int[][] aaa = {
				{1,1,1,1 },
				{2,2,2 },
				{3,3,3,3 },
				{3,3,3,3 },
			};
			
		for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[i].length; j++) {
			System.out.print(aaa[i][j] + " ");
		}
			System.out.println();
	}
		
	System.out.println(aaa[0].length);
		
		
		
	}// main
}// class

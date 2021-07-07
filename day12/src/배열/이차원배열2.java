package 배열;

public class 이차원배열2 {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		int[][] arrList = new int[3][];		//정방형이 아니라 열을 지정해줄수 없음. 
		arrList[0] = arr1 ;					//열의 갯수가 다르다면 1차원으로 만들어서 대입. 
		arrList[1] = arr2 ;
		arrList[2] = arr3 ;
		
		//		0	1	2	3	4
		//0		0	0	0
		//1		0	0	0	0	0
		//2		0	0	0	0

//		arrList[1][1] = 1;
//		arrList[1][3] = 1;
//		arrList[2][4] = 1;
		
		System.out.println(arrList.length);		
		System.out.println(arrList[0].length);
		System.out.println(arrList[1].length);
		System.out.println(arrList[2].length);
		
		
	}

}

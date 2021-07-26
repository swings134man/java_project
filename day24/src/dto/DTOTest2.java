package dto;

public class DTOTest2 {

	public static void main(String[] args) {

		//게시판 bag을 2개만들어서, 값들을 넣어보고,
		//넣은값들을 프린트 해보세요. toString()
		// 그림그려보기.
		
		게시판Bag bag = new 게시판Bag();
		bag.setId("apple");
		bag.setTitle("apple");
		bag.setContent("apple");
		bag.setWriter("apple");
		System.out.println(bag);
		
		게시판Bag2 bag2 = new 게시판Bag2();
		bag2.setId("samsung");
		bag2.setTitle("samsung");
		bag2.setContent("samsung");
		bag2.setWriter("samsung");
		System.out.println(bag2);
	}
}

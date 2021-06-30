package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {

		int yes = 0, no = 0; // 이렇게 해도 되고 따로따로해도 가능함

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배가 고픈가요?(배고프면1, 안고프면2) ");

			switch (reply) {
			case "1":
				yes++;
				break;
			case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2 중 선택해주세요.");
				i--; // 디폴트일때도for 문에 카운트는 되기때문에 보정하기위해서 i값을 --로 보정
				break;
			}//switch
		} // for
		System.out.println("배고픈사람" + yes + "명");
		System.out.println("배안고픈사람" + no + "명");

	} // main
}// class

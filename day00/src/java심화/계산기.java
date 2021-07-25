package java심화;

public class 계산기 {
	int left;
	int right;
	
	public 계산기(int left, int right) {
		this.left = left;
		this.right = right;
		System.out.println(this.left + this.right);
	}
	
	public void 결과() {
		int c = left + right;
		System.out.println(c / 2);
	}
	
	
	
}

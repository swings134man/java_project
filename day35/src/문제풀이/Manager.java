package 문제풀이;

public class Manager extends Employee{

	int bonus;
	
	public void test() {
		System.out.println("관리자입니다.");
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn="
				+ rrn + "]";
	}
	
	
	
}

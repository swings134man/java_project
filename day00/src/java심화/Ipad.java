package java심화;

public class Ipad {

	String color;
	String ver;
	String price;
	
	public Ipad(String color, String ver, String price) {
		this.color = color;
		this.ver = ver;
		this.price = price;
		System.out.println(toString());
	}
	public String toString() {
		return "Ipad [color=" + color + ", ver=" + ver + ", price=" + price + "]";
	}
	
}

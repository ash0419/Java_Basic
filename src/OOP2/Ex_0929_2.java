package OOP2;

class MyPoint {
	private int x;
	private int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" +x + ", " +y +")"; 
	}
	
	public boolean equals(MyPoint p) {
		MyPoint po = p;
		
		if (x == po.x && y == po.y) {
			return true;
		} else {
			return false;
		}
	}
}
public class Ex_0929_2 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		
		if(p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른 점");
		}
		
		Circle1 a = new Circle1(2, 3, 5);
		Circle1 b = new Circle1(2, 3, 50);
		System.out.println("원 a : " +a);
		System.out.println("원 b : " +b);
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		}else {
			System.out.println("다른 원");
		}
	}
}

class Circle1 {
	private int x, y, radius;
	
	public Circle1(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public String toString() {
		return "Circle(" +x +", " +y +") 반지름" +radius;
	}
	public boolean equals(Circle1 c) {
		Circle1 b = c;
		if(x == b.x && y ==b.y) {
			return true;
		}else {
			return false;
		}
	}
}

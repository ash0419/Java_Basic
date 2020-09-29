package OOP2;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(0, 0);
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public Point setXY(Point p) {
		return p;
	}
}

class ColorPoint extends Point {
	Point center;
	String color;

	public ColorPoint(Point center, String color) {
		this.center = center;
		this.color = color;
	}

	public ColorPoint() {
		this(new Point(0, 0), "BLACK");
	}

	public ColorPoint(int x, int y) {
		this.x = x;
		this.y = y;
		this.color = "BLACK";
	}

	public String setColor(String color) {
		return this.color = color;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return color + "색의  (" + x + ", " + y + ")";
	}

}

class Point3D extends Point{
	int z;
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "(" + x +", " +y +", " +z +")";
	}
	public int moveUp() {
		return this.z +1; 
	}
}

public class Ex_0929_test {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}

package OOP2;
/*
 포함관계(상속 X)
 	- 클래스 간의 관계를 맺어주는 방법
 	- 클래스 정의 시 멤버 변수에 다른 클래스 타입의 참조변수 선언
 */

public class DrawShape {
	public static void main(String[] args) {
		Circle c = new Circle(new Point(150, 150), 50);
		c.draw();
		
	}
}

class Shape {
	String color = "black";

	void draw() {
		System.out.printf("[color = %s]\n", color);
	}
}

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(0, 0);
	}

	String getXY() {
		return "(" + x + ", " + y + ")";
	}
}

class Circle extends Shape {
	Point center;
	//Point center = new Point(0,0);
	int r;

	public Circle(Point center, int r) {
		this.center = center;	//Point center = new Point(150,150)
		this.r = r;
	}

	public Circle() {
		this(new Point(0, 0), 100);
	}
	void draw() {
		System.out.printf("[center = (%d, %d), r = %d, color = %s]\n", center.x, center.y, r, color);
	}
}
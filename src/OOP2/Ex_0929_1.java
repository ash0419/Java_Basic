package OOP2;
class Point3 {
	private int x, y;
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint1 extends Point3 {
	String color;
	
	public ColorPoint1() {
		this(0,0);
	}
	public ColorPoint1(int x, int y) {
		super(x,y);
		color = "BLACK";
	}
	void setXY(int x, int y) {
		move(x, y);
	}
	void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+") 의 점";
	}
}
public class Ex_0929_1 {

}

package OOP2;
/*
 Super - 참조변수
 	this
 		-인스턴스 자신을 가르키는 참조변수
 		-인스턴스의 주소 저장
 	super
 		-부모의 멤버와 자신의 멤버를 구별하는 용도
 		-this와 같은
 		
 	super()
 		-부모의 생성자
 		-자식클래스의 인스턴스 생성시 -> 자식멤버+부모멤버 = 하나의 인스턴스
 		-부모의 멤버들도 초기화 필요
 			
 		Object 클래스 제외한 모든 클래스의 생성자 첫줄에는 생성자를 필히 호출
 		생략 시 컴파일러가 자동으로 super();
 	
 */

class Point1 {
	int x;
	int y;

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y : " + y;
	}
}

class Point3d extends Point1 {
	int z;

	public Point3d(int x, int y, int z) {
		super(x, y);
		this.z = z;

	}

}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;

	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

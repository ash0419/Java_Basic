package OOP2;
/*
 Super - ��������
 	this
 		-�ν��Ͻ� �ڽ��� ����Ű�� ��������
 		-�ν��Ͻ��� �ּ� ����
 	super
 		-�θ��� ����� �ڽ��� ����� �����ϴ� �뵵
 		-this�� ����
 		
 	super()
 		-�θ��� ������
 		-�ڽ�Ŭ������ �ν��Ͻ� ������ -> �ڽĸ��+�θ��� = �ϳ��� �ν��Ͻ�
 		-�θ��� ����鵵 �ʱ�ȭ �ʿ�
 			
 		Object Ŭ���� ������ ��� Ŭ������ ������ ù�ٿ��� �����ڸ� ���� ȣ��
 		���� �� �����Ϸ��� �ڵ����� super();
 	
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

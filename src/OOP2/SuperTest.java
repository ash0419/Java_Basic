package OOP2;
/*
 Super - ��������
 	 this
 	 	- �ν��Ͻ� �ڽ��� ����Ű�� ��������
 	 	- �ν��Ͻ��� �ּ� ����
 	 super
 	 	- �θ��� ����� �ڽ��� ����� �����ϴ� �뵵
 	 	- this�� ����
 	 	
 	 super()
 	 	- �θ��� ������
 	 	- �ڽ�Ŭ������ �ν��Ͻ� ������ -> �ڽĸ�� + �θ��� = �ϳ��� �ν��Ͻ�
 	 	- �θ��� ����鵵 �ʱ�ȭ �ʿ�
 	 	
 	 	Object Ŭ������ ������ ��� Ŭ������ ������ ù�ٿ��� �����ڸ� ���� ȣ��
 	 	���� �� �����Ϸ��� �ڵ����� super();
 */

class point1 {
	int x, y;

	public point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class point3d extends point1 {
	int z;
	public point3d(int x, int y, int z) {
		super(x, y);	//������ ù�ٿ�
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

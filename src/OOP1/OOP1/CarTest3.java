package OOP1;

/*
 �����ڿ��� �ٸ� ������ ȣ���ϱ�
 	this() - ������ ȣ��, this - ��������, �ν��Ͻ� �ڽ��� ����Ų��.
 
 	- �������� �̸����� Ŭ���� �̸� ��� this�� ����Ѵ�.
 	- �� �����ڿ� �ٸ� �����ڸ� ȣ���� �� ù �ٿ����� ����
 		> �ʱ�ȭ �۾� ���� �ٸ� �����ڸ� ȣ�� �� ȣ��� �ٸ� ������ �������� ����������� ���� �ʱ�ȭ �� �� ����
 */

class Car1 {
	String color;
	String gearType;
	int door;

	Car1() {
//		this.color = "Test"
		this("Black", "Manual", 4);
	}

	Car1(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	Car1(Car1 c) {
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
}

public class CarTest3 {
	public static void main(String[] args) {
		Car1 c1 = new Car1("White", "auto", 4);
		Car1 c2 = new Car1();

		System.out.printf("c1�� color = %s, gearTypr = %s, door = %d\n", c1.color, c1.gearType, c1.door);
		System.out.printf("c1�� color = %s, gearTypr = %s, door = %d\n", c2.color, c2.gearType, c2.door);

		Car1 c3 = new Car1(c2);
		System.out.printf("c1�� color = %s, gearTypr = %s, door = %d", c3.color, c3.gearType, c3.door);
	}
}

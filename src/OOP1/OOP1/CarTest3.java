package OOP1;

/*
 생성자에서 다른 생성자 호출하기
 	this() - 생성자 호출, this - 참조변수, 인스턴스 자신을 가르킨다.
 
 	- 생성자의 이름으로 클래스 이름 대신 this를 사용한다.
 	- 한 생성자에 다른 생성자를 호출할 때 첫 줄에서만 가능
 		> 초기화 작업 도중 다른 생성자를 호출 시 호출된 다른 생성자 내에서도 멤버변수들의 값이 초기화 될 수 있음
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

		System.out.printf("c1의 color = %s, gearTypr = %s, door = %d\n", c1.color, c1.gearType, c1.door);
		System.out.printf("c1의 color = %s, gearTypr = %s, door = %d\n", c2.color, c2.gearType, c2.door);

		Car1 c3 = new Car1(c2);
		System.out.printf("c1의 color = %s, gearTypr = %s, door = %d", c3.color, c3.gearType, c3.door);
	}
}

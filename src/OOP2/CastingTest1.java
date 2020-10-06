package OOP2;

/*
 참조변수의 형변환
 	- 서로 상속관계에 있는 타입간의 형변환만 가능
 	- 자식타입에서 부모타입으로 형변환 시 생략 가능
 */
public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;

		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();

		car = fe; // Car car = new FireEngine();

		fe2 = (FireEngine) car;

		fe2.water();

		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if (fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if (fe instanceof Object) {
			System.out.println("This is a Object instance");
		}
		
		System.out.println(fe.getClass());
		System.out.println(fe.getClass().getName());
	}
}

class Car {
	String color;
	int door;

	void driver() {
		System.out.println("drive, Brrrrr");
	}

	void stop() {
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("Water~~~~~~");
	}
}
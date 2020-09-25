package OOP1;

class MyMath2 {
	int a, b;
	
	//인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요 없다.
	int add() {
		return a + b;
	}
	int sub() {
		return a - b;
	}
	//인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static int add(int a, int b) {
		return a + b;
	}
}

public class MyMathTest {
	public static void main(String[] args) {
		/*
		 인스턴스 메서드
		 	- 인스턴스 생성 후 '참조변수.메서드 이름()'으로 호출
		 	- 인스턴스 변수나 인스턴스 메서드와 관련된 작업만하는 메서드
		 	- 메서드 내에서 인스턴스 변수 사용 가능
		 	
		 클래스 메서드(static 메서드) 공통으로 사용하는 공간
		 	- 객체 생성 없이 '클래스.메서드 이름()'으로 호출
		 	- 인스턴스변수나 인스턴스 메서드와 관련 없는 작업을 하는 메서드
		 	- 메서드 내에서 인스턴스 변수 사용 불가
		 	- 메서드 내에서 인스턴스 변수를 사용하지 않는다면 static 붙이는 것을 고려
		 	
		 */
		System.out.println(MyMath2.add(3, 5));
		//클래스 메서드 호출, 인스턴스 생성없이 호출 가능
		
		MyMath2 mm = new MyMath2();
		mm.a = 200;
		mm.b = 100;
		
		System.out.println(mm.add());
		//인스턴스 메서드는 객체 생성 후에만 호출 가능
	}
}

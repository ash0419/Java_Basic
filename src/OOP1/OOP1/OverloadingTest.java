package OOP1;

public class OverloadingTest {
	public static void main(String[] args) {
		/*
		 메서드 오버로딩
		 	- 하나의 클래스 같은 이름의 메서드를 여러개 정의하는 것
		 	
		 오버로딩의 조건
		 	- 메서드 이름이 같아야 한다.
		 	- 매개변수의 개수 또는 타입이 달라야 한다.
		 	- 매개변수는 같고 리턴타입이 다른 경우는 오버로딩 X
		 	
		 주의
		 	- 매개변수 이름이 다른 것이 오버로딩 X
		 	- 리턴타입 오버로딩 성립조건 X
		 	
		 	
		 */
		Mymath3 mm = new Mymath3();
		System.out.println("mm.add(3, 3) 결과 : " +mm.add(3,3));
		System.out.println("mm.add(3, 3L) 결과 : " +mm.add(3,3L));
		System.out.println("mm.add(3L, 3) 결과 : " +mm.add(3L,3));
		System.out.println("mm.add(3L, 3L) 결과 : " +mm.add(3L,3L));
		
		int[] a = {100,200,300};
		System.out.println("mm.add(int[] a) 결과 : " +mm.add(a));
	}
}

class Mymath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
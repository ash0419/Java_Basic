package OOP1;

public class CallStack {
	public static void main(String[] args) {
		//호출흐름 생각
		
		System.out.println("main 시작");//1
		first();
		System.out.println("main 끝");//6
	}
	
	static void first() {
		System.out.println("first 시작");//2
		seconde();
		System.out.println("first 끝");//5
	}
	static void seconde() {
		System.out.println("second 시작");//3
		System.out.println("second 끝");//4
	}
}

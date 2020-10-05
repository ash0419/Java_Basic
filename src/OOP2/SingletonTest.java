package OOP2;

/*
 생성자에 접근 제어자
 	-일반적으로 생성자의 접근제어자는 클래스의 접근 제어자와 일치
 	-생성자에 접근제어자를 사용함으로써 인스턴스 생성 제한 가능
 */

class SingleTone{
	
	private static SingleTone s = new SingleTone();
	
	private SingleTone() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingleTone getInstance() {
		return s;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
//		SingleTone s = new SingleTone();
		SingleTone s = SingleTone.getInstance();
	}
}














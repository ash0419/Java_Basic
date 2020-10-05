package OOP2;

/*
 추상클래스
 	-클래스가 설계도라면 추상클래스 미완성 설계도
 	-추상메서드를 포함하고 있는 클래스
 	-일반 메서드가 추상 메서드가 호출 가능(호출 시 필요한 건 선언부)
 	-완성된 형태가 아니므로 인스턴스 생성 불가
 	-다른 클래스 작성 시 도움 목적
 추상메서드
 	-선언부만 있고 구현부가 없는 메서드
 	-꼭 필요하지만 자식마다 다르게 구현될 경우 사용 (강제성 부여)
 	-추상클래스를 상속받은 자식 클래스에서 추상메서드 구현부 완성
 */

abstract class Test1{
	int currentPos;
	
	public Test1() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void play(int pos);//추상메서드
	abstract void stop();
	
	void test() {
		
	}
}

class Test2 extends Test1{

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}


public class AbstractTest {
	public static void main(String[] args) {
//		Test1 t = new Test1();
		
		Test2  t = new Test2();
	}
	

}

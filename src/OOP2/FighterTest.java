package OOP2;

/*
 인터페이스
 	- 일종의 추상 클래스(추상클래스보다 추상화 정도가 높다)
 	- 실제 구현된 것이 전혀 없는 기본 설계도
 	- 추상메서드와 상수만을 멤버로 가진다.
 	- 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용
 	- 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는데 사용
 	
 	interface 인터페이스 이름 {
 		public static final 타입 상수이름 = 값;
 		public abstract 메서드 이름(매개변수 목록);
 		
 		//class 대신 interface를 사용한다는 것 외에는 클래스와 동일
 		//모든 멤버변수는 public static final이어야 하며 생략 가능
 		//모든 메서드는 public abstract 이어야 하며 생략 가능
 	}
 	
 	장점
 		- 개발 시간 단축
 		- 표준화 개발(정형화된 개발)
 		- 서로 관계없는 클래스도 관계를 부여 가능(다중 상속과 비슷)
 		- 독집적인 프로그래밍 가능
 */
public class FighterTest {
	public static void main(String[] args) {

	}
}

class _Unit {
	int currentHp;
	int x;
	int y;
}

class Fighter extends _Unit implements Fightable {
	// 인터페이스 구현 = 클래스 상속
	// 인터페이스에 정의된 추상메서드 필히 완성
	// 상속과 구현 동시 가능
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack(_Unit u) {
		// TODO Auto-generated method stub

	}

	void attack(Fightable f1) {

	}
}

interface Movable {
	public abstract void move(int x, int y);
}

interface Attackable {
	void attack(_Unit u);
}

interface Fightable extends Movable, Attackable {
	// 클래스처럼 상속 가능(다중 상속 허용)
	// Object 클래스와 같은 최고 조상 X
}
package OOP2;
/*
 접근제어자
 	- 멤버 또는 클래스에 사용
 	- 외부로부터의 접근 제한
 	- 클래스, 멤버변수, 메서드, 생성자
 	
 	private	- 같은 클래스 내에서만 접근 가능
 	default	- 같은 패키지 내에서만 접근 가능
 	protected	- 같은 패키지 내에서만 접근 가능, 다른 패키지의 자식 클래스에서만 접근 가능
 	public	- 접근 제한 X
 	
 	접근 제어자 사용(캡슐화)
 		- 외부로부터의 데이터 보호
 		- 외부에는 불필요, 내부적으로 사용되는 부분을 감추기 위해
 		
 	제어자의 조합
	 	클래스 - public, (default), final, abstract
	 	메서드 - 모든 접근 제어자, final, abstract, static
	 	멤버변수 - 모든 접근 제어자, final, static
	 	지역변수 - final
 	
 	1. 메서드는 static과 abstract를 사용 X
 		- static 메서드는 구현부가 있는 메서드에만 사용 가능
 	2. 클래스에 abstract와 final을 동시에 사용 X
 		- 클래스에 사용되는 final은 클래스는 확장활 수 없다는 의미
 		abstract는 상속을 통해서만 완성되어야 한다는 의미로 서로 모순
 	3. abstract 메서드와 접근제어가 private일 수 없다.
 		- abstract 메서드는 자식 클래스에서 구현해주어야 하는데 접근 제어자가 private이면 자식 클래스가 접근 불가
 	4. 메서드 private와 final을 같이 사용 X
 		- 접근 제어자가 private인 메서드는 오버라이딩 X
 		둘 중 하나만으로도 충분
 */
public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time();
//		time.hour = 10;
		
		time.setHour(10);
		System.out.println(time.getHour());
	}
	
}

class Time {	//자바에서는 변수는 private 접근하려면 public 메소드를 통해서 접근하는 setter/getter 방법을 선호
	private int hour;
	private int minute;
	private int second;
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setHour(int hour) {	// 외부에서 접근 하는 방법
		this.hour = hour;
	}
	
	public int getHour() {
		return this.hour;
	}
}
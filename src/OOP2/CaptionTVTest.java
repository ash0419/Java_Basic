package OOP2;

/*
 상속
 	- 기존의 클래스를 재사용해서 새로운 클래스 작성
 	- 두 클래스를 부모와 자식으로 관계를 맺어주는 것
 	- 자식클래스는 부모클래스의 모든 멤버를 상속(생성자, 초기화 블럭 X)
 	- 자식의 멤버개수는 부모보다 적을 수 없다.
 	
 	class 자식클래스 extends 부모클래스{
 	}
 */
class p {
	int x;
	int y;
}

class p3d {
	int x;
	int y;
	int z;
}

class p_3d extends p {
	int z;
}

class TV2 {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends TV2 {
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTVTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello World");
		
		ctv.caption = true;
		ctv.displayCaption("Hello World");
	}
}

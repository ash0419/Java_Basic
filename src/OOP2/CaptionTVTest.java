package OOP2;

/*
 ���
 	- ������ Ŭ������ �����ؼ� ���ο� Ŭ���� �ۼ�
 	- �� Ŭ������ �θ�� �ڽ����� ���踦 �ξ��ִ� ��
 	- �ڽ�Ŭ������ �θ�Ŭ������ ��� ����� ���(������, �ʱ�ȭ �� X)
 	- �ڽ��� ��������� �θ𺸴� ���� �� ����.
 	
 	class �ڽ�Ŭ���� extends �θ�Ŭ����{
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

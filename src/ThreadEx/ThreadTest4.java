package ThreadEx;
// yield() : �ڽ��� �纸�ϴ� �޼���, �����尡 �۾��� �����ϴ� �߿� �޼��带 ������ �Ǹ� ���� �ð��� ���� ���ʿ��� �纸

class ThreadEx5 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("��");
			Thread.yield(); // �ڽſ��� �־��� �ð��� �纸
		}
	}
}

class ThreadEx6 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("��");
		}
	}
}

public class ThreadTest4 {
	public static void main(String[] args) {
		ThreadEx5 s1 = new ThreadEx5();
		Thread t1 = new Thread(s1);

		Thread t2 = new Thread(new ThreadEx6());

		t1.start();
		t2.start();
	}
}

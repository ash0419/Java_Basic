package ThreadEx;

class ThreadEx10 implements Runnable {
	Ticketing ticket = new Ticketing();

	@Override
	public void run() {
		ticket.ticketing();
	}

}

class Ticketing {
	int ticketNumber = 1;

	public synchronized void ticketing() {
		if (ticketNumber > 0) {
			System.out.println(Thread.currentThread().getName() + "�� Ƽ���� ����");
			ticketNumber -= 1;
		} else {
			System.out.println(Thread.currentThread().getName() + "�� Ƽ���� ����");
		}
		System.out.println(Thread.currentThread().getName() + "�� Ƽ���� �õ� �� Ƽ�� �� : " + ticketNumber);
	}
}

public class ThreadTest7 {
	public static void main(String[] args) {
		ThreadEx10 s1 = new ThreadEx10();

		Thread t1 = new Thread(s1, "A");
		Thread t2 = new Thread(s1, "B");
		Thread t3 = new Thread(s1, "C");

		t1.start();
		t2.start();
		t3.start();
	}
}

package ThreadEx;

/*
 getPriority() : �켱������ ��ȯ
 setPriority() : �켱������ ����
 
 �켱 ���� : 1 ~ 10 10�� ���� ���� �켱����

�ֿ��ʵ�(���)
MAX_PRIORITY : 10 
MIN_PRIORITY : 1
NORM_PRIORITY : 5

ex)
test.setPriority(Thread.MAX_PRIORITY); // �켱���� ���� ����
 */
class ThreadEx3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("<" + Thread.currentThread().getName() + ">");
		}
		for (int i = 0; i < 1000; i++) {
			// �ð� ����
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		Runnable t = new ThreadEx3();
		Thread t1 = new Thread(t, "Thread1");
//		Thread th = new Thread(new ThreadEx3());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("t1�� �켱 ������ : " +t1.getPriority());
		
		Thread t2 = new Thread(t, "Thread2");
		t2.setPriority(Thread.NORM_PRIORITY);
		System.out.println("t2�� �켱 ������ : " +t2.getPriority());
		
		Thread t3 = new Thread(t, "Thread3");
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t3�� �켱 ������ : " +t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}
}

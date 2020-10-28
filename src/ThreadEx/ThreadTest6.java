package ThreadEx;

class ThreadEx9 extends Thread {

	public ThreadEx9(String name) {
		super(name);
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(getName() + i + "��° ����");
			}
		} catch (Exception e) {
			System.out.println("Thread ���� ����");
			return;
		}

	}
}

public class ThreadTest6 {
	public static void main(String[] args) {
		/*
		 Thread ���� 
		 	- ������ ���� 
		 		> run() �޼��忡 ����ó���� return �� �־� ������ ���� 
		 	- Ÿ �����忡�� ��������
		 		> interrupt() �޼��� ȣ��(���ܹ߻�)
		 */

		ThreadEx9 th = new ThreadEx9("Thread");

		th.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupt();

	}
}

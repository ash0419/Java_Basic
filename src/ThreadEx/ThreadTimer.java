package ThreadEx;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Ÿ�̸� ȣ��");
	}

}

public class ThreadTimer {
	public static void main(String[] args) {
		MyTask task = new MyTask();

		Timer timer = new Timer();

		timer.schedule(task, 1000, 2000);
		// 1�� �Ŀ� �����ؼ� 2�� ����
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timer.cancel();
	}
}

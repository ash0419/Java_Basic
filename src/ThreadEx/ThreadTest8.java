package ThreadEx;

// wait() : ������ ���
// wait(long timeout) : ������ �ð���ŭ ��ٸ���.
// notify() : ������� �����带 ����
// notifyAll() : ������� ��� �����带 ����

class Account {
	int money = 0;

	// �Ա�, ���
	public int showMoney() {
		return money;
	}

	public synchronized void setMoney() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money += 2000;
		System.out.println("��Ӵϰ� �뵷�� �Ա��߽��ϴ�. ���� �ܾ� " + this.showMoney());

		this.notify();
	}

	public synchronized void getMoney() {
		while (money <= 0) {
			System.out.println("���� �ܰ� ��� �Ƶ� ��� ��...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.money -= 2000;
		System.out.println("�Ƶ��� �뵷�� ����߽��ϴ�. ���� �ܾ� " + this.showMoney());
	}
}

class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.getMoney();
		}
	}
}

class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.setMoney();
		}
	}
}

public class ThreadTest8 {
	public static void main(String[] args) {
		Account account = new Account();

		Son son = new Son(account);
		Mom mom = new Mom(account);

		son.start();
		mom.start();
		/*
		 ��Ƽ ������
		 	- �������� �����尡 ���ÿ� ����Ǹ鼭 ������ �� ���� ��
		 	- �����Ǵ� �κ��� ��ȣ ��Ÿ������ ���Ǿ�� �Ѵ�.
		 	
		 	DeadLock ����
		 		- ��Ƽ �����带 ��� �� ������ �� �� �ϳ��� ���α׷����� �����带 �߸� ����� ���α׷��� ������
		 		�̷������ �ʰ� ���� �����ϴ� Dead Lock�� ���� �� �ִ�.(��������)
		 		
		 	�Ӱ� ����(critical section)
		 		- ���� �ڿ��� ����ϴ� �ڵ� ������ �Ӱ迵��
		 		- �� �κп����� �����ڿ��� ���ÿ� ������ �� ������ ��ȣ ��Ÿ������ ����� �� �ֵ��� �ۼ�
		 		- �ڹٴ� �� ������ �ϳ��� �����常 ���� �� �� �ִ� synchronized method ����
		 	
		 	ó�����
		 		- ���� �ڿ��� �����ϴ� �޼��� �տ� synchronized �޼ҵ�� ����
		 		- ���� �ڿ��� ����ϴ� ������ synchronized(��ü��)�� ������ ����
		 */
	}
}

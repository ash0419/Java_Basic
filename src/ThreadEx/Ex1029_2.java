package ThreadEx;

import java.util.Random;

class User extends Thread {
	int sum;
	public User(String user) {
		super(user);
	}

	public void run() {
		sum = 0;
		for (int i = 0; i <= 100; i++) {
			Random r =new Random();
			int num = r.nextInt(20) + 1;
			System.out.println(getName() +" : " +num);
			sum += num;
		}
	}
}

public class Ex1029_2 {
	public static void main(String[] args) {
		User user1 = new User("User1");
		User user2 = new User("User2");
		user1.start();
		user2.start();
		
		try {
			user1.join();
			user2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User1의 값 : " +user1.sum);
		System.out.println("User2의 값 : " +user2.sum);
		
		if (user1.sum > user2.sum) {
			System.out.println("User 1의 합이 더 큽니다.");
		}else if (user1.sum < user2.sum) {
			System.out.println("User 2의 합이 더 큽니다.");
		}else {
			System.out.println("합이 똑같습니다.");
		}
	}
}

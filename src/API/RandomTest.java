package API;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		/*
		 Random Ŭ����
		 ���� ����
		 
		 	Random() : ���� �ð��� ���� ������ �ν��Ͻ� ����
		 	Random(long seed) : seed ���� ������ �ϴ� �ν��Ͻ� ����
		 */
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println("�⺻ ������ : " +random.nextInt(100));
			
			// nextInt() : ������ int �� ��ȯ
			// nextInt(int n) : 0���ٴ� ũ�� n���ٴ� ���� ������ int �� ��ȯ
		}
		
		Random random1 = new Random(2);
		Random random2 = new Random(2);
		//1, 2�� ���� �����ϰ� ����
		for (int i = 0; i < 5; i++) {
			System.out.println("random1 : " +random1.nextInt(100));
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("random2 : " +random2.nextInt(100));
		}
	}
}

package API;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		/*
		 Random 클래스
		 난수 생성
		 
		 	Random() : 현재 시간을 종자 값으로 인스턴스 생성
		 	Random(long seed) : seed 종자 값으로 하는 인스턴스 생성
		 */
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println("기본 생성자 : " +random.nextInt(100));
			
			// nextInt() : 무작위 int 값 반환
			// nextInt(int n) : 0보다는 크고 n보다는 작은 무작위 int 값 반환
		}
		
		Random random1 = new Random(2);
		Random random2 = new Random(2);
		//1, 2번 값이 동일하게 나옴
		for (int i = 0; i < 5; i++) {
			System.out.println("random1 : " +random1.nextInt(100));
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("random2 : " +random2.nextInt(100));
		}
	}
}

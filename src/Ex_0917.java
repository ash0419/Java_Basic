import java.util.Scanner;

public class Ex_0917 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 1. 0부터 시작해 99까지의 짝수들의 합을 구하는 프로그램 작성
		 */
		int sum1 = 0;
		for(int i = 0; i < 100; i+=2) {
			sum1 += i;
		}
		System.out.println("1부터 99까지의 짝수 합은 : " +sum1);
		
		/*
		 2. 0 이하의 수가 입력될 때까지 정수를 계속 입력 받고 5의 배수와 7의 배수를 제외한 수들의 
		 개수를 출력하는 프로그램 작성(0 이하의 수는 개수에서 제외)
		 */
		int input, rest = 0;
		System.out.println("값을 입력하세요 : ");
		
		while(true) {
			input = sc.nextInt();
			
			if(input <= 0) {
				break;
			}
			
			if(input % 5 != 0 && input % 7 != 0) {
				rest++;
			}
		}
		System.out.println("5, 7의 배수를 제외한 갯수는 : " +rest);
		
		/*
		 3. 2부터 9까지의 수 중 2개를 입력 받아 입력 받은 수 사이 구구단을 출력하는 프로그램 작성
		 */
		int num1, num2;
		System.out.println("두 수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i = 1; i < 10; i++) {
			for(int j = num1; j <= num2; j++) {
				System.out.printf("%3d * %3d =  %3d",j,i,j*i);
			}
			System.out.println();
		}
		
		
		/*
		 4. 하나의 숫자를 입력 받은 후 이를 시, 분, 초의 형태로 나타내는 프로그램을 작성
		 */
		int h = 0, s= 0, m = 0;
		int time;
		System.out.println("초를 입력하세요 : ");
		time = sc.nextInt();
		
		for(int i = 1; i <= time; i++) {
			if(i % 60 == 0) {
				m++;
			}
			if(m == 60) {
				h++;
				m = 0;
			}
			s = time - 3600 * h - 60 * m;
		}
		System.out.println("시 : " +h +" 분 : " +m +" 초 : " +s);
		sc.close();
	}
}

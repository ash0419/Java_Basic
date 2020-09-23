import java.util.Scanner;

public class Ex_0917 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 1. 0���� ������ 99������ ¦������ ���� ���ϴ� ���α׷� �ۼ�
		 */
		int sum1 = 0;
		for(int i = 0; i < 100; i+=2) {
			sum1 += i;
		}
		System.out.println("1���� 99������ ¦�� ���� : " +sum1);
		
		/*
		 2. 0 ������ ���� �Էµ� ������ ������ ��� �Է� �ް� 5�� ����� 7�� ����� ������ ������ 
		 ������ ����ϴ� ���α׷� �ۼ�(0 ������ ���� �������� ����)
		 */
		int input, rest = 0;
		System.out.println("���� �Է��ϼ��� : ");
		
		while(true) {
			input = sc.nextInt();
			
			if(input <= 0) {
				break;
			}
			
			if(input % 5 != 0 && input % 7 != 0) {
				rest++;
			}
		}
		System.out.println("5, 7�� ����� ������ ������ : " +rest);
		
		/*
		 3. 2���� 9������ �� �� 2���� �Է� �޾� �Է� ���� �� ���� �������� ����ϴ� ���α׷� �ۼ�
		 */
		int num1, num2;
		System.out.println("�� ���� �Է��ϼ��� : ");
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
		 4. �ϳ��� ���ڸ� �Է� ���� �� �̸� ��, ��, ���� ���·� ��Ÿ���� ���α׷��� �ۼ�
		 */
		int h = 0, s= 0, m = 0;
		int time;
		System.out.println("�ʸ� �Է��ϼ��� : ");
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
		System.out.println("�� : " +h +" �� : " +m +" �� : " +s);
		sc.close();
	}
}

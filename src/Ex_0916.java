import java.util.Scanner;

public class Ex_0916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		num =  sc.nextInt();
		System.out.println((num - (num % 10)) +"�̻� " +(num - (num % 10) + 10) +"�̸�");
		
		
		int month = 0;
		
		System.out.print("�� �Է� : ");
		month = sc.nextInt();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month +"���� �� ���� 31�� �Դϴ�");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month +"���� �� ���� 30�� �Դϴ�");
			break;
		case 2:
			System.out.println(month +"���� �� ���� 28�� �Դϴ�");
			break;
		}
		
		int a, b, c;
		
		System.out.print("���� 3�� �Է�>> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b && a > c) {
			if (b > c) {
				System.out.println("�߰� ���� " +b);
			}else {
				System.out.println("�߰� ���� " +c);
			}
		}else if(b > a && b > c) {
			if (a > c) {
				System.out.println("�߰� ���� " +a);
			}else {
				System.out.println("�߰� ���� " +c);
			}
		}else if(c > a && c > b) {
			if ( a > b) {
				System.out.println("�߰� ���� " +a);
			}else {
				System.out.println("�߰� ���� " +b);
			}
		}
		
		sc.close();

	}
}

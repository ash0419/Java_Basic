import java.util.Scanner;

public class Ex_0914 {
	public static void main(String[] args) {
		double rate = 1100.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money = sc.nextInt();
		System.out.println(money +"���� $" +(money / rate) +"�Դϴ�.");
		
		System.out.print("ȭ���� �Է��ϼ��� : ");
		float F = sc.nextFloat();
		
		System.out.println("���� ȭ���� :" +String.format("%.0f", F));
		System.out.println("\n\n");
		System.out.println("�Է��� ȭ���� ������ �ٲ� ��� : " +String.format("%.0f",(5.0/9.0*(F -32.0))));
		
		System.out.println("�� ���ڸ� �Է��ϼ��� :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("�� ���� �� ū ���� " +(a>b? a:b) +"�Դϴ�.");
		
		sc.close();
	}
}

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		/*
		 �ڹٿ��� Ű �Է�
		 
		 System.in
		 	- Ű����κ��� ���� �д� �ڹ��� ǥ�� �Է� ��Ʈ��
		 	- Ű ���� ����Ʈ(���� �ƴ�)�� ����
		 	
		 	����Ʈ ������ �����͸� ��ȯ �ʿ�
		 	
		 	Scanner Ŭ����
		 		- System.in ���� Ű�� �а� �ϰ�
		 		���� ������ ����, �Ǽ�, ���ڿ� ������ ��ȯ�Ͽ� ��ȯ
		 		
		 		import java.util.Scanner;
		 	
		 	next() - ���ڿ��� ��ȯ
		 	nextShort() - short Ÿ������ ��ȯ
		 	nextInt()  - int Ÿ������ ��ȯ
		 	nextFloat() - Float Ÿ������ ��ȯ
		 	nextLine() - ���ڿ��� ��ȯ(\n�� �����ϴ� �� ������ �а� \n ���� ���ڿ� ��ȯ)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		System.out.println("�̸��� " +name);
		
		String city = sc.next();
		System.out.println("���ô� " +city);
		
		int age = sc.nextInt();
		System.out.println("���̴� " +age);
		
		sc.close();
	}
}

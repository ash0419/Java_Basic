
public class Ex_0911 {
	public static void main(String[] args) {
		/*���� 6 ���� ������(int �� 4 ��, char �� 1 ��, String �� 1 ��) int �� ���� 3 ������ 20, 25,
		30 �� �����ϰ� ������ int ������ �� ������ ���ϴ� ���� �����Ѵ�. Char �� �������� ?��
		string �� �������� �ڱ�Ұ��� �����Ѵ�. ����� ������ �־� ����ϴ� ���α׷��� �ۼ�.*/
		int a = 20;
		int b = 25;
		int c = 30;
		int sum = a+b+c;
		System.out.println("a�� b�� c�� ���� : " +sum +"�Դϴ�.");
		
		char q = '?';
		String name = new String("My name is ����"); //= String name = "My name is ����"
		
		System.out.printf("Hello%c %s\n%c\n",q, name,q);
		
		/*�������� 10�� ���� ���̸� ���ϴ� ���α׷��� �ۼ�.
		���� : ���� 3���� ����, �� ������ ������, ������, ��갪�� ����.
		����ڵ忡 ��갪�� ������ �־� ����� ��.
		�� ���� ���ϴ� �� : ������ * ������ * 3.14*/
		int r = 10;	//float a = 10.0f;
		final double PI = 3.14;
		double width;
		width = (float)r * (float)r * PI;
		System.out.printf("������ %d�� �� ���̴� %.1f�Դϴ�.\n",r, width);
		
		/*���� ���� num1, num2���� ���� 10, 20�� ���ԵǾ� �ִ�. Num1�� num2�� ���� ����
		�ٲپ� num1���� 20, num2���� 10�� ���� ���α׷��� �ۼ�.
		��Ʈ : ���� �� ���� �� �����Ͽ� �ϳ��� ž�� ������ �̿��غ���.*/
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("���� num1���� : " +num1);
		System.out.println("���� num2���� : " +num2);
		
		int num3 = 0;
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("�ٲﰪ num1���� : " +num1);
		System.out.println("�ٲﰪ num2���� : " +num2);
		
		
	}
}

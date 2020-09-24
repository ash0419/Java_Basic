package OOP1;

public class ReturnTest {
	public static void main(String[] args) {
		/*
		 return�� ������ �ϳ��� ���� ����
		 ���������� Ȱ���ϸ� �������� �� ��ȯ ȿ�� ����
		 */
		int result = add(3,5);
		
		System.out.println(result);
		
		int [] result2 = {0, 0, 0};
		add(3, 4, result2);
		System.out.println(result2[0]);
		System.out.println(result2[1]);
		System.out.println(result2[2]);
		
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static void add (int a, int b, int[] result) {
		result[0] = a + b;
		result[1] = a + a;
		result[2] = b + b;
	}
}

package OOP1;

/*
 ������ �ʱ�ȭ
 	- ������ �����ϰ� ó������ ���� ����
 	- �������(�ν��Ͻ�, Ŭ���� ����)�� �迭�� �� Ÿ���� �⺻ ������ �ڵ� �ʱ�ȭ
 	- ���������� ����� ���� �ʱ�ȭ
 	
 	boolean : false
 	char : '\u0000'
 	byte : 0
 	short : 0
 	int : 0
 	long : 0L
 	float : 0.0f
 	double : 0.0d �Ǵ� 0.0
 	������ ���� : null
 	
 	��������� �ʱ�ȭ
 		1. ����� �ʱ�ȭ
 			Ex)int door = 4;
 		2. ������
 		
 		3. �ʱ�ȭ ��
 			- �ν��Ͻ� �ʱ�ȭ �� : {}
 				> �����ڿ� ���������� ����Ǵ� �۾��� ���
 				�ν��Ͻ� ������ ������ ����(�����ں��� ����)
 				
 			- Ŭ���� �ʱ�ȭ �� : static {}
 				> Ŭ���� ������ ������ �ʱ�ȭ ���
 				Ŭ���� �ε��ÿ� ����
 				
 */


public class BlockTest {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	public BlockTest() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
	}
}

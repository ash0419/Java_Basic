package OOP2;

/*
 �����ڿ� ���� ������
 	- �Ϲ������� �������� ���������ڴ� Ŭ������ ���� �����ڿ� ��ġ
 	- �����ڿ� ���������ڸ� ��������ν� �ν��Ͻ� ���� ���� ����
 	
 */

class SingleTone {
	private static SingleTone s = new SingleTone();

	private SingleTone() {
		// TODO Auto-generated constructor stub
	}

	public static SingleTone getInstance() {
		return s;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
//		SingleTone s = new SingleTone();
		SingleTone s = SingleTone.getInstance();	// ��� ������ �Ȱ��� �����ϴ� ��� �޸𸮸� ���� �� ����� �Ȱ��� �޸��� �ּҸ� ����.
		
	}
}

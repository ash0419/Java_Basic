package OOP1;

public class TestClassCall {
	
	int iv;	//�ν��Ͻ� ����
	static int cv;	//Ŭ���� ����
	
	
	void instanceMethod() {}	//�ν��Ͻ� �޼���
	static void staticMethod() {}	//Ŭ���� �޼���
	
	void instanceMethod2() {	//�ν��Ͻ� �޼���
		instanceMethod();	//�ν��Ͻ� �޼��� ȣ�� ����
		staticMethod();	//Ŭ���� �޼��� ȣ�� ����
		
		System.out.println(iv);
		System.out.println(cv);
	}
	static void staticMethod2() {	//Ŭ���� �޼���
		staticMethod();	//Ŭ���� �޼��� ȣ�� ����
//		instanceMethod();	//����, �ν��Ͻ� �޼��� ȣ�� �Ұ�
		
//		System.out.println(iv);	//����, �ν��Ͻ� ���� ���� �Ұ�
		System.out.println(cv);
	}
}

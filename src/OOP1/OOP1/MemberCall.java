package OOP1;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;	//����, Ŭ���� ������ �ν��Ͻ� ������ ����� �� ����
	static int cv2 = new MemberCall().iv;	//��ü�� �����ؼ� ���� ����
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod();
		MemberCall c = new MemberCall();
		c.instanceMethod();
		
//		int result = new MemberCall().instanceMethod();	//��ȸ��
	}
}

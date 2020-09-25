package OOP1;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;	//에러, 클래스 변수는 인스턴스 변수를 사용할 수 없음
	static int cv2 = new MemberCall().iv;	//객체를 생성해서 접근 가능
	
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
		
//		int result = new MemberCall().instanceMethod();	//일회용
	}
}

package OOP1;

public class CallStack {
	public static void main(String[] args) {
		//ȣ���帧 ����
		
		System.out.println("main ����");//1
		first();
		System.out.println("main ��");//6
	}
	
	static void first() {
		System.out.println("first ����");//2
		seconde();
		System.out.println("first ��");//5
	}
	static void seconde() {
		System.out.println("second ����");//3
		System.out.println("second ��");//4
	}
}

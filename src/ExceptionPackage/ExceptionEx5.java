package ExceptionPackage;

public class ExceptionEx5 {
	public static void main(String[] args) {
		try {
//			method1();
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		} finally {
			System.out.println("������ ����");
		}
	}

	static void method1() throws Exception {
		method2();
	}

	static void method2() throws Exception {
		method3();
	}

	static void method3() throws Exception {
		throw new Exception("���� �߻�");
	}
}

package ExceptionPackage;

public class NewExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println("�ܺ� try");

			try {
				System.out.println("���� try");
				throw new Exception("���� ���� ���� �߻�");
			} catch (Exception e) {
				System.out.println("���� try-catch Exception : " + e);
				System.out.println("���� ������ �߻�");
				throw e;
			} finally {
				System.out.println("���� finally ���� ���");
			}
		} catch (Exception e) {
			System.out.println("�ܺ� try-catch Exception : " + e);
		}
		System.out.println("����");
		
		int age = -19;
		try {
			ticketing(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	static void ticketing(int age) throws AgeException {
		if(age < 0) {
			throw new AgeException("���� �Է��� �߸� �Ǿ����ϴ�.");
		}
	}
}

class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}
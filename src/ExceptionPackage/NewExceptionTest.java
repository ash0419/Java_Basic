package ExceptionPackage;

public class NewExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println("외부 try");

			try {
				System.out.println("내부 try");
				throw new Exception("내부 강제 오류 발생");
			} catch (Exception e) {
				System.out.println("내부 try-catch Exception : " + e);
				System.out.println("예외 던지기 발생");
				throw e;
			} finally {
				System.out.println("내부 finally 구문 출력");
			}
		} catch (Exception e) {
			System.out.println("외부 try-catch Exception : " + e);
		}
		System.out.println("종료");
		
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
			throw new AgeException("나이 입력이 잘못 되었습니다.");
		}
	}
}

class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}
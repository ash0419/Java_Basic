package API;

public class Wrapper_String_Change1 {
	public static void main(String[] args) {
		int i = 10;
//		Integer wi = new Integer(i); // 박싱 int -> Integer
		Integer wi = i; // 오토박싱 int -> Integer

		String str1 = wi.toString(); // Integer -> String
		String str2 = Integer.toString(i); // int -> String
		String str3 = String.valueOf(i); // int -> String
		String str4 = i + ""; // int -> String

		System.out.println(str1 + str2 + str3 + str4);
		
		/*
		 String -> 기본자료형
		 	1) 래퍼 클래스 객체 생성(생성자의 매개변수에 문자열 전달) 후 언박싱/오토언박싱
		 		Integer wi = new Integer("10");
		 		int i = wi.intValue();
		 		int i = wi;
		 		
		 	2) 래퍼 클래스의 static 메소드로 변환
		 		int i = Integer.parseInt("10");
		 		
		 기본자료형 -> String
		 	1) 기본 자료형 박싱(래퍼 클래스 객체 생성) 후 래퍼 클래스의 toString() 메소드 이용 변환
		 		Integer wi = new Integer(10);
		 		String str = wi.toString();
		 	2) 래퍼 클래스의 정적 메소드인 toString(기본 자료형) 이용 변환
		 		String str = Integer.toString(10);
		 	3) String 클래스의 정적메소드인 valueOf(기본자료형) 이용 변환
		 		String str = String.valueOf(10);
		 	4) 기본 자료형 "" 더하기 연산
		 		String str = 10 + "";
		 */
	
		//compareTo() 메소드
		//두 개의 Integer 객체를 비교해서 크거나 적거나 같거나에 대한 결과 반환
		//1(크다), -1(작다), 0(같다)
		
		Integer wi1 = 10;
		Integer wi2 = 5;
		
		System.out.println(wi1.compareTo(wi2));
		
		String sss= Integer.toBinaryString(10);
		String ssss = Integer.toHexString(10);
		
		System.out.println("sss = " +sss +", ssss = " +ssss);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}

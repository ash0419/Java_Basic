package API;

public class Wrapper_String_Change {
	public static void main(String[] args) {
		// 파싱형을 쓸때 자료형이 다르면 에러 발생
		String str = "10";
		Integer wi = new Integer(str); // String -> Integer
		int i1 = wi.intValue(); // 언박싱 Integer -> int
		int i2 = wi; // 오토 언박싱 Integer -> int
		int i3 = Integer.parseInt(str); // 문자열에서 숫자만 뽑아오는 기능 String -> int

		System.out.println(i1 + i2 + i3);

		String str2 = "3.14";
		Double wd = new Double(str2); // String -> Double
		Double d1 = wd.doubleValue(); // 언박싱 Double -> double
		Double d2 = wd; // 오토 언박싱 Double -> double
		double d3 = Double.parseDouble(str2); // String -> Double
		
	}
}

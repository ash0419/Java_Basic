package API;

public class Wrapper_String_Change {
	public static void main(String[] args) {
		// �Ľ����� ���� �ڷ����� �ٸ��� ���� �߻�
		String str = "10";
		Integer wi = new Integer(str); // String -> Integer
		int i1 = wi.intValue(); // ��ڽ� Integer -> int
		int i2 = wi; // ���� ��ڽ� Integer -> int
		int i3 = Integer.parseInt(str); // ���ڿ����� ���ڸ� �̾ƿ��� ��� String -> int

		System.out.println(i1 + i2 + i3);

		String str2 = "3.14";
		Double wd = new Double(str2); // String -> Double
		Double d1 = wd.doubleValue(); // ��ڽ� Double -> double
		Double d2 = wd; // ���� ��ڽ� Double -> double
		double d3 = Double.parseDouble(str2); // String -> Double
		
	}
}

package API;

public class Wrapper_String_Change1 {
	public static void main(String[] args) {
		int i = 10;
//		Integer wi = new Integer(i); // �ڽ� int -> Integer
		Integer wi = i; // ����ڽ� int -> Integer

		String str1 = wi.toString(); // Integer -> String
		String str2 = Integer.toString(i); // int -> String
		String str3 = String.valueOf(i); // int -> String
		String str4 = i + ""; // int -> String

		System.out.println(str1 + str2 + str3 + str4);
		
		/*
		 String -> �⺻�ڷ���
		 	1) ���� Ŭ���� ��ü ����(�������� �Ű������� ���ڿ� ����) �� ��ڽ�/�����ڽ�
		 		Integer wi = new Integer("10");
		 		int i = wi.intValue();
		 		int i = wi;
		 		
		 	2) ���� Ŭ������ static �޼ҵ�� ��ȯ
		 		int i = Integer.parseInt("10");
		 		
		 �⺻�ڷ��� -> String
		 	1) �⺻ �ڷ��� �ڽ�(���� Ŭ���� ��ü ����) �� ���� Ŭ������ toString() �޼ҵ� �̿� ��ȯ
		 		Integer wi = new Integer(10);
		 		String str = wi.toString();
		 	2) ���� Ŭ������ ���� �޼ҵ��� toString(�⺻ �ڷ���) �̿� ��ȯ
		 		String str = Integer.toString(10);
		 	3) String Ŭ������ �����޼ҵ��� valueOf(�⺻�ڷ���) �̿� ��ȯ
		 		String str = String.valueOf(10);
		 	4) �⺻ �ڷ��� "" ���ϱ� ����
		 		String str = 10 + "";
		 */
	
		//compareTo() �޼ҵ�
		//�� ���� Integer ��ü�� ���ؼ� ũ�ų� ���ų� ���ų��� ���� ��� ��ȯ
		//1(ũ��), -1(�۴�), 0(����)
		
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

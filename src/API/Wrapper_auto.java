package API;

public class Wrapper_auto {
	public static void main(String[] args) {
		int i1 = 10; // �⺻ �ڷ���

//		Integer wi = i1;	//�ڽ�(����ڽ�)
		Integer wi = new Integer(i1); // �ڽ�
//		int i2 = wi; // ���� ��ڽ�
		int i2 = wi.intValue();	//��ڽ�(Integer -> int)

		double d1 = 3.14;
		Double wd = d1;
//		double d2 = wd;
		double d2 =  wd.doubleValue();
		
		int i = 10;
		Integer wii = new Integer(i); // Boxing(int -> Integer)
		String str = "10";
		Integer wi2 = new Integer(str); // String -> Integer

		/*
		 * ���� Ŭ������ ���Ե� ���� ==, != �� ���� �����ڸ� �̿��Ͽ� �� �Ұ� �� ������ �ν��Ͻ��� �����ϸ鼭 heap �޸𸮿� ����
		 * ����ǰ� ��ü ������ ���� ���� ������ ���� ���� equals() �޼ҵ带 �̿��ϰų� �����͸� ��ڽ��ؼ� ���� ��
		 */

	}
}

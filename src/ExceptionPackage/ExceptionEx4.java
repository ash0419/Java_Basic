package ExceptionPackage;

/*
 ���� ���� �߻�
 	- throw ���
 		1. ������ new�� �̿��ؼ� �߻���Ű���� ���� Ŭ������ ��ü ����
 		2. Ű���� throw�� ���� �߻�
 */

public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
//			Exception e = new Exception("���Ƿ� �߻�������");
//			
//			throw e;
//			
			throw new Exception("���� �߻�");
		} catch (Exception e) {
			System.out.println("���� �޽��� : " +e.getMessage());
		}
	}
}

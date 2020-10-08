package InnerClass;

/*
 ����Ŭ������ ����������
 	- ������ ��밡���� ���� �����ڿ� ����
 	- static Ŭ������ static ��� ���� ����
 	- ����Ŭ������ �ܺ�Ŭ������ ����� ����, ������ ���ټ�
 	- �ܺ�Ŭ������ ���������� final�� ���� ����� ���� ����(jdk 1.8)
 */

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	protected int outerPv = 0;

	class InstanceInner {
		int iiv = outerIv; // �ܺ� Ŭ������ private ����� ���� ����
		int iiv2 = outerCv;
		int iiv3 = outerPv;
	}

	static class StaticInner {
		// Static Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ����� ���� �Ұ�
//		int siv = outerIv;
		static int scv = outerCv;
//		protected int pcv = outerPv;
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;

		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			// �ܺ� Ŭ������ ���������� final ���� ����� ������ ���� �߾���.

			int liv3 = lv;
			int liv4 = LV;
		}
	}

	public static void main(String[] args) {

	}
}

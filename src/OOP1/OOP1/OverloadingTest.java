package OOP1;

public class OverloadingTest {
	public static void main(String[] args) {
		/*
		 �޼��� �����ε�
		 	- �ϳ��� Ŭ���� ���� �̸��� �޼��带 ������ �����ϴ� ��
		 	
		 �����ε��� ����
		 	- �޼��� �̸��� ���ƾ� �Ѵ�.
		 	- �Ű������� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
		 	- �Ű������� ���� ����Ÿ���� �ٸ� ���� �����ε� X
		 	
		 ����
		 	- �Ű����� �̸��� �ٸ� ���� �����ε� X
		 	- ����Ÿ�� �����ε� �������� X
		 	
		 	
		 */
		Mymath3 mm = new Mymath3();
		System.out.println("mm.add(3, 3) ��� : " +mm.add(3,3));
		System.out.println("mm.add(3, 3L) ��� : " +mm.add(3,3L));
		System.out.println("mm.add(3L, 3) ��� : " +mm.add(3L,3));
		System.out.println("mm.add(3L, 3L) ��� : " +mm.add(3L,3L));
		
		int[] a = {100,200,300};
		System.out.println("mm.add(int[] a) ��� : " +mm.add(a));
	}
}

class Mymath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
package OOP2;

/*
 �������̵�(Overriding)
 	-�θ�Ŭ�����κ��� ��� ���� �޼����� ������ ��� �޴� Ŭ������ �°� �����ϴ� ��
 	
 	�����ε�
 		-������ ���� ���ο� �޼��带 ����
 	�������̵�
 		-��� ���� �޼����� ������ ����
 		
 	����
 		-����ΰ� ���ƾ� �Ѵ�.(�̸�,�Ű�����,����Ÿ��)
 		-���������ڸ� ���� ������ ������ �� ����.
 		-�θ�Ŭ������ �޼��庸�� ���� ���� ���� ���� X
 		
 	class Parent{
 		void parentMethod(){}

 	}
 	
 	class Child extends Parents{
 		void parentMethod(){}//�������̵�
 		void parentMethod(int x){}//�����ε�
 		
 		void childMethod(){}
 		void childMethod(int i){}//�����ε�
 		void childMethod(){}//���� �ߺ�
 	}
 */
class Point_XY{
	int x;
	int y;
	String getLocation() {
		return "x : "+x+"y : "+y;
	}
}
class Point_XY_3D extends Point_XY{
	int z;
	String getLocation() {
		return "x : "+x+"y : "+y+"z : "+z;
	}
}


public class Override_Test {
	public static void main(String[] args) {
		Point_XY pp = new Point_XY();
		System.out.println(pp.getLocation());
		
		Point_XY_3D ppp = new Point_XY_3D();
		System.out.println(ppp.getLocation());
	}
	
}












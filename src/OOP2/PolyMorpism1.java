package OOP2;

/*
 ������
 	-�������� ���¸� ���� �� �ִ� �ɷ�
 	-�ϳ��� ���������� ���� Ÿ���� ��ü�� ������ �� �ִ� ��
 	-�θ�Ÿ���� ���������� �ڽ��� ��ü�� �ٷ� �� �ִ�.
 */

class A
{
	void methodA()
	{
		System.out.println("MethodA");
	}
}
class B extends A
{
	void methodB()
	{
		System.out.println("MethodB");
	}
}

public class PolyMorpism1 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
		
//		B b = new B();
//		b.methodB();
		
		a = new B();
		a.methodA();
		
	}
}










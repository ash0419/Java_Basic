package OOP2;

/*
 �߻�Ŭ����
 	-Ŭ������ ���赵��� �߻�Ŭ���� �̿ϼ� ���赵
 	-�߻�޼��带 �����ϰ� �ִ� Ŭ����
 	-�Ϲ� �޼��尡 �߻� �޼��尡 ȣ�� ����(ȣ�� �� �ʿ��� �� �����)
 	-�ϼ��� ���°� �ƴϹǷ� �ν��Ͻ� ���� �Ұ�
 	-�ٸ� Ŭ���� �ۼ� �� ���� ����
 �߻�޼���
 	-����θ� �ְ� �����ΰ� ���� �޼���
 	-�� �ʿ������� �ڽĸ��� �ٸ��� ������ ��� ��� (������ �ο�)
 	-�߻�Ŭ������ ��ӹ��� �ڽ� Ŭ�������� �߻�޼��� ������ �ϼ�
 */

abstract class Test1{
	int currentPos;
	
	public Test1() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void play(int pos);//�߻�޼���
	abstract void stop();
	
	void test() {
		
	}
}

class Test2 extends Test1{

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}


public class AbstractTest {
	public static void main(String[] args) {
//		Test1 t = new Test1();
		
		Test2  t = new Test2();
	}
	

}

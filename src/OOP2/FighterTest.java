package OOP2;

/*
 �������̽�
 	- ������ �߻� Ŭ����(�߻�Ŭ�������� �߻�ȭ ������ ����)
 	- ���� ������ ���� ���� ���� �⺻ ���赵
 	- �߻�޼���� ������� ����� ������.
 	- �ν��Ͻ��� ������ �� ����, Ŭ���� �ۼ��� ������ �� �������� ���
 	- �̸� ������ ��Ģ�� �°� �����ϵ��� ǥ���� �����ϴµ� ���
 	
 	interface �������̽� �̸� {
 		public static final Ÿ�� ����̸� = ��;
 		public abstract �޼��� �̸�(�Ű����� ���);
 		
 		//class ��� interface�� ����Ѵٴ� �� �ܿ��� Ŭ������ ����
 		//��� ��������� public static final�̾�� �ϸ� ���� ����
 		//��� �޼���� public abstract �̾�� �ϸ� ���� ����
 	}
 	
 	����
 		- ���� �ð� ����
 		- ǥ��ȭ ����(����ȭ�� ����)
 		- ���� ������� Ŭ������ ���踦 �ο� ����(���� ��Ӱ� ���)
 		- �������� ���α׷��� ����
 */
public class FighterTest {
	public static void main(String[] args) {

	}
}

class _Unit {
	int currentHp;
	int x;
	int y;
}

class Fighter extends _Unit implements Fightable {
	// �������̽� ���� = Ŭ���� ���
	// �������̽��� ���ǵ� �߻�޼��� ���� �ϼ�
	// ��Ӱ� ���� ���� ����
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack(_Unit u) {
		// TODO Auto-generated method stub

	}

	void attack(Fightable f1) {

	}
}

interface Movable {
	public abstract void move(int x, int y);
}

interface Attackable {
	void attack(_Unit u);
}

interface Fightable extends Movable, Attackable {
	// Ŭ����ó�� ��� ����(���� ��� ���)
	// Object Ŭ������ ���� �ְ� ���� X
}
package OOP1;

public class Varible {
	public static void main(String[] args) {
		/*
		 ������ġ�� ���� ���� ����
		 
		 	Ŭ���� ����
		 		���� ��ġ : Ŭ���� ����
		 		���� �ñ� : Ŭ������ �޸𸮿� �ö� ��
		 			- �ν��Ͻ� ���� �տ� static
		 			- ��� �ν��Ͻ��� ����� ��������� ����
		 			- �� Ŭ������ ��� �ν��Ͻ����� �������� ���� �����ؾ� �ϴ� �Ӽ��� ���
		 			
		 	�ν��Ͻ� ����
		 		���� ��ġ : Ŭ���� ����
		 		���� �ñ� : �ν��Ͻ� �����Ǿ��� ��
		 			- �ν��Ͻ� ���� �ʼ�, �������� ��������� �����Ƿ� ���� �ٸ� ���� ���� �� �ִ�.
		 			- �ν��Ͻ����� ������ ���¸� �����ؾ� �ϴ� �Ӽ��� ���
		 			
		 	��������
		 		���� ��ġ : Ŭ���� ���� �̿��� ����(�޼���, ������, �ʱ�ȭ �� ��)
		 		���� �ñ� : ���� ������ ����Ǿ��� ��
		 			- �޼��� ���� ����Ǿ� �޼��� �������� ��� ����
		 			- �޼��尡 ����Ǹ� �Ҹ�
		 */
		System.out.println("Card.width : " +Card.width);	// Ŭ���� ������ �޸𸮰� �ε��� �Ǹ� �������� ��� ����
		System.out.println("Card.height : " +Card.height);
		// Ŭ���� ������ ��ü ���� ���� Ŭ���� �̸��� ���� ��� ����
		
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1.kind : %s , c1.number : %d, ũ��(%d, %d)\n", c1.kind, c1.number, Card.width, c1.height);
		System.out.printf("c2.kind : %s , c2.number : %d, ũ��(%d, %d)\n", c2.kind, c2.number, Card.width, c2.height);
		
		c2.width = 120;
		c2.height = 300;
		
		System.out.printf("c1.kind : %s , c1.number : %d, ũ��(%d, %d)\n", c1.kind, c1.number, Card.width, c1.height);
		System.out.printf("c2.kind : %s , c2.number : %d, ũ��(%d, %d)\n", c2.kind, c2.number, Card.width, c2.height);
		
		// �ν��Ͻ� ������ �ν��Ͻ��� ������ ������ �����ǹǷ� ���� �ٸ� ���� ����
		// Ŭ���� ������ ��� �ν��Ͻ��� �ϳ��� ���� ������ �����ϹǷ� �׻� ����� ��
	}
}

class Card {
	//����, ����, ��, ����
	String kind;	//����
	int number;	//����
	
	static int width = 200;	//��
	static int height = 250;	//����
}
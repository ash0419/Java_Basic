package OOP2;

class Product {
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ ���� �� �����ϴ� ���ʽ� ����

	public Product(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		bonusPoint = (int) (price * 0.1); // ���ʽ� ������ ��ǰ ������ 10%
	}
}

class TV3 extends Product {
	public TV3() {
		super(100);
	}

	@Override
	public String toString() {
		return "TV";
	}

}

class Computer extends Product {
	public Computer() {
		super(200);

	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	public Audio() {
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer { // ��
	int money = 1000; // ���� �ݾ�
	int bonusPoint = 0; // ���ʽ� ����
	
	Product[] item = new Product[10];	// ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;	//Product �迭���� ���� ī����

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
//			return;	// ���α׷� ����
			System.exit(0);
		}

		money -= p.price; // ���� ������ ������ ��ǰ�� ������ ��
		bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰�
		
		
		item[i++] = p;	//item[0] = new TV(); 
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {	//������ ��ǰ�� ���� ���� ��� �޼���
		int sum = 0;	//��ǰ ������ ��
		String itemList = "";	//������ ��ǰ ���
		
		for(int i = 0; i <item.length; i++) {
			if(item[i] == null) break;
			
			sum += item[i].price;
			itemList += item[i] +", ";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum +"���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ���� " + itemList +"�Դϴ�.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		TV3 tv = new TV3();

		System.out.println(tv.price);
		System.out.println(tv.bonusPoint);

		System.out.println(tv);
		System.out.println(new Computer());

		Buyer b = new Buyer();

		b.buy(new TV3());
		b.buy(new Computer());

		System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�");
		System.out.println("���� ���ʽ� ������ " + b.money + "�� �Դϴ�.");
		
		Buyer a = new Buyer();
		a.buy(new TV3());
		a.buy(new Computer());
		a.buy(new Audio());
		
		a.summary();
	}
}

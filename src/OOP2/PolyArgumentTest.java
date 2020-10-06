package OOP2;

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

	public Product(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		bonusPoint = (int) (price * 0.1); // 보너스 점수는 제품 가격의 10%
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

class Buyer { // 고객
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스 점수
	
	Product[] item = new Product[10];	// 구입한 제품을 저장하기 위한 배열
	int i = 0;	//Product 배열에서 사용될 카운터

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;	// 프로그램 종료
			System.exit(0);
		}

		money -= p.price; // 가진 돈에서 고입한 제품의 가격을 뺌
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가
		
		
		item[i++] = p;	//item[0] = new TV(); 
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {	//구매한 물품에 대한 정보 요약 메서드
		int sum = 0;	//물품 가격의 합
		String itemList = "";	//구입한 물품 목록
		
		for(int i = 0; i <item.length; i++) {
			if(item[i] == null) break;
			
			sum += item[i].price;
			itemList += item[i] +", ";
		}
		
		System.out.println("구입하신 물품의 총 금액은 " + sum +"만원 입니다.");
		System.out.println("구입하신 제품은은 " + itemList +"입니다.");
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

		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 보너스 점수는 " + b.money + "점 입니다.");
		
		Buyer a = new Buyer();
		a.buy(new TV3());
		a.buy(new Computer());
		a.buy(new Audio());
		
		a.summary();
	}
}

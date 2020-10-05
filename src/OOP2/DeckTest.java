package OOP2;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick();
		System.out.println(c.toString());
		
		d.shuffle();
		
		c = d.pick(0);
		System.out.println(c);
	}
}
//Deck Ŭ����

//Card Ŭ����
class Card
{
	static final int KIND_MAX = 4;//ī�� ������ ��
	static final int NUM_MAX = 13;//���̺� ī���� ��
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	public Card(int kind,int number) {
		this.kind = kind;
		this.number = number;
	}
	public Card() {
		this(SPADE,1);
	}
	public String toString() {
		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";
		
		return "kind : "+kinds[this.kind]+", number : "+numbers.charAt(this.number);
		
	}
}















package OOP2;

class Animal
{
	void breath()
	{
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사자";
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper
{
//	void feed(Lion lion)//사자에게 먹이주는 클래스
//	{
//		System.out.println(lion+"에게 고기주기");
//	}
//	
//	void feed(Rabbit rabbit)//사자에게 먹이주는 클래스
//	{
//		System.out.println(rabbit+"에게 고기주기");
//	}
//	
//	void feed(Monkey monkey)//사자에게 먹이주는 클래스
//	{
//		System.out.println(monkey+"에게 고기주기");
//	}
	
	void feed(Animal animal)
	{
		System.out.println(animal+"에게 먹이주기");
	}
}


public class Polymorpism2 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		System.out.println(lion);
		
		ZooKeeper james = new ZooKeeper();
		james.feed(lion);
		james.feed(new Rabbit());
		james.feed(new Monkey());
		
		
	}
}













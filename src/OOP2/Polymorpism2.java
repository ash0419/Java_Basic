package OOP2;

class Animal
{
	void breath()
	{
		System.out.println("������");
	}
}

class Lion extends Animal
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����";
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "�䳢";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "������";
	}
}

class ZooKeeper
{
//	void feed(Lion lion)//���ڿ��� �����ִ� Ŭ����
//	{
//		System.out.println(lion+"���� ����ֱ�");
//	}
//	
//	void feed(Rabbit rabbit)//���ڿ��� �����ִ� Ŭ����
//	{
//		System.out.println(rabbit+"���� ����ֱ�");
//	}
//	
//	void feed(Monkey monkey)//���ڿ��� �����ִ� Ŭ����
//	{
//		System.out.println(monkey+"���� ����ֱ�");
//	}
	
	void feed(Animal animal)
	{
		System.out.println(animal+"���� �����ֱ�");
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













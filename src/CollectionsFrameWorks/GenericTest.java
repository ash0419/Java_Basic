package CollectionsFrameWorks;
/*
 ���׸�(Generic)
 	-�÷����� Ư�� Ÿ�Կ� �°� ����ȭ �س��� ����
 	
 	���׸� ����
 		1.Ŭ���� ������� Ŭ������ �ڿ� ���� ���� Ÿ���� ����ŭ ,�� ����
 		2.Generic Type�� ����(<>) ���̿� ������ �� ��� ���� ��ü�� ��������� ���� �� ���׸� Ÿ������ ����
 		
 		[�������� class Ŭ������<����1,����2,����3....>]
 		
 		API���� T,E,K,V ����
 		
 		T : ���޵Ǵ� ��ü�� �� ��ü ������ �ڷ���(Type)���� ���� ��
 		E : ���޵Ǵ� ��ü�� �� ��ü ������ ���(Element)�� �ڸ� ���� ��
 		K : ���޵Ǵ� ��ü�� �� ��ü ������ Ű(Key)�� ���� ��
 		V : ���޵Ǵ� ��ü�� �� ��ü ������ ��(value)���� ���� ��
 */

public class GenericTest {
	public static void main(String[] args) {
		Box box = new Box();
		box.set(new Integer(10));
		System.out.println("���� : "+box.get());
		
		
		BoxAll<Integer> ba = new BoxAll<Integer>();
		ba.set(new Integer(100));
		System.out.println("���� : "+ba.get());
		
		BoxAll<String> ba2 = new BoxAll<String>();
		ba2.set("���׸� Ŭ����");
		System.out.println("���ڿ� : "+ba2.get());
	}
}


class Box{
	private Integer i;
	public void set(Integer i) {
		this.i = i;
	}
	public Integer get() {
		return i;
	}
}

class BoxAll<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}




















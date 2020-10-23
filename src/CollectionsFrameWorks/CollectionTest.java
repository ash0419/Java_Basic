package CollectionsFrameWorks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/*
 �÷��� �����ӿ�ũ
 	�÷���
 		-���� ��ü�� ��� ���� ���� �ǹ�
 	�����ӿ�ũ
 		-ǥ��ȭ,����ȭ�� ü������ ���α׷��� ���
 	
 	-�ټ��� ��ü�� �ٷ�� ���� ǥ��ȭ�� ���α׷��� ���
 	-�÷����� ���� ���ϰ� �ٷ� �� �ִ� �پ��� Ŭ���� ����
 	
 	�ٽ��������̽�
 	List
 		-������ �ִ� �������� ����, �������� �ߺ� ���
 	Set
 		-������ ���� �ʴ� �������� ����,������ �ߺ� X
 	Map
 		-Ű(Key)�� ��(Value)�� ������ �������� ����
 		���� ���� X,Ű�� �ߺ� X,���� �ߺ� ���
 		
 	List
 	
 	void add(int index,Object o)
 		-index�� ��ġ�� o�� �� �߰�
 	Object get(int index)
 		-index ��ġ�� �ִ� ��Ҹ� ��ȯ
 	int indexOf(Object o)
 		-��� o�� �ִ� ��ġ ��ȯ
 	ListIterator listiterator()
 		-ListIterator ��ü�� ��ȯ
 	Object remove(int index)
 		-index��ġ�� ��� �����ϰ� ������ ��Ҹ� ��ȯ
 	object set(int index,Object o)
 		-������ index�� ��Ҹ� o�� ����
 	
 */
public class CollectionTest {
	public static void main(String[] args) {
		Vector v = new Vector();//default �뷮 10
		
		v.add("A");
		v.add("C");
		v.add("E");
		v.add("D");
		
		System.out.println(v);
		
		v.add(1,"B");
		System.out.println(v);
		
		System.out.println("�ε��� 2 ��ġ�� �� ����");
		v.remove(2);
		System.out.println(v);
		
		System.out.println("�ε��� 2 ��ġ�� �� ��ȯ : "+v.get(2));
				
		System.out.println("�뷮 : "+v.capacity());
		System.out.println("������ : "+v.size());
		
		
		ArrayList list = new ArrayList(10);
		list.add(5);
		
		list.add(new Integer(4));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		list.add(2,12);
		System.out.println(list);
		list.set(2, 0);
		System.out.println(list);
		
		ArrayList list1 = new ArrayList(list.subList(1, 4));
		//fromindex���� toindex���̿� ����� ��ü ��ȯ
		print(list,list1);
		
//		list.sort(null);//��������
//		list.sort(Comparator.naturalOrder());//��������
//		list.sort(Comparator.reverseOrder());//��������
		
		Collections.sort(list);
		Collections.sort(list1);
		
		print(list,list1);
		
		System.out.println("list.contaionsAll(list1) : "+list.containsAll(list1));
		//containsAll() : ù��° ����Ʈ�� �ι�° ����Ʈ�� ��� ��Ҹ� ���� �� True
		//contaions() : ������ ��ü�� ArrayList�� ���ԵǾ� �ִ���
		
		list1.add("B");
		list1.add("C");
		list1.add(3,"A");
		print(list,list1);
		
		list1.set(3, "AA");
		print(list,list1);
		
		System.out.println("list.retainAll(list1) : "+list.retainAll(list1));
		//list1�� �����Ҹ� �����ϰ�� ��� ����-
		
		print(list,list1);
		
		
		for(int i = list1.size() - 1; i >= 0; i--) {
			list1.remove(i);
		}
		
		print(list,list1);
	}
	
	static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
}















package CollectionsFrameWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
		while(it.hasPrevious())
			System.out.println(it.previous());
		
		System.out.println();
		
		
		/*
		 Iterator
		 	-�÷��ǿ� ����� ��ҵ��� �о���� ����� ǥ��ȭ
		 	-����� �� ��ҿ� �����ϴ� ����� ���� iterator �������̽� ����
		 	-Collection �������̽����� Iterator�� ��ȯ�ϴ� iterator()�� ����
		 	-iterator()�� Collection�� ���ǵ��� �޼����̹Ƿ� List�� Set�� ����
		 */
		
		Iterator<String> iit = list.iterator();
		while(iit.hasNext()) {
			String str = iit.next();
			System.out.println(str);
		}
		
		Iterator iiit = list.iterator();
	}
}

















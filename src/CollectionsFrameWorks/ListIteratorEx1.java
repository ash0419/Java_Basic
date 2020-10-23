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
		 	-컬레션에 저장된 요소들을 읽어오는 방법의 표준화
		 	-저장된 각 요소에 접근하는 기능을 가진 iterator 인터페이스 정의
		 	-Collection 인터페이스에는 Iterator를 반환하는 iterator()를 정의
		 	-iterator()는 Collection에 정의도니 메서드이므로 List와 Set에 포함
		 */
		
		Iterator<String> iit = list.iterator();
		while(iit.hasNext()) {
			String str = iit.next();
			System.out.println(str);
		}
		
		Iterator iiit = list.iterator();
	}
}

















package CollectionsFrameWorks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/*
 컬렉션 프레임워크
 	컬렉션
 		-여러 객체를 모아 놓은 것을 의미
 	프레임워크
 		-표준화,정형화된 체계적인 프로그래밍 방식
 	
 	-다수의 객체를 다루기 위한 표준화된 프로그래밍 방식
 	-컬렌션을 쉽고 편리하게 다룰 수 있는 다양한 클래스 제공
 	
 	핵심인터페이스
 	List
 		-순서가 있는 데이터의 집합, 데이터의 중복 허용
 	Set
 		-순서를 유지 않는 데이터의 집합,데이터 중복 X
 	Map
 		-키(Key)와 값(Value)의 쌍으로 데이터의 집합
 		순서 유지 X,키는 중복 X,값은 중복 허용
 		
 	List
 	
 	void add(int index,Object o)
 		-index의 위치에 o의 값 추가
 	Object get(int index)
 		-index 위치에 있는 요소를 반환
 	int indexOf(Object o)
 		-요소 o가 있는 위치 반환
 	ListIterator listiterator()
 		-ListIterator 객체를 반환
 	Object remove(int index)
 		-index위치에 요소 삭제하고 삭제한 요소를 반환
 	object set(int index,Object o)
 		-지정한 index의 요소를 o로 변경
 	
 */
public class CollectionTest {
	public static void main(String[] args) {
		Vector v = new Vector();//default 용량 10
		
		v.add("A");
		v.add("C");
		v.add("E");
		v.add("D");
		
		System.out.println(v);
		
		v.add(1,"B");
		System.out.println(v);
		
		System.out.println("인덱스 2 위치의 값 삭제");
		v.remove(2);
		System.out.println(v);
		
		System.out.println("인덱스 2 위치의 값 반환 : "+v.get(2));
				
		System.out.println("용량 : "+v.capacity());
		System.out.println("사이즈 : "+v.size());
		
		
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
		//fromindex부터 toindex사이에 저장된 객체 반환
		print(list,list1);
		
//		list.sort(null);//오름차순
//		list.sort(Comparator.naturalOrder());//오름차순
//		list.sort(Comparator.reverseOrder());//내림차순
		
		Collections.sort(list);
		Collections.sort(list1);
		
		print(list,list1);
		
		System.out.println("list.contaionsAll(list1) : "+list.containsAll(list1));
		//containsAll() : 첫번째 리스트가 두번째 리스트의 모든 요소를 포함 시 True
		//contaions() : 지정된 객체가 ArrayList에 포함되어 있는지
		
		list1.add("B");
		list1.add("C");
		list1.add(3,"A");
		print(list,list1);
		
		list1.set(3, "AA");
		print(list,list1);
		
		System.out.println("list.retainAll(list1) : "+list.retainAll(list1));
		//list1과 공통요소를 제외하고는 모두 삭제-
		
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















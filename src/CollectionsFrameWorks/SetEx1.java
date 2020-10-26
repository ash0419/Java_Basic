package CollectionsFrameWorks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");

		System.out.println(hs);

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(" " + it.next());
		}
		TreeSet ts = new TreeSet(); // 기본 옵션이 오름차순 정렬

		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");

		Iterator it2 = ts.iterator();

		while (it2.hasNext()) {
			System.out.println(" " + it2.next());
		}

		Set set = new HashSet();

		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(40));

		System.out.println(set);

		// HashSet -> TreeSet
		// TreeSet은 오름차순으로 출력

		Set treeSet = new TreeSet(set);

		System.out.println(treeSet);

		/*
		 이진검색 트리 
		 	- 모든 노드는 최대 2개의 자식노드를 가질 수 없다. 
		 	- 왼쪽 자식 노드의 값은 부모노드의 값보다 작고 오른쪽 자식 노드의 값은 부모노드의 값보다 커야한다. 
		 	- 노드의 추가 삭제에 시간이 걸린다. 
		 	- 검색과 정렬에 유리(범위 검색) 
		 	- 중복된 값 저장
		 */

		TreeSet set1 = new TreeSet();

		set1.add("abc");
		set1.add("alien");
		set1.add("bat");
		set1.add("car");
		set1.add("disc");
		set1.add("dance");

		System.out.println(set1);

		System.out.println("result : " + set1.subSet("b", "d"));

		TreeSet set2 = new TreeSet();

		int[] scores = { 80, 90, 50, 35, 45, 65, 10, 100 };

		for (int i = 0; i < scores.length; i++) {
			set2.add(new Integer(scores[i]));
		}
		System.out.println("50보다 작은 값 : " + set2.headSet(new Integer(50))); // 50포함 X
		System.out.println("50보다 큰 값 : " + set2.tailSet(new Integer(50))); // 50포함 O

		/*
		 * 로또 번호 생성기 Random 클래스, 중복값 제거 , 번호 정렬
		 */
		Random random = new Random();
		TreeSet lotto = new TreeSet();
		while (lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1);
		}

		System.out.println("로또 번호 : " +lotto);
	}
}

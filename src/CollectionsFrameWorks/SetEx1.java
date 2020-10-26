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
		TreeSet ts = new TreeSet(); // �⺻ �ɼ��� �������� ����

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
		// TreeSet�� ������������ ���

		Set treeSet = new TreeSet(set);

		System.out.println(treeSet);

		/*
		 �����˻� Ʈ�� 
		 	- ��� ���� �ִ� 2���� �ڽĳ�带 ���� �� ����. 
		 	- ���� �ڽ� ����� ���� �θ����� ������ �۰� ������ �ڽ� ����� ���� �θ����� ������ Ŀ���Ѵ�. 
		 	- ����� �߰� ������ �ð��� �ɸ���. 
		 	- �˻��� ���Ŀ� ����(���� �˻�) 
		 	- �ߺ��� �� ����
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
		System.out.println("50���� ���� �� : " + set2.headSet(new Integer(50))); // 50���� X
		System.out.println("50���� ū �� : " + set2.tailSet(new Integer(50))); // 50���� O

		/*
		 * �ζ� ��ȣ ������ Random Ŭ����, �ߺ��� ���� , ��ȣ ����
		 */
		Random random = new Random();
		TreeSet lotto = new TreeSet();
		while (lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1);
		}

		System.out.println("�ζ� ��ȣ : " +lotto);
	}
}

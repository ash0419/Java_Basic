package CollectionsFrameWorks;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);

//		hm.put("apple", "���");
//		hm.put("paper", "����");
//		hm.put("flower", "��");
//		
//		System.out.println("�˰� ���� �ܾ� �Է� : ");
//		String voca = sc.nextLine();
//		
//		if(hm.containsKey(voca)) {
//			System.out.println("�ش��ϴ� ���� " +hm.get(voca));
//		} else {
//			System.out.println("�ش� �ܾ ���� ���� �����ϴ�.");
//		}
//		
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("dfbb", "1234");

		while (true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			if (map.containsKey(id)) {
				if (password.equals(map.get(id))) {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
			} else {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}

		sc.close();
	}
}

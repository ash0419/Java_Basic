package CollectionsFrameWorks;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);

//		hm.put("apple", "사과");
//		hm.put("paper", "종이");
//		hm.put("flower", "꽃");
//		
//		System.out.println("알고 싶은 단어 입력 : ");
//		String voca = sc.nextLine();
//		
//		if(hm.containsKey(voca)) {
//			System.out.println("해당하는 뜻은 " +hm.get(voca));
//		} else {
//			System.out.println("해당 단어에 대한 뜻은 없습니다.");
//		}
//		
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("dfbb", "1234");

		while (true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			if (map.containsKey(id)) {
				if (password.equals(map.get(id))) {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
					continue;
				}
			} else {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
		}

		sc.close();
	}
}

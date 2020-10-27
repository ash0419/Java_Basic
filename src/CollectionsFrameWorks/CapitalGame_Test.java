package CollectionsFrameWorks;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class CapitalGame_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> list = new HashMap<String, String>();

		list.put("멕시코", "멕시코시티");
		list.put("스페인", "마드리드");
		list.put("프랑스", "파리");
		list.put("영국", "런던");
		list.put("그리스", "아테네");
		list.put("독일", "베를린");
		list.put("일본", "동경");
		list.put("중국", "베이징");
		list.put("러시아", "모스크바");

		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while (true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
			int num = scan.nextInt();
			if (num == 1) {
				System.out.println("현재 9개 나라와 수도가 입력되어 있습니다.");
				while (true) {
					System.out.print("나라의 수도 입력 " + (list.size() +1) + ">> ");
					String key = scan.next();
					if (key.equals("그만")) {
						break;
					}
					String value = scan.next();
					if (list.containsKey(key)) {
						System.out.println(key + "는 이미 있습니다");
					} else {
						list.put(key, value);
					}
				}

			} else if (num == 2) {
				Random r = new Random();
				while(true) {
					int random_num = r.nextInt(list.size());
					
				}
			}

		}
	}
}

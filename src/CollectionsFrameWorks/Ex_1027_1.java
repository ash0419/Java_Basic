package CollectionsFrameWorks;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class CapitalGame {
	HashMap<String, String> store = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);

	public CapitalGame() {
		store.put("멕시코", "멕시코시티");
		store.put("스페인", "마드리드");
		store.put("프랑스", "파리");
		store.put("영국", "런던");
		store.put("그리스", "아테네");
		store.put("독일", "베를린");
		store.put("일본", "동경");
		store.put("중국", "베이징");
		store.put("러시아", "모스크바");
	}

	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while (true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>>");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				input();
				break;
			case 2:
				quiz();
				break;
			case 3:
				finish();
				return;
			}
		}

	}

	public void finish() {
		System.out.println("게임을 종료합니다.");
	}

	public void input() {
		int n = store.size();
		System.out.println("현재" + n + "개의 나라와 수도가 입력되어 있습니다.");
		n++;
		while (true) {
			System.out.print("나라와 수도 입력 " + n + ">> ");
			String country = sc.next();

			if (country.equals("그만")) {
				break;
			}
			String capital = sc.next();

			if (store.containsKey(country)) {
				System.out.println(country + "는 이미 있습니다.");
				continue;
			}
			store.put(country, capital);
			n++;
		}
	}

	public void quiz() {
		Set<String> keys = store.keySet();
		Object[] array = keys.toArray();

		while (true) {
			int index = (int) (Math.random() * array.length);

			String question = (String) array[index];
			String answer = store.get(question);

			System.out.print(question + "의 수도는? ");
			String capitalFromUser = sc.next();

			if (capitalFromUser.equals("그만")) {
				break;
			}
			if (capitalFromUser.equals(answer)) {
				System.out.println("정답");
			} else {
				System.out.println("아닙니다");
			}
		}
	}
}

public class Ex_1027_1 {
	public static void main(String[] args) {
		CapitalGame game = new CapitalGame();
		game.run();
	}
}

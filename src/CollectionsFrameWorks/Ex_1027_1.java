package CollectionsFrameWorks;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class CapitalGame {
	HashMap<String, String> store = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);

	public CapitalGame() {
		store.put("�߽���", "�߽��ڽ�Ƽ");
		store.put("������", "���帮��");
		store.put("������", "�ĸ�");
		store.put("����", "����");
		store.put("�׸���", "���׳�");
		store.put("����", "������");
		store.put("�Ϻ�", "����");
		store.put("�߱�", "����¡");
		store.put("���þ�", "��ũ��");
	}

	public void run() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3>>");
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
		System.out.println("������ �����մϴ�.");
	}

	public void input() {
		int n = store.size();
		System.out.println("����" + n + "���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		n++;
		while (true) {
			System.out.print("����� ���� �Է� " + n + ">> ");
			String country = sc.next();

			if (country.equals("�׸�")) {
				break;
			}
			String capital = sc.next();

			if (store.containsKey(country)) {
				System.out.println(country + "�� �̹� �ֽ��ϴ�.");
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

			System.out.print(question + "�� ������? ");
			String capitalFromUser = sc.next();

			if (capitalFromUser.equals("�׸�")) {
				break;
			}
			if (capitalFromUser.equals(answer)) {
				System.out.println("����");
			} else {
				System.out.println("�ƴմϴ�");
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

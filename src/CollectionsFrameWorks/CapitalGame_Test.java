package CollectionsFrameWorks;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class CapitalGame_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> list = new HashMap<String, String>();

		list.put("�߽���", "�߽��ڽ�Ƽ");
		list.put("������", "���帮��");
		list.put("������", "�ĸ�");
		list.put("����", "����");
		list.put("�׸���", "���׳�");
		list.put("����", "������");
		list.put("�Ϻ�", "����");
		list.put("�߱�", "����¡");
		list.put("���þ�", "��ũ��");

		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3 >>");
			int num = scan.nextInt();
			if (num == 1) {
				System.out.println("���� 9�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while (true) {
					System.out.print("������ ���� �Է� " + (list.size() +1) + ">> ");
					String key = scan.next();
					if (key.equals("�׸�")) {
						break;
					}
					String value = scan.next();
					if (list.containsKey(key)) {
						System.out.println(key + "�� �̹� �ֽ��ϴ�");
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

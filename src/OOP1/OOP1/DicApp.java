package OOP1;

import java.util.Scanner;

class Dictonary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				return eng[i];

		}
		return null;
	}

}

public class DicApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");

		while (true) {
			System.out.print("�ѱ� �ܾ�? ");
			sc.nextLine();
			String kor = sc.next();

			if (kor.equals("�׸�"))
				break;

			String eng = Dictonary.kor2Eng(kor);

			if (eng == null)
				System.out.println(kor + "�� ���� ������ �����ϴ�.");

			else
				System.out.println(kor + "�� " + eng);

		}
		sc.close();
	}
}

package API;

import java.util.Scanner;

public class Ex_1016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�. ");
		String text = sc.nextLine();

		for (int i = 0; i < text.length(); i++) {
			String first = text.substring(0, 1);// �ε��� 0~1���� 1���� ����
			String last = text.substring(1);

			text = last + first;
			System.out.println(text);
		}

		// Ex2
		System.out.print(">>");
		StringBuffer str_buffer = new StringBuffer(sc.nextLine());
		while (true) {
			System.out.print("��� : ");
			String cmd = new String(sc.nextLine());
			if (cmd.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			String[] tokens = cmd.split("!");

			if (tokens.length != 2) {
				System.out.println("�߸��� ����Դϴ�.");
			} else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�.");
					continue;
				}
			}
			int index = str_buffer.indexOf(tokens[0]);
			if(index == -1) {
				System.out.println("ã�� �� �����ϴ�.");
				continue;
			} else {
				str_buffer.replace(index, index + tokens[0].length(), tokens[1]);
				System.out.println(str_buffer.toString());
			}
		}
		sc.close();
	}
}
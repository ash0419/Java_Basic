package API;

import java.util.Scanner;

public class Ex_1016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다. ");
		String text = sc.nextLine();

		for (int i = 0; i < text.length(); i++) {
			String first = text.substring(0, 1);// 인덱스 0~1까지 1개의 문자
			String last = text.substring(1);

			text = last + first;
			System.out.println(text);
		}

		// Ex2
		System.out.print(">>");
		StringBuffer str_buffer = new StringBuffer(sc.nextLine());
		while (true) {
			System.out.print("명령 : ");
			String cmd = new String(sc.nextLine());
			if (cmd.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			String[] tokens = cmd.split("!");

			if (tokens.length != 2) {
				System.out.println("잘못된 명령입니다.");
			} else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다.");
					continue;
				}
			}
			int index = str_buffer.indexOf(tokens[0]);
			if(index == -1) {
				System.out.println("찾을 수 없습니다.");
				continue;
			} else {
				str_buffer.replace(index, index + tokens[0].length(), tokens[1]);
				System.out.println(str_buffer.toString());
			}
		}
		sc.close();
	}
}
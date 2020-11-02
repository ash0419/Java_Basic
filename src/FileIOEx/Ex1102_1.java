package FileIOEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1102_1 {
	public static void main(String[] args) {
		FileWriter fw = null;
		File f = new File("C:\\PT\\phone.txt");

		try {
			fw = new FileWriter(f);

			Scanner sc = new Scanner(System.in);

			System.out.println("전화번호 입력 프로그램입니다.");

			while (true) {
				System.out.print("이름 전화번호 >> ");
				String line = sc.nextLine();

				if (line.equals("그만"))
					break;

				fw.write(line + "\r\n");
			}

			System.out.println(f.getPath() + "에 저장하였습니다.");
			sc.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileReader fr = null;

		try {
			fr = new FileReader(f);
			System.out.println(f.getPath() + "을 출력합니다.");

			while (true) {
				int c = fr.read();
				if (c == -1)
					break;
				System.out.print((char) c);

			}
			fr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

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

			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");

			while (true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = sc.nextLine();

				if (line.equals("�׸�"))
					break;

				fw.write(line + "\r\n");
			}

			System.out.println(f.getPath() + "�� �����Ͽ����ϴ�.");
			sc.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileReader fr = null;

		try {
			fr = new FileReader(f);
			System.out.println(f.getPath() + "�� ����մϴ�.");

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

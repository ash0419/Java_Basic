package FileIOEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class PhoneExplorer {
	String fileName = "C:\\pt\\phone.txt";
	HashMap<String, String> phoneMap = new HashMap<String, String>();

	void run() {
		readPhoneFile();
		processQuery();
	}

	void readPhoneFile() {
		try {
			Scanner fScanner = new Scanner(new FileReader(new File(fileName)));

			while (fScanner.hasNext()) {
				String name = fScanner.next();
				String tel = fScanner.next();

				phoneMap.put(name, tel);
			}
			fScanner.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		File f = new File(fileName);
//		FileReader fin = new FileReader(f);
//		Scanner fScanner = new Scanner(fin);

		System.out.println("�� " + phoneMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
	}

	void processQuery() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�̸� >>");
			String name = sc.next();

			if (name.equals("�׸�"))
				break;

			String tel = phoneMap.get(name);

			if (tel == null)
				System.out.println("ã�� �̸��� �����ϴ�.");

			else
				System.out.println(tel);
		}
	}
}

public class Ex1102_3 {
	public static void main(String[] args) {
		PhoneExplorer phoneExplorer = new PhoneExplorer();
		phoneExplorer.run();
	}
}
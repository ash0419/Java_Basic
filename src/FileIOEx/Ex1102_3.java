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

		System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");
	}

	void processQuery() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("이름 >>");
			String name = sc.next();

			if (name.equals("그만"))
				break;

			String tel = phoneMap.get(name);

			if (tel == null)
				System.out.println("찾는 이름이 없습니다.");

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
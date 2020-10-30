package FileIOEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx6 {
	public static void main(String[] args) {
		// C:\\window\\system.ini -> c:\\PT\\system.txt
		File src = new File("C:\\windows\\system.ini");
		File dst = new File("C:\\PT\\system.txt");

		int c;

		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dst);

			while ((c = fr.read()) != -1) { // ���� �ϳ� �а�
				fw.write((char) c); // ���� �ϳ� ����
			}

			fr.close();
			fw.close();
			System.out.println(src.getPath() + "�� " + dst.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package FileIOEx;

import java.io.FileReader;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) {
		FileReader fin = null;

		try {
			fin = new FileReader("C:\\Program Files\\Git\\LICENSE.txt");

			int c;

			while ((c = fin.read()) != -1) { // �ѹ��ھ� ���� ������ �б�
				System.out.print((char)c);
			}
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

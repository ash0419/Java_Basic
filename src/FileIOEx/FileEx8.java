package FileIOEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEx8 {
	public static void main(String[] args) {
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter("c:\\pt\\test.txt"));
			
			pw.printf("�� ���̴� %d ���Դϴ�. \n", 18);
			pw.printf("���� %s �Դϴ�.\n", "�̸�");
			
			pw.println("���� ����\n");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

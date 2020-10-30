package FileIOEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileEx2 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;

		try {
			fin = new FileInputStream("C:\\class_1\\ASH\\Java_Lec\\src\\FileIOEx\\test.txt");
			in = new InputStreamReader(fin, "UTF-8");
			// InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\class_1\\ASH\\Java_Lec\\src\\FileIOEx\\test.txt"));
			int c;

			System.out.println("인코딩 문자 집합은 " + in.getEncoding());

			while ((c = in.read()) != -1) {
				System.out.println((char) c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

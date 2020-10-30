package FileIOEx;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileEx4 {
	public static void main(String[] args) {
		FileReader fin = null;
		BufferedOutputStream out;
		int c;

		try {
			fin = new FileReader("C:\\class_1\\ASH\\Java_Lec\\src\\FileIOEx\\test1.txt");
			out = new BufferedOutputStream(System.out, 5);

			while ((c = fin.read()) != -1) {
				out.write(c);
			}

			new Scanner(System.in).nextLine();
			fin.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

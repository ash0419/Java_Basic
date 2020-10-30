package FileIOEx;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FileWriter fout = null;
		int c;

		try {
			fout = new FileWriter("C:\\class_1\\ASH\\Java_Lec\\src\\FileIOEx\\test.txt");

			while (true) {
				String line = sc.nextLine();
				if (line.length() == 0) {
					break;
				}
				fout.write(line);
				fout.write("\r\n");
			}

			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

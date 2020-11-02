package FileIOEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEx8 {
	public static void main(String[] args) {
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter("c:\\pt\\test.txt"));
			
			pw.printf("제 나이는 %d 살입니다. \n", 18);
			pw.printf("저는 %s 입니다.\n", "이름");
			
			pw.println("파일 쓰기\n");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package API;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.println(name+"님 환영합니다.");
		*/
		
		try {
			FileInputStream fs = new FileInputStream("C:\\PT\\test.txt");
			Scanner s = new Scanner(fs);
			
			while(s.hasNext())
			{
				System.out.println(s.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










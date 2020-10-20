package API;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex_1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		SimpleDateFormat sdf = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
		
		Date inDate = null;

		

		while (true) {
			System.out.println("날짜를 " + pattern + " 의 형태로 입력해주세요. (입력예:2007/05/11)");
			System.out.print(">>");
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (ParseException e) {
				continue;
			}
		}
		System.out.println(sdf.format(inDate));
	}
}

package API;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);

		Scanner sc = new Scanner(System.in);

		Date inDate = null;

		System.out.println("��¥��" + pattern + " �� ���·� �Է�(��:2020/10/20) : ");

		while (sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (ParseException e) {
				System.out.println("��¥�� " + pattern + " �� ���·� �ٽ� �Է����ּ���.");
			}
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		
		Calendar today = Calendar.getInstance();
		
		long day = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
		System.out.println("�Է��Ͻ� ��¥�� �����" +day +" �ð� ���̰� �ֽ��ϴ�.");
	}
}

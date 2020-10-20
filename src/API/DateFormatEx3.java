package API;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx3 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��"); //->2015/11/23
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		Date t = new Date();
		System.out.println(t);
		
		try {
			Date d = df.parse("2015�� 11�� 23��");
			System.out.println(df2.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


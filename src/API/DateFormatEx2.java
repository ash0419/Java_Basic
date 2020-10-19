package API;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 Date -> Calendar
 	Date d = new Date();
 	Calendar cal = Calender.getInstance();
 	
 	cal.setTime(d);
 */

public class DateFormatEx2 {
	public static void main(String[] args) {
		//Calendar -> Date
		/*
		 Calendar cal = Calendar.getInstance();
		 Date d = new Date(cal.getTimeMilleis());
		 */
		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9,3);
		
		Date today = cal.getTime();
		
		System.out.println(today);
		
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4;
		
		//date 인스턴스만 format 메서드 사용 가능
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS a");
		
		System.out.println(today);
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
	}
}

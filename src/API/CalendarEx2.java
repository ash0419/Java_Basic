package API;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {

		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		date1.set(2015, 6, 17);
		System.out.println("date1은 " + toString(date1) + " " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
		System.out.println("date2은 " + toString(date2) + " " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");

		// 두 날짜간의 차이를 얻으려면 getTimeInMillis() 천 분의 일초 단위로 변경

		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println(difference / (24 * 60 * 60) + "일 차이");
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}
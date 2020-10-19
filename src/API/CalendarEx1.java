package API;

import java.util.Calendar;

/*
 Calendar / Date
 
 	Date
 		- 날짜와 시간을 다룰 목적으로 만들어진 클래스 (jdk 1.0)
 		
 	Calendar
 		- Date클래스를 개선한 클래스 (jdk 1.1)
 		- 추상클래스(싱글톤 getInstance를 통해 구현된 객체 획득)
 		
 	Time 클래스
 		-Date와 Calendar 단점을 개선한 클래스 (jdk 1.8)
 */

public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();

//		System.out.println(today));
		System.out.println("이번 해의 년도 : " + today.get(Calendar.YEAR));
		// get() - Calendar에 정의된 static 함수
		System.out.println("월(0 ~ 11) + 1 : " + (today.get(Calendar.MONTH) + 1));
		System.out.println("이번 년도의 몇 째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
		System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1 ~ 7) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("시간(0 ~ 11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0 ~ 23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0 ~ 59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0 ~ 59) : " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초 : " + today.get(Calendar.MILLISECOND));

		System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE));
	}
}

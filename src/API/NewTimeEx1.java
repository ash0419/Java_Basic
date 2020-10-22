package API;
/*
 java.time 패키지
 	-Date,Calendar의 단점 보완을 위해 추가된 패키지
 	
 	LocalDate
 		-날짜
 	LocalTime
 		-시간
 	LocalDate + LocalTime = LocalDateTime
 		-날짜 & 시간
 	LocalDateTime + 시간대 = ZoneDateTime
 	
 	Period
 		-날짜의 차이
 	Duration
 		-시간의 차이
 		
 	get(),getXXX()
 	특정 필드 값 가져오기
 		Ex)getYear(),getHour()
 		주의) Calendar 1월 -> 0, 일요일 -> 1
 			getXXX()메서드 월 1~12, 월요일 -> 1
 			
 	with() : 직접 값 변경
 	plus(),minus() : 더하기,빼기
 	
 	isAfter()
 	isBefore()
 	isEqual()
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class NewTimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();//오늘의 날짜
		LocalTime now = LocalTime.now();//현재시간
//		now() : 현재 시간 날짜
		
		//of() : 특정 날짜 시간
		
//		LocalDate birthDate = LocalDate.of(1999, 12, 31);
//		LocalTime birthTime = LocalTime.of(23, 59, 59);
		
//		LocalDate birthDate = LocalDate.ofYearDay(1999, 359);
//		LocalTime birthTime = LocalTime.ofSecondOfDay(86399);
		
		LocalDate birthDate = LocalDate.parse("1999-12-31");
		LocalTime birthTime = LocalTime.parse("23:59:59");
		
		System.out.println("today = "+today);
		System.out.println("now = "+now);
		System.out.println("birthDate = "+birthDate);
		System.out.println("birthTime = "+birthTime);
		
		//minus,plus
		
		LocalDate Id = LocalDate.now();
		System.out.println(Id);
		
		LocalDate Id2 = Id.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(Id2);
		
		LocalDate Id3 = Id2.plusWeeks(3);
		System.out.println(Id3);
		
		//with()
		LocalDate new_id = Id.withYear(1999).withMonth(8).withDayOfYear(23);
		System.out.println(new_id);
		
		int count = 0;
		 
		for(int i = 1900; i < 2100; i++) {
			new_id = Id.withYear(i);
			if(new_id.isLeapYear()) {
				System.out.println(new_id.getYear()+"은 윤년입니다.");
				count++;
			}
		}
		System.out.println("1900~2100년까지 윤년은 총 "+count+"번 있습니다.");
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		LocalDateTime new_ldt;
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올 해의 첫번째 날 "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올 해의 마지막 날 "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번달의 첫번째 날 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번달의 마지막 날 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달의 첫 월요일 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("이번달의 마지막 일요일 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("돌아오는 금요일: "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("오늘을 포함한 다음 금요일 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
		System.out.println("지난 월요일 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.WEDNESDAY));
		System.out.println("오늘을 포함한 지난 월요일 : "+new_ldt);
		
		
		LocalDateTime ldt1 = LocalDateTime.of(2010, 1,1,12,23,23,444);
		System.out.println(ldt1);
		LocalDateTime ldt2 = LocalDateTime.of(2010, 12,25,1,12,2,444);
		System.out.println(ldt2);
		
		System.out.println(ldt1.isAfter(ldt2));//ldt1이 ldt2.보다 이후?
		System.out.println(ldt1.isBefore(ldt2));
		System.out.println(ldt1.isEqual(ldt2));
		
		
		LocalDateTime idt = LocalDateTime.now();
		
		System.out.println(idt);
		
		LocalDateTime end_time = LocalDateTime.of(2017, 6,24,12,00);
		System.out.println(end_time);
		
		if(idt.isAfter(end_time)) {
			System.out.println("유통기한 지났음");
		}
		else
			System.out.println("유통기한 안지남");
	}
}

































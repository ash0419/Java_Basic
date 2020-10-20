package API;

import java.util.Calendar;

/*
 Calendar / Date
 
 	Date
 		- ��¥�� �ð��� �ٷ� �������� ������� Ŭ���� (jdk 1.0)
 		
 	Calendar
 		- DateŬ������ ������ Ŭ���� (jdk 1.1)
 		- �߻�Ŭ����(�̱��� getInstance�� ���� ������ ��ü ȹ��)
 		
 	Time Ŭ����
 		-Date�� Calendar ������ ������ Ŭ���� (jdk 1.8)
 */

public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();

//		System.out.println(today));
		System.out.println("�̹� ���� �⵵ : " + today.get(Calendar.YEAR));
		// get() - Calendar�� ���ǵ� static �Լ�
		System.out.println("��(0 ~ 11) + 1 : " + (today.get(Calendar.MONTH) + 1));
		System.out.println("�̹� �⵵�� �� °�� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�� ���� �� �� : " + today.get(Calendar.DATE));
		System.out.println("�� ���� �� �� : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1 ~ 7) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�ð�(0 ~ 11) : " + today.get(Calendar.HOUR));
		System.out.println("�ð�(0 ~ 23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0 ~ 59) : " + today.get(Calendar.MINUTE));
		System.out.println("��(0 ~ 59) : " + today.get(Calendar.SECOND));
		System.out.println("1000���� 1�� : " + today.get(Calendar.MILLISECOND));

		System.out.println("�� ���� ������ ��: " + today.getActualMaximum(Calendar.DATE));
	}
}

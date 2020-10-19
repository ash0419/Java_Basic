package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

		System.out.println(today);
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		sdf2 = new SimpleDateFormat("''yy�� MM�� dd�� E����");
		System.out.println(sdf2.format(today));
		sdf3 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf3.format(today));
		sdf4 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss.SSS a");
		System.out.println(sdf4.format(today));
		sdf5 = new SimpleDateFormat("������ �� ���� D��° ���Դϴ�.");
		System.out.println(sdf5.format(today));
		sdf6 = new SimpleDateFormat("������ �� ���� d��° ���Դϴ�.");
		System.out.println(sdf6.format(today));
		sdf7 = new SimpleDateFormat("������ �� ���� w��° ���Դϴ�.");
		System.out.println(sdf7.format(today));
		sdf8 = new SimpleDateFormat("������ �� ���� W��° ���Դϴ�.");
		System.out.println(sdf8.format(today));
		sdf9 = new SimpleDateFormat("������ �̴��� F��° E�����Դϴ�.");
		System.out.println(sdf9.format(today));
	}
}

package API;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx2 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			//Integer.parseInt()�޼���� ,�� ���Ե� ���ڿ��� ��ȯ �Ұ�
			//parse�� Decimal Format�� ���� NumberFormat�� ���ǵ� �޼���
			//Number Ŭ������ Integer,Double ���� ���ڸ� �����ϴ� ����Ŭ���� ����
			
			System.out.print("1,234,567.89 ->");
			
			double d = num.doubleValue();
			System.out.print(d +" -> ");
			System.out.println(df2.format(num));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String data = "123,456,789.5";
		
		DecimalFormat df3 = new DecimalFormat("####,####");
		
		Long roundData = Math.round(Double.parseDouble(data.replace(",", "")));
		
		
		System.out.println("data = "+data);
		System.out.println("roundData = "+roundData);
		System.out.println("������ : "+df3.format(roundData));
		
		
		try {
			Number number = df.parse(data);
			double d = number.doubleValue();
			
			System.out.println("d = "+d);
			System.out.println("�ݿø� = "+Math.round(d));
			System.out.println("������ : "+df3.format(d));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package API;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx2 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			//Integer.parseInt()메서드는 ,가 포함된 문자열은 변환 불가
			//parse는 Decimal Format의 조상 NumberFormat에 정의된 메서드
			//Number 클래스는 Integer,Double 같은 숫자를 저장하는 래퍼클래스 조상
			
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
		System.out.println("만단위 : "+df3.format(roundData));
		
		
		try {
			Number number = df.parse(data);
			double d = number.doubleValue();
			
			System.out.println("d = "+d);
			System.out.println("반올림 = "+Math.round(d));
			System.out.println("만단위 : "+df3.format(d));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

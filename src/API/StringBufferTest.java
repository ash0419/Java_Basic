package API;

public class StringBufferTest {
	public static void main(String[] args) {
		
		String str1 = new String("This is");
		String str2 = "This is";
		
		StringBuffer sb = new StringBuffer("This is");
		
		sb.append(" test");
		System.out.println(sb);
		
		sb.insert(8, "String Buffer");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.setCharAt(0, '!');
		sb.reverse();
		System.out.println(sb);
		
		sb.setLength(20);
		System.out.println(sb);
		
		String sql = "insert into member ";
		sql += "values";
		sql += "(";
		sql += "trigger, ";
		sql += "1234";
		
		System.out.println(sql);
		
		StringBuffer sb1 = new StringBuffer("insert into member");
		
		sb1.append("valuews");
		sb1.append("(");
		sb1.append("trigger, ");
		sb1.append("1234");
		
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("Hello Korea");
		
		sb2.replace(6, 11, "Java");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		sb2.delete(3, 6);
		System.out.println(sb2);
		System.out.println(sb2.getClass().getName());
		
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = new StringBuffer("abc");
		
		System.out.println("sb4 == sb5 : " +(sb4 == sb5));
		System.out.println("sb4.equals(s5) : " +sb4.equals(sb5));	// 문자열의 비교가 불가
		
		//StringBuffer 클래스의 내용을 String 변환
		
		String s = sb4.toString();
		String s2 = sb5.toString();
		System.out.println("s.equals(s2) : " +s.equals(s2));
		
		//비교 후 다시 StringBuffer로 변환
		StringBuffer sb7 = new StringBuffer(s);
		sb7.append("Success");
		System.out.println(sb7);
	}
}

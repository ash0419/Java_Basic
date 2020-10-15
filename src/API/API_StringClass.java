package API;

import java.util.Arrays;
import java.util.Scanner;

public class API_StringClass {
	public static void main(String[] args) {
		char ch;
		int n1, n2, n3, n4, n5;
		String s1, s2, s3, s4, s5;

		System.out.println("---------------charAt");
		s1 = "abcdef";
		ch = s1.charAt(2);
		System.out.println("ch = " + ch);

		System.out.println("---------------length");
		s1 = "abcdef";
		System.out.println("length = " + s1.length());

		System.out.println("---------------concat");
		s1 = "AAAA";
		s2 = s1.concat("BBBB");
		s3 = s1 + "CCCC";
		System.out.println("s2 = " + s2 + ", s3 = " + s3);

		System.out.println("---------------SubString");
		s1 = "0123456789";
		s2 = s1.substring(3);
		s3 = s1.substring(3, 7); // 3번 인덱스부터 6번 인덱스 까지, 마지막 인덱스는 포함되지 않는다.
		System.out.println("s2 = " + s2 + ", s3 = " + s3);

		System.out.println("---------------indexOf");
		s1 = "01ab456ab9";
		n1 = s1.indexOf('a');
//		n2 = s1.indexOf('a',5);
		n2 = s1.lastIndexOf('a');
		n3 = s1.indexOf("ab");
		n4 = s1.indexOf("ab", 5);
		n5 = s1.indexOf("xx");

		System.out.println("n1 = " + n1);// 문자 'a'의 위치 반환
		System.out.println("n2 = " + n2);// 5번째 문자 이후 검색
		System.out.println("n3 = " + n3);// 문자열 "ab"의 위치 반환
		System.out.println("n4 = " + n4);// 5번째 문자 이후 검색
		System.out.println("n5 = " + n5);// 발견되지 않으면 -1

		System.out.println("---------------equals");
		System.out.println("equal는 문자열의 실체 비교, == 뮨자열의 주소값 비교");

		s1 = "dd";
		s2 = "dddd";
		s3 = s1 + s1;
		sscmp(s2, s3);

		System.out.println("---------------hashcode");
		s1 = "AAAAA";
		s2 = "AAAAB";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println("---------------replace");
		s1 = "ABABAB";
		s2 = s1.replace('B', 'C');
		System.out.println("s1 = " + s1 + " s2 = " + s2);

		System.out.println("---------------toLowerCase, toUpperCase");
		s1 = "aBcDeF";
		s2 = s1.toLowerCase();
		s3 = s1.toUpperCase();
		System.out.println("s1 = " + s1 + " s2 = " + s2 + " s3 = " + s3);

		System.out.println(s1.equalsIgnoreCase(s2)); // 대소문자 구분없이 비교

		System.out.println("---------------toString, trim");
		s1 = "abcde";
		s2 = s1.toString();
		System.out.println("s2 = " + s2);

		s1 = "     A B C     ";
		s2 = s1.trim();
		System.out.println("s1 = " + s1 + " s2 = " + s2);
		
		System.out.println("---------------split");
		
		String str1 = "일과 놀이 사이에는 경계가 없다";
		String[] words = str1.split(" ");
		
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println(Arrays.toString(words));
		
		String str2 = "JAVA/PYTHON/C++";
		String[] Lec = str2.split("/");
		
		for(String word : Lec) {	// 주로 배열을 확인할 때 사용하는 for문
			System.out.println(word);
		}
		System.out.println(Arrays.toString(Lec));
		
		String url = "http://www.naer.com";
		System.out.println(url.startsWith("http"));
		System.out.println(url.endsWith(".net"));
	}

	private static void sscmp(String a, String b) {
		System.out.println("a = " + a + " b = " + b);

		if (a == b) {
			System.out.println("양자의 참조는 같다.");
		} else {
			System.out.println("양자의 참조는 같지 않다.");
		}
		if (a.equals(b)) {
			System.out.println("양자의 문자열의 실체는 같다.");
		} else {
			System.out.println("양자의 문자열의 실체는 같지 않다.");
		}
	}

}

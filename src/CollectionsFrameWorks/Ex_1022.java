package CollectionsFrameWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Ex_1022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Vector v = new Vector();
//		System.out.print("정수(-1이 입력될 때 까지)>>");
//		while(true) {
//			Integer i = new Integer(sc.nextInt());
//			if (i.compareTo(-1) == 0) {
//				break;
//			}
//			v.add(i);
//			
//		}
//		v.sort(Comparator.reverseOrder());
//		System.out.println("가장 큰 수는 " +v.get(0));
		
		
		ArrayList list = new ArrayList();
		int sum = 0;
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		String s = sc.nextLine();
		String[] words = s.split(" ");
		for(int i = 0; i < words.length; i++) {
			list.add(words[i]);
		}
		for(int j = 0; j < list.size(); j++) {
			switch(list[j])
			case "A":
				sum += 4.0;
			case "B":
				sum += 3.0;
			case "C":
				sum += 2.0;
			case "D":
				sum += 1.0;
		}
	}
}

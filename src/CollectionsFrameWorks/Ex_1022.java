package CollectionsFrameWorks;

import java.util.Scanner;
import java.util.Vector;

public class Ex_1022 {
	public static void main(String[] args) {
		int num;
		
		Vector<Integer> v = new Vector<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����(-1�� �Էµ� ������) >>");
		
		while(true) {
			num = sc.nextInt();
			
			if(num == -1)
				break;
			
			v.add(num);
		}
		
		if(v.size() == 0) {
			System.out.println("���� �ϳ��� ����");
			return;
		}
		
		
		printBig(v);
	}
	
	static void printBig(Vector v) {
		int big = (int) v.get(0);
		
		for(int i = 1; i < v.size(); i++) {
			if(big < (int)v.get(i)) {
				big = (int)v.get(i);
			}
		}
		System.out.println("���� ū ���� "+big);
	}
}











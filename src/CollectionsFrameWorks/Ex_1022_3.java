package CollectionsFrameWorks;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Ex_1022_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		while(true) {
			System.out.println("������ �Է� (0 �Է� �� ����) >>");
			int n = sc.nextInt();
			
			if(n == 0)break;
			
			v.add(n);
			
			print(v);
		}
	}
	
	static void print(Vector<Integer> v){
		int sum = 0;
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n + " ");
			sum +=n;
		}
		System.out.println();
		System.out.println("���� ��� "+sum/v.size());
	}
}
















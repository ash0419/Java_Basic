import java.util.Scanner;

public class Ex_0921 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 5*7��Ŀ� 1���� 35���� ���ʴ�� ���ڸ� ����ִ� ���α׷� �ۼ�
		int[][] arr1 = new int[5][7];
		int num1 = 1;
		for(int i = 0; i < arr1.length; i ++) {
			for(int j = 0; j< arr1[i].length; j++) {
				arr1[i][j] = num1++;
				System.out.print(arr1[i][j] +"\t");
			}
			System.out.println();
		}
		/*
		//2. 10���� ������ 1���� �迭�� �Է� �ް� �ִ밪, �ּҰ�, ��, ����� ���ϴ� ���α׷� �ۼ�
		int[] num2 = new int[10];
		int tmp2 = 0;
		int max2 = 0, min2 = 0, sum2 = 0;
		System.out.println("���� �Է��ϼ��� : ");
		for(int i = 0; i < num2.length; i++) {
			tmp2 = sc.nextInt();
			num2[i] = tmp2;
			sum2 += num2[i];
			if(max2 < num2[i]) {
				max2 = num2[i];
			}
			if(min2 > num2[i]) {
				min2 = num2[i];
			}
		}
		
		System.out.println("�ִ밪 : " +max2);
		System.out.println("�ּҰ� : " +min2);
		System.out.println("�� : " +sum2);
		System.out.println("��� : " +(double)sum2/3.0);
		*/
		//3. ���̰� 10�� �迭�� �����ϰ� ���ڸ� �� �迭�ȿ� �Է� ���� ��, �Է¹��� ���ڰ� Ȧ���� �迭�� �պ���, ¦���� �ں��� �����ϴ� ���α׷� �ۼ�
		int[] num3 = new int[10];
		int tmp3 = 0;
		int front = 0;
		int rear = 9;
		
		System.out.println("�� 10���� ���� �Է�: ");
		for(int i = 0; i < num3.length; i++) {
			System.out.print("? : ");
			tmp3 = sc.nextInt();
			if(tmp3 % 2 != 0) {
				num3[front++] = tmp3;
			}else {
				num3[rear--] = tmp3;
			}
		}
		System.out.print("�迭 ����� ��� : ");
		for (int i =0; i < num3.length; i ++) {
			System.out.print(num3[i] + "\t");
		}
		
		sc.close();
	}
}

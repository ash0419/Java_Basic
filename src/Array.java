import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		/*
		 �迭
		 	- ���� �ڷ����� ����
		 	- ���� ���� ���� �ٷ� �� ����
		 	- �迭�� �� ��Ҵ� ���� �������̴�.
		 	
		 �迭�� ����
		 	- �ڷ����̳� ���� �̸� �ڿ� ���ȣ[]�� �ٿ� ����
		 	
		 	�ڷ���[] �����̸�;	// int[] score;
		 	�ڷ��� �����̸�[];	// int score[];
		 	
		 �迭�� ����
			int[] score;	//�迭 ����
			score = new int[5];	// �迭�� ����
			
			int[] score =  new int[5];
			
		�迭�� �ʱ�ȭ
			- ������ �迭�� ó������ ���� ����
			- ó���� �����ǰ� ���� ���� �Ұ�
			
			int[] score = {100, 90, 80, 70, 50};
			int[] score = new int[]{100, 90, 80, 70, 60};
			
		�迭�� ���̿� �ε���
			�ε���
				- �迭�� �������� �ٿ��� ��ȣ
				- �ε����� ��ȣ�� 0������ �ο�
				- �迭�� ���̴� ������ ũ�� -1
		 */
		
		int[] student = new int[3];
		
		System.out.println("���� 0���� �� : " +student[0]);
		
		student[0] = 30;
		student[1] = 20;
		student[2] = 10;
		
		System.out.println(student);	//���� ���� ��
		System.out.println("���� 0���� �� : " +student[0]);
		
		int[] stu = {30, 20, 10};
		
		for(int i = 0; i < stu.length; i++) {
			System.out.println("���� "+i +"���� �� : " +stu[i]);
		}
		
		/*
		 [��°��]
		 ��� 5���� �Է��ϼ���.
		 1
		 39
		 78
		 100
		 99
		 ���� ū���� 100�Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		int[] num = new int[5];
//		int max = 0;
//		System.out.println("��� 5���� �Է��ϼ���.");
//		
//		for(int i = 0; i< num.length; i++) {
//			num[i] = sc.nextInt();
//			 if(max < num[i]) {
//				max = num[i];
//			 }
//		}
//		System.out.println("���� ū ���� " + max);
		
		//Array API
//		int test[] = new int[10];
//		for(int i = 0; i < 10; i++) {
//			test[i] = i +1;
//		}
//		System.out.println(Arrays.toString(test));
//		int test1[] = test;
//		
//		System.out.println(Arrays.toString(test1));
//		
//		
//		for(int i = 0; i < 10; i++) {
//			test1[i] = test[i];
//		}
//		test[5] = 20;
//		
//		System.out.println(Arrays.toString(test));
//		System.out.println(Arrays.toString(test1));
		//copyOF : ���޹��� �迭�� Ư�� ���� ��ŭ�� ���ο� �迭�� ���� ��ȯ
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int[] arr2 = Arrays.copyOf(arr1, 3);
		System.out.println("arr2 : " +Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr1, 10);	//�� ū �迭�� ���ϰ� �ű�� ���
		System.out.println("arr3 : " +Arrays.toString(arr3));
		
		//copyOfRange : ���� ���� �迭�� Ư�� ������ �ش��ϴ� ��Ҹ��� ���ο� �迭�� ���� ��ȯ
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println("arr4 : " +Arrays.toString(arr4));
		
		//fill : ���޹��� �迭�� ��� ��Ҹ� Ư�� ������ �ʱ�ȭ
		int[] arr5 = new int[10];
		
		Arrays.fill(arr5, 7);
		System.out.println("arr5 : " +Arrays.toString(arr5));
		
		//sort : ���޹��� �迭�� ��� ��Ҹ� �������� ����
		int arr6[] = {5, 3, 2, 1, 4};
		
		Arrays.sort(arr6);
		System.out.println("arr6 : " +Arrays.toString(arr6));
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length + num.length];
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(Arrays.toString(result));
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(Arrays.toString(result));
		/*
		 1. ���� 1���� �迭�� �հ� ����� ���ϼ���
		 ����1) �迭 �ʱⰪ
		 int arr[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		 */
		int arr_1[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		int sum = 0;
		for(int i = 0; i < arr_1.length; i++) {
			sum += arr_1[i];
		}
		System.out.println("�� : " +sum);
		System.out.println("��� : " +(float)sum/arr_1.length);
		
		/*
		 2. 1 ~ 100������ ���� 1���� �迭�� ����
		 ����1) ����� �迭���� 5�� ����� ��� �ϼ���.
		 ����2) �迭�� ��ġ�� 90��° �϶� ����� ������.
		 */
		int arr_2[] = new int[100];
		for (int i = 0; i < arr_2.length; i++) {
			arr_2[i] = i +1;
			if(arr_2[i] % 5 == 0 && i <= 90) {
				System.out.println(arr_2[i]);
			}
		}
		System.out.println(Arrays.toString(arr_2));
		
		/*
		 �ζǹ�ȣ ������
		 1~45 ���� �߿� 6�� �����ϰ� ����
		 �ߺ� X
		 */
		int[] ball = new int[45];
		int rnd;
		int tmp;
		
		for(int i = 0; i< ball.length; i++) {
			ball[i] = i + 1;
		}
		
		for(int i =0; i < 6; i++) {
			rnd = (int)(Math.random()*45);
			
			tmp = ball[i];
			ball[i] = ball[rnd];
			ball[rnd] = tmp;
		}
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d] = %d\n", i+1, ball[i]);
		}
		
		//�𽺺�ȣ
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." };

		String result2="";

		for (int i=0; i < source.length() ; i++ ) {
			result2+=morse[source.charAt(i)-'A'];
		}
		System.out.println("source:"+ source);
		System.out.println("morse:"+ result2);
		
		/*
		 2���� �迭
		 	- ��� ���� �̷���� �迭
		 	
		 	�ڷ���[][] �迭�̸�;
		 	int[][] student;
		 	
		 ����
		 	int[][] student = new int[3][2];
		 �ʱ�ȭ
		 	int[][] student = {100,200,300,1,2,3,4,5,6};
		 	
		 	int[][] student = {{100,200,300}, {1,2,3}, {4,5,6}};
		 	int[][] student = {{100,200,300}, 
		 					   {1,2,3}, 
		 					   {4,5,6}};
		 					   
		 */
		
		//�ܾ� ���߱�
		String[][] words = {{"chair", "����"},
							{"computer", "��ǻ��"},
							{"integer", "����"}};
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i + 1, words[i][0]);
			
			String temp = sc.nextLine();
			if(temp.equals(words[i][1])) {
				System.out.println("�����Դϴ�. \n\n");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ " + words[i][1] +"�Դϴ�.");
			}
		}
		
		int[][] test_2 = new int[2][2];
		int count =1;
		
		for(int i = 0; i <test_2.length; i++) {
			for (int j = 0; j < test_2[i].length; j++) {
				test_2[i][j] = count++;
			}
		}
		for(int i = 0; i <test_2.length; i++) {
			for (int j = 0; j < test_2[i].length; j++) {
				System.out.print(test_2[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}

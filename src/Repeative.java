import java.util.Scanner;

public class Repeative {
	public static void main(String[] args) {
		/*
		 �ݺ���
		 	���ǿ� �����ϸ� �����Ѵ�(���ǹ��� ����)
		 		>��, ���ǿ� �������� ���� ������
		 	
		 	while��
		 		- ���ǽ��� ���̸� ���๮ ����
		 		- if���� �⺻ ������ ����
		 			if�� : ������ ���̸� �����ϰ� ��
		 			while�� : ������ ���̸� �����ϰ� �ٽ� ���ǽ��� ��
		 	
		 	do~while��
		 		- while���� ������ ����
		 		- ��ɹ��� ���� �� ������ �˻�
		 		- �ּ� �ѹ��� ��ɹ� ����
		 	for��
		 		- Ư���� Ƚ������ �۾� �ݺ�
		 		- �ʱ�ȭ, ���ǽ�, ������
		 		
		 */
		int num = 0;
		while(num < 3) {
			System.out.println(num);
			num++;
		}
		/*
		 1) num = 0, 0 < 3 �����Ͽ� ����(��� �� num 1����)
		 2) num = 1, 1 < 3 �����Ͽ� ����
		 3) num = 2, 2 < 3 �����Ͽ� ����
		 4) num = 3, 3 < 3 �������� �ʾƼ� ��
		 
		 ���Ǻ���
		 	- ���� ������ ���� �ݺ�Ƚ���� ������
		 	
		 �ʱⰪ(���Ǻ��� ����)
		 while(���ǽ�)	//���Ǻ��� ���
		 	��ɹ�(�ݺ� ������ �ڵ� + ���� ������ ��ȭ��)
		 	
		 ���Ǻ����� ��ȭ���� �󸶵��� �����Ӱ� ��밡��
		 ��, ���ǽ��� �����ϵ��� ����
		 */
		
		//�ݺ�Ƚ�� ����
		
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݺ�Ƚ�� �Է� : ");
		count = sc.nextInt();
		while(count > 0) {
			System.out.println("count = " +count);
			count--;
		}
		
		int i = 5;
		while(i-- != 0) {
			System.out.println(i + " - I can do it.");
		}
		/*
		 1. 1���� 10���� �� ���ϱ�
		 	> 1 ~ 10 ���� ������ ����
		 	> �հ踦 ������ ����
		 [��°��]
		 1~10���� ���� 55�Դϴ�.
		 */
		int sum1 = 0;
		int a = 0;
		while(a++ < 10) {
			sum1 = sum1 + a;
		}
		System.out.println("1 ~ 10������ ����" +sum1 +"�Դϴ�.");
		
		/*
		 2. 1���� �Է� ���� ������ �� ���ϱ�
		 [��°��]
		 ���� �Է� : 5
		 1~5������ ���� 15�Դϴ�.
		 */
		int sum2 = 0;
		int num2, cnt;
		
		System.out.print("���� �Է� : ");
		num2 = sc.nextInt();
		cnt = num2;
		
		while(num2 > 0) {
			sum2 += num2;
			num2--;
		}
		System.out.printf("1~%d������ ���� %d�Դϴ�.\n",cnt, sum2);
		
		/*
		 3. ������ 7�� ����ϱ�
		 [��°��]
		 7 * 1 = 7
		 ...
		 7 * 9 = 63
		 */
		int count3 = 0;
		int dan = 7;
		
		while (count3++ < 9) {
			System.out.printf("%d * %d = %d\n", dan, count3, dan*count3);
		}
		
		int number;
		int sum = 0;
		boolean flag = true;
		System.out.println("�հ踦 ���� ���ڸ� �Է�(0�� �Է��ϸ� ����) : ");
		
		while(flag) {	// flag ���� true�̸� ���ǽ��� ��(���ѹݺ�)
			System.out.print(">>");
			number = sc.nextInt();
			
			if (number == 0) {
				flag = false;
			} else {
				sum += number;
			}
		}
		System.out.println("�Է��� �հ�� : " +sum);
		
		int menu = 0;
		do {
			System.out.println("1.���θ����");
			System.out.println("2.���Ͽ���");
			System.out.println("3.���ϴݱ�");
			System.out.print("���� : ");
			menu = sc.nextInt();
		}while(menu < 1 || menu > 3);	//do~while �ڿ��� ;�� ���δ�.
		
		System.out.println("���õ� �޴��� = " +menu);
		
		int rnd;
		rnd = (int)(Math.random()*100 + 1);	//1 ~ 100���� ���� �����ϴ� ���
		System.out.println(rnd);
		/*
		 4. ���ڸ��߱�
		 	1 ~ 100���� �������� ���� ���ڸ� ����
		 	while�� �ȿ��� ���ڸ� �Է� �ް�, ���ڰ� �����̸� Ż��
		 	
		 	[��°��] (������ 70�̶�� ����)
		 	���� �Է� : 50
		 	�� ū ���� �Է��غ�����.
		 	���� �Է� : 80
		 	�� ���� ���� �Է��� ������.
		 	���� �Է� : 70
		 	�����Դϴ�!
		 	3ȸ���� ���߼̽��ϴ�.		*��ȭ : �� ȸ���� ������� �߰��� ���
		 */
		
		int answer;
		answer = (int)(Math.random()*100 + 1);
		boolean on_off = true;
		int num4 = 0;
		int count4 = 0;
		
		while(on_off) {
			System.out.print("�����Է� : ");
			num4 = sc.nextInt();
			if (num4 > answer) {
				System.out.println("�� ���� ���� �Է��� ������.");
				count4++;
			}else if(num4 < answer) {
				System.out.println("�� ū ���� �Է��� ������.");
				count4++;
			}else {
				System.out.println("�����Դϴ�.");
				System.out.println(count4 +"ȸ���� ���߼̽��ϴ�.");
				on_off = false;
			}
		}
		
		//1~10������ ��
		int sum0 = 0;
		for(int k = 0; k <= 10; k++) {
			sum0 += k;
		}
		System.out.println("1~10������ ���� : " +sum0);
		
		//�ΰ��� �ʱⰪ �ΰ��� ������
		for(int k = 1, l = 10; k <= 10; k++, l--) {
			System.out.printf("%d\t %d\n", k, l);
		}
		
		
		/*
		 break��
		 	- �ݺ��� ����
		 	- �����ϰ� �Ǹ� �ݺ��� Ż��
		 	
		 */
		int sum_1 = 0;
		int cnt_1 = 0;
		
		while(true) {
			if(sum_1 > 100) {
				break;
			}	
			++cnt_1;
			sum_1 += cnt_1;
			
		}
		
		System.out.println("cnt_1 = " +cnt_1);
		System.out.println("sum_1 = " +sum_1);
		
		/*
		 continue
		 	- ���ǽ����� ����
		 		while : ���ǽ����� �˻�
		 		for : ���� �� ���ǽ� �˻�
		 */
		
		int num_1 = 0;
		int sum_2 = 0;
		
		while(num_1 <=100) {
			if(num_1 % 3 ==0) {
				num_1++;
				continue;
			}
			
			sum_2 += num_1;
			num_1++;
		}
		System.out.println("1~100���� �� �� 3�� ����� ������ ���� " +sum_2);
		
		//��ø �ݺ���
		for(int l = 1; l <= 10; l++) {
			for(int k =1; k <=10; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int l = 2; l < 10; l++) {
			System.out.println(l+"��");
			for(int k = 1; k < 10; k++) {
				System.out.printf("%d * %d = %d\n", l, k, l*k);
			}
		}
		
		//�̸� ���� �ݺ���
		Loop1 : for(int l = 2; l < 10; l++) {
			System.out.println(l+"��");
			for(int k = 1; k < 10; k++) {
				if(k ==5) {
//					break;
//					break Loop1;
//					continue;
					continue Loop1;
				}
				System.out.printf("%d * %d = %d\n", l, k, l*k);
			}
		}
		sc.close();
	}
}

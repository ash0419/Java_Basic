import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		/*
		 ���ǹ�
		 	- Ư���� ������ �����ϸ� ��ɹ��� ����
		 	
		 	if��
		 		- �⺻���� ���ǹ�
		 		- ������ ���� �� ����
		 		- ����, ~~~~��
		 		'����' ���ǿ� �����ϸ� �����϶�
		 			�����ϴ� : True
		 			�������� �ʴ´� : False
		 			
		 		if(���ǽ�)
		 			��ɹ�
		 		//���� ��ɹ� ���� {}
		 	else
		 		- ���ǽ��� �������� ������ '������' ���⸦ ����
		 		- if�� ����
		 		- if�� �ϳ��� �ϳ��� ��� ����
		 		
		 	else if
		 		- if�� ���ǽ��� �������� ������ ����
		 		- if�� ���ǽ� �������� ���� �� �ٸ� ���� �˻�
		 		- if�� ����(�ϳ��� if�� �������� else if ����)
		 	
		 	switch~case ��
		 		- �ϳ��� ���ǽ����� ���� ����� �� ó��
		 		- ���ǽ��� ����� ���� �Ǵ� ���� (���ڿ� jdk 1.8)
		 		
		 	swith(���ǽ�) {
		 		case ��1 :
		 			//���ǽ��� ����� ��1�� ������ ��� ����
		 		break;
		 		case ��2 :
		 			//���ǽ��� ����� ��2�� ���� ��� ����
		 		break;
		 		default :
		 			// ���ǽ��� ����� ��ġ�ϴ� ���� ���� �� ����(if���� else�� ����)
		 	
		 */
		int a = 5;
		
		if (a < 3)
			System.out.println("a�� 3���� Ů�ϴ�.");
		
		System.out.println("�˻� ��");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		if (input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		
		else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� " +input +" �Դϴ�.");
		}
		/*
		 ���� �����
		 	4�� ������ ��������
		 	100���� ������ �������� �ʾƾ� �Ѵ�.
		 	400���� ������ �������� �����̴�.
		 	
		 	[��°��]
		 	�⵵ �Է� : 2016
		 	�����Դϴ�.
		 */
		System.out.print("�⵵ �Է� : ");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year +"���� �����Դϴ�.");
		}
		else
			System.out.println(year +"���� ������ �ƴմϴ�.");
		
		/*
		 ���� �Է� �޾Ƽ� ���� ����
		 100 ~ 90 : A����
		  89 ~ 80 : B����
		  79 ~ 70 : C����
		  69 ~ 60 : D����
		  49 ~ 0  : F����
		  
		  
		 �����Է� : 92
		 A����
		 */
		System.out.print("�����Է� : ");
		int score = sc.nextInt();
//		if(score >= 90) System.out.println("A����");
//		if(score >= 80 && score < 90) System.out.println("B����");
//		if(score >= 70 && score < 80) System.out.println("C����");
//		if(score >= 60 && score < 70) System.out.println("D����");
//		if(score < 50) System.out.println("F����");
		
		if(score >= 90) System.out.println("A����");
		else if(score >= 80) System.out.println("B����");
		else if(score >= 70) System.out.println("C����");
		else if(score >= 60) System.out.println("D����");
		if(score < 50) System.out.println("F����");
		
		//��ø ���ǹ�
		//���ǹ� ���� �ٽ� ���ǹ��� �ۼ�
		/*
		 ¦�� Ȧ�� �Ǻ���
		 
		 [��°��]
		 �����Է� : 2
		 ¦���Դϴ�.
		 �����Է� : 1
		 Ȧ���Դϴ�.
		 �����Է� : 0
		 0�� �� �ָ��ϳ׿�~
		 */
		
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		if (num %2 == 0) {
			if (num == 0) {
				System.out.println("0�� �� �ָ��ϳ׿�~");
			} else	System.out.println("¦���Դϴ�.");			
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}

		
		String id,passwd;
		System.out.print("���̵� �Է� : ");
		sc.nextLine();
		id = sc.nextLine();
		
		if(id.equals("java")) {
			System.out.println("ID ��ġ");
			System.out.print("��й�ȣ �Է�: ");
			sc.nextLine();
			passwd = sc.nextLine();
			if(passwd.equals("abc123")) {
				System.out.println("password ��ġ");
				System.out.println("�α��� ����");
			} else {
				System.out.println("password ����ġ");
			}
		} else {
			System.out.println("ID ����ġ");
		}
		
		
		int jumsu = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.print("���� �Է� : ");
		jumsu  = sc.nextInt();
		
		System.out.printf("����� ������ %d�Դϴ�.", jumsu);
		
		if(jumsu >= 90) {
			grade = 'A';
			if (jumsu % 10 >= 8) {
				opt = '+';
			}else if(jumsu % 10 < 4) {
				opt = '-';
			}	
		}
		else if (jumsu >= 80) {
			grade = 'B';
			if (jumsu % 10 >= 8) {
				opt = '+';
			}else if(jumsu % 10 < 4) {
				opt = '-';
			}
		}
		
		System.out.printf("����� ������ %c%c�Դϴ�.\n",grade, opt);

		
		//switch��
		int num3;
		
		System.out.println("���� �Է� : ");
		num3 = sc.nextInt();
		
		/*
		switch(num3) {
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		default :
			System.out.println("�� ��~");
			break;
		}
		*/
		//break�� ����
		switch(num3) {
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
		case 3:
			System.out.println("��, ��");
			break;
		default :
			System.out.println("�� ��~");
			break;
		}
		
		//�ֹε�Ϲ�ȣ �Ǻ���
		char gender;
		String regNo;
		
		System.out.print("���� �Է�(123456-1234567) : ");
		sc.nextLine();	//���๮�ڸ� �����ϱ� ���� �߰�
		regNo = sc.nextLine();
		
		gender = regNo.charAt(7);	//���� �Ѵ�����
		
		switch(gender) {
		case '1':
		case '3':
			switch(gender) {
			case '1':
				System.out.println("����� 2000�� ���� ���");
				break;
			case '3':
				System.out.println("����� 2000�� ���� ���");
				break;
			}
			System.out.println("����");
			break;
		case '2':
		case '4':
			System.out.println("����");
			break;
		}
		sc.close();
	}
}

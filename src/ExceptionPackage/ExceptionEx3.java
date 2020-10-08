package ExceptionPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		/*
		 try �� ������ ���� �߻� ��
		 	1. �߻��� ���ܿ� ��ġ�ϴ� catch ���� �ִ��� Ȯ��
		 	2. ��ġ�� catch �� ���� ��, �ش� catch �� ���� ���� ����
		 		��ü try - catch���� �������� ���� ���� ����
		 	�߻����� ���� ��
		 		- catch ���� ��ġ�� �ʰ� try -catch���� ���������� ���� ���
		 */
		
//		Scanner sc = new Scanner(System.in);
		int num;
		int number[] = new int[2];
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(number[2]);
//			num = sc.nextInt();
			System.out.println(0/0);	//���� �߻�
			System.out.println(4);
		} catch (ArithmeticException ae) {
			System.out.println(5);
			ae.printStackTrace();
			System.out.println("���� �޽��� : " +ae.getMessage());
		}  catch (ArrayIndexOutOfBoundsException aoe) {
			System.out.println("�迭 �ε��� �ʰ�");
			aoe.printStackTrace();
			System.out.println("���� �޽��� : " +aoe.getMessage());
		}  catch (InputMismatchException ie) {
			System.out.println("�Է°� �߸� �Է�");
		}  catch (Exception e) {
			System.out.println("�ٸ� ����");
			e.printStackTrace();
			//���� �߻� ����� ȣ�� ���ÿ� �־��� �޼����� ������ ���ܸ޼����� ȭ�鿡 ���
			System.out.println("���� �޽��� : " +e.getMessage());
		}
		System.out.println(6);
		
//		sc.close();
	}
}

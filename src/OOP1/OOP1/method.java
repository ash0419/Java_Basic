package OOP1;

public class method {
	
	static void printArr(int[] numArr) {
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d\n",numArr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		/*
		 �޼���
		 	- Ư�� �۾��� �����ϴ� �Ϸ��� ������� �ϳ��� ���� ��
		 	
		 	����
		 		1. ���� ���뼺
		 			- �� �� ����� ����̰� ȣǮ ���� �� �ٸ� ���α׷������� ��� ����
		 		2. �ߺ��� �ڵ��� ����
		 			- ���� ������ �ݺ��Ǵ� ������ ��� �ϳ��� �޼���� �ۼ�
		 		3. ���α׷��� ����ȭ
		 			- ���α׷��� ��ɺ��� ������ ���� �� �ִ�.
			�޼����� ����� ����
			
			��ȯŸ�� �޼����̸�(Ÿ�� ������, Ÿ�� ������,... �Ű�����) {
				//�޼��� ȣ��� ����� �ڵ�
				return 0;	//��ȯ��	//������
			}
			
			�޼��� �̸�
				- ������ ����Ģ�� ����
				- �ǹ��ִ� �̸�
				
			��ȯŸ��
				- �޼����� �۾� ���� ������� ��ȯ�ϴ� ����(ex : ������ int)
				- ��ȯ���� ���� ��� void
				
			�Ű�����
				- �޼��带 ȣ���ϸ鼭 �Ѱ��ִ� ����
				- �޼��� �������� ��� ����(��������)
			��ȯ��
				- �ʿ� ������ ���� ����(�����Ϸ� �ڵ� �߰�)
				- �޼����� ���� ����� ȣ���� �޼���� ��ȯ �� ���
				- ��ȯŸ�԰� ��ġ �Ǵ� �ڵ�����ȯ ������ ��
				- �޼��� �� �ϳ��� ����
			�޼����� ȣ��
				- �޼���� ���Ǹ����δ� ��� X
				- ȣ�� �ÿ��� �޼��忡 ���ǵ� �Ű������� ���� ������ ������ ��ġ �ؾ���
		 */
		
		int[] numArr = new int [10];
		
		for(int i = 0; i < 10; i++) {
			numArr[i] = (int)(Math.random()*10);
		}
		printArr(numArr);
		printArr(numArr);
		printArr(numArr);
		printArr(numArr);
		printArr(numArr);
		
		
		MyMath mm = new MyMath();
		int result = mm.add(5, 3);
		
		System.out.println("mm.add(5,3) : " +result);
		
		System.out.println("mm.sub(5,3) : "+mm.sub(5,3));
		System.out.println("mm.div(5,3) : "+mm.div(5.0,3.0));
	}
}




class MyMath {
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	//����, ����, ������
	int sub(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	double div(double a, double b) {
		return a / b;
	}
}

public class day0910 {
	/*
	 2020-09-10
	 �ڹټ��� 2����
	 ��¹�, ����
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		/* - ���� �� �ּ�
		 �ּ�
		 	- �ҽ��ڵ� ������ �߰��ϴ� ��
		 	- ���α׷� ���࿡ ������ ����.
		 	- �� �� �ּ� : //�ں��� �ּ�
		 */
		
		
		
		//�ڹ��� ��¹�
		System.out.print("Hello World"); //�����ݷ� : ������ ���� �˸��� ��ȣ
		System.out.println("Hello World\n\n\n\n\n");
		//�ڵ� �ٹٲ��� ���� ln
		System.out.printf("Hello World \n");
		//������ �̿��� ���
		
		System.out.printf("Hello %s \n", "ȣ��");
		System.out.printf("\"���̴� %d\" \n", 50);
		/*
		 ���Ĺ���
		 %d : 10����
		 %s : 16����
		 %c : ����
		 %s : ���ڿ�
		 %b : Bool��
		 %f : �Ǽ���
		 
		 �̽������� ����
		 \n : ����(����Ű)
		 \t : ������
		 \r : ���� ó������ Ŀ�� �̵�
		 \\ : �������� ���
		 \" : ū����ǥ ���
		 \' : ��������ǥ ���
		 */
		
		/*
		 ����
		  	- ���ϴ� ��(���α׷��� ����Ǵ� ���� ���氡���� ����)
		  	- ���α׷� ó�� �������� �����͸� ��Ƶ� �� �ִ� �޸��� ����
		  	
		  ������ ����
		  	int a;
		  	
		  	int - ������ Ÿ��
		  	a - ������
		  	
		  	�ʱ�ȭ
		  	int a;
		  	a = 1;
		  	
		  	�ʱⰪ - ������ ������ �� ������ ��
		 */
		
		int a =1;
		int b;
		System.out.println(a);
		//System.out.println(b);	//�ʱ�ȭ ���� ���� �ÿ� ����. ������ �� ����
		
		/*
		 ���� ���� ��Ģ(�ĺ��� ���� ��Ģ)
		 - ������ �̸��� ���� ��ҹ���, ����, Ư������($, _)�� ����
		 - ���� ��ҹ��� ����
		 - ������ ������ ���� X
		 - ����� ��� X
		 - �ǹ� �ִ� ���
		 */
		int name2;
//		int 2name;
		int $temp;
//		int #temp;
		
		int apple;
//		AppLe = a;
		
//		throws
//		class
//		try
		
		/*
		 ������ Ÿ��(�ڷ���)
		 
		 ������ - ����(�Ҽ����� �ƴ� �ڿ���)�� ������ �� ����ϴ� ������ Ÿ��
		  byte : 1byte
		  short : 2byte
		  int : 4byte
		  long : 8byte
		  
		 �Ǽ��� - �Ǽ�(�Ҽ���)�� ����
		  float : 4byte
		  double : 8byte
		  	- �Ҽ��� �ڸ��� ���� ���е� ���̰� ����
		  	
		  	float�� �Ҽ��� ���� 6�ڸ�
		  	double �Ҽ��� ���� 15�ڸ�
		  	
		 ������ - ���ڸ� ���� �� �ִ� Ÿ��('')
		  char : 2byte(�����ڵ� ���)
		  
		 ���� - True/False
		  - ���� ����
		  - 0�� ����, �� �ܿ��� ��
		  
		 ���ڿ���
		  String : ���ڰ� ������ ����
		  String a = "Hello";
		  String b = new String("Hello");
		 */
		
		//������ ����
		int num;	//������ int�� num ����
		num = 10;
//		int num - 10;
		
		System.out.println("num = " +num);
		System.out.printf("num = %d\n", num);
		
		num = 20;
		System.out.println("num = " +num);
		System.out.println("num + num = " +(num +num));
		System.out.printf("num + num = %d\n", num+num);
		
		//byte ���� -128 ~ 127
		//1byte -> 8bit -2�� 7�� ~ 2�� 7�� -1
		//2byte -> 16bit -2�� 15�� ~ 2�� 15�� -1

		/*
		 ����ȯ
		 	- ������ ����� ������ Ÿ���� �ٸ� Ÿ������ ��ȯ
		 	�ڵ�����ȯ(����������ȯ) : ũ�⿡ ���缭 �˸��� Ÿ������ ����ȯ
		 	���������ȯ(ĳ����) : ���α׷��Ӱ� ������ �ڷḦ ������ ����ȯ
		 */
		byte number1 = 127;
		byte number2 = (byte)-129;
		
		System.out.println("number1 = " +number1);
		System.out.println("number2 = " +number2);
		
		//�Ǽ���
		float f = 0.12345678f;	//����� ǥ��
		System.out.println("f = " +f);
		System.out.printf("%.2f\n", f);
		double d = 0.12345678901234567;
		System.out.println("d = " +d);
		
		//������ ����
		char ch;
		ch = 'a';
		System.out.println("ch = " +ch);
		System.out.printf("ch = %c\n", ch);
		
		ch = 97;
		System.out.println("ch = " +ch);
		System.out.printf("ch = %c\n", ch);
		
		System.out.println("ch = " +(ch+1));
		System.out.printf("ch = %c\n", ch+1);
		
		ch = '\u0061';
		System.out.println("ch = " +ch);
		System.out.printf("ch = %c\n", ch);
		
		/*
		 ���
		 	- ���α׷� ���� �� ������ �� ���� ������ ��
		 	final datatype ����� = ��;
		 */
		
		int t = 3;
		t = 4;
		
		final double PI = 3.14;
//		PI = 3.15;
		
	}
	
}

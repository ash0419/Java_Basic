
public class Operator {
	public static void main(String[] args) {
		/*
		 ����
		 	- �־�� ���� ����Ͽ� ����� ���� ����
		 	
		 ������
		 	- Ư���� ������ �����ϱ� ���� ����ϴ� ��ȣ
		 	- ������ �ϴ� �����ڿ� ������ ���ϴ� �ǿ������� ����
		 	
		 ��� ������
		 	+ : ���ϱ�
		 	- : ����
		 	* : ���ϱ�
		 	/ : ������(��)
		 	% : ������(������)
		 */
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " +(num1 + num2));
		System.out.println("num1 - num2 = " +(num1 - num2));
		System.out.println("num1 * num2 = " +(num1 * num2));
		System.out.println("num1 / num2 = " +(num1 / num2));
		System.out.println("num1 % num2 = " +(num1 % num2));
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int time = sc.nextInt();
		
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) /60;
		
		System.out.print(time +"�ʴ� ");
		System.out.print(hour +"�ð� ");
		System.out.print(minute +"�� ");
		System.out.print(second +"�� �Դϴ�.");
		
		sc.close();
		*/
		
		/*
		 ���� ������
		 	- ���� �ϳ��� ������
		 	
		 	- : ��ȣ������(������ ��ȣ ����)
		 	! : ����������(True -> False, False -> True)
		 	++ : �߰� ������(������ 1 ����, a++ or ++a)
		 	-- : ���� ������(������ 1 ����, a-- or --a)
		 	
		 ���� ������
		 	���� : ��ɹ� ���� �� ����
		 	���� : ��ɹ� ����� �� ����
		 */
		int a = -1;
		System.out.println("a = " +a);
		System.out.println("-a = " +(-a));
		
		boolean b = true;
		System.out.println("b = " +b);
		System.out.println("!b = " +!b);
		
		int c = 10;
		System.out.println("���� c�� ��: " +c);
		System.out.println("���� c�� ��: " +(++c));	//���� �������̱� ������ ����ϱ� ���� ����
		System.out.println("���� c�� ��: " +(c++));	//���� �����ڶ� ����ϰ� �� �� ����
		System.out.println("���� c�� ��: " +c);
		
		int d = ++c;
		System.out.println(c);
		d = c++;
		System.out.println(d);
		System.out.println(c);
		
		int aa, bb, cc, dd;
		
		aa = 1;
		bb= ++aa;	
		cc= aa++;	
		dd = bb++ + ++cc;	
		
		System.out.println("aa = " +aa);	// aa = 3
		System.out.println("bb = " +bb);	// bb = 3
		System.out.println("cc = " +cc);	// cc = 3
		System.out.println("dd = " +dd);	// dd = 5
		
		/*
		 ���� ������
		 	=  : ������ �ǿ����ڿ� ������ ���� ����
		 	
		 ���� ���� ������
		 	a+=b : a = a + b
		 	a*+b : a = a * b
		 	
		 �� ������
		 	- �纯�� ���Ͽ� ������ True, �ٸ��� False ��ȯ
		 	
		 	== : ����
		 	>  : ũ��
		 	<  : �۴�
		 	>= : ũ�ų� ����
		 	<= : �۰ų� ����
		 	!= : ���� �ʴ�
		 */
		
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println( 3 == 2);
		System.out.println(3 != 2);
		System.out.println(!( 3!= 2));
		
		// ���ڿ��� ���� ���� ==���� ���ϸ� �ȵȴ�
		String str = "Hello Java";
		String str1 = "Hello Java";
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str.equals("Hello Java")); // ���ڿ� ���� �� ����ϴ� .equal ��ҹ��� ����
		
		/*
		 �� ������
		 	- �������� ������ ���ÿ� �˻��ϴ� ��� ���
		 	- ���ϴ� �� ���� boolean �����̾�� ��
		 	
		 	&&(AND) : �� �� True�� �� True
		 	||(OR) : �� �� �ϳ��� True���� True
		 	!(NOT) : True -> False, False -> True
		 */
		
		int aaa = 10;
		// 5 < x < 15
		System.out.println((5 < aaa) && (aaa < 15));
		System.out.println((5 < aaa) && (aaa < 15) || a % 2 != 0);
		
		/*
		 ��Ʈ ���� (Ȯ���ϰų� ó���� �� ���)
		 	��Ʈ AND(&) : ��Ʈ ������ AND ����
		 	��Ʈ OR(|) : ��Ʈ ������ OR ����
		 	��Ʈ XOR(^) : ��Ʈ ������ XOR ���� XOR = ���� ������ 1�� ��ȯ
		 	��Ʈ NOT(~) : ��ȣ ����
		 	
		 ����Ʈ ����
		 	>> : ���������� ��Ʈ �̵�(��Ʈ �ϳ� �̵� /2)
		 	<< : �������� ��Ʈ �̵�(��Ʈ �ϳ� �̵� *2)
		 
		 ���� ������
		 	- ���� 3���� ������
		 	- ���ǽ��� ����� ���� ��� ��ȯ
		 	- ����? �׸�1 (��) : �׸�2 (����)
		 */
		
		int age = 17;
		
		System.out.println(age > 19? "�����Դϴ�." : "û�ҳ��Դϴ�.");
		
		
		int test;
		test = aa> bb? aa : bb;
		
	}
}

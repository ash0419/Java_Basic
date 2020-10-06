package OOP2;

import java.util.Scanner;

abstract class Calc {
	int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();// �߻�޼���

}

class Add extends Calc {

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a + b;
	}

}

class Sub extends Calc {

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a - b;
	}

}

class Mul extends Calc {
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a * b;
	}
}

class Div extends Calc {
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a / b;
	}
}

public class Ex_1006_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ ������ �Է� >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char op = sc.next().charAt(0);

		Calc exp;

		switch (op) {
		case '+':
			exp = new Add();
			break;
		case '-':
			exp = new Sub();
			break;
		case '*':
			exp = new Mul();
			break;
		case '/':
			exp = new Div();
			break;
		default:
			System.out.println("�߸��� ������ �Դϴ�.");
			return;
		}

		exp.setValue(a, b);

		System.out.println(exp.calculate());
	}
}

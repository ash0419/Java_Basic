import java.util.Scanner;

public class Ex_0916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자를 입력하세요 : ");
		num =  sc.nextInt();
		System.out.println((num - (num % 10)) +"이상 " +(num - (num % 10) + 10) +"미만");
		
		
		int month = 0;
		
		System.out.print("달 입력 : ");
		month = sc.nextInt();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month +"월의 날 수는 31일 입니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month +"월의 날 수는 30일 입니다");
			break;
		case 2:
			System.out.println(month +"월의 날 수는 28일 입니다");
			break;
		}
		
		int a, b, c;
		
		System.out.print("정수 3개 입력>> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b && a > c) {
			if (b > c) {
				System.out.println("중간 값은 " +b);
			}else {
				System.out.println("중간 값은 " +c);
			}
		}else if(b > a && b > c) {
			if (a > c) {
				System.out.println("중간 값은 " +a);
			}else {
				System.out.println("중간 값은 " +c);
			}
		}else if(c > a && c > b) {
			if ( a > b) {
				System.out.println("중간 값은 " +a);
			}else {
				System.out.println("중간 값은 " +b);
			}
		}
		
		sc.close();

	}
}

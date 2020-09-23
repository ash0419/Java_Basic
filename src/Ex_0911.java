
public class Ex_0911 {
	public static void main(String[] args) {
		/*변수 6 개를 선언해(int 형 4 개, char 형 1 개, String 형 1 개) int 형 변수 3 개에는 20, 25,
		30 을 대입하고 나머지 int 형에는 이 세값을 더하는 식을 대입한다. Char 형 변수에는 ?를
		string 형 변수에는 자기소개를 대입한다. 출력은 변수만 넣어 출력하는 프로그램을 작성.*/
		int a = 20;
		int b = 25;
		int c = 30;
		int sum = a+b+c;
		System.out.println("a와 b와 c의 합은 : " +sum +"입니다.");
		
		char q = '?';
		String name = new String("My name is 상후"); //= String name = "My name is 상후"
		
		System.out.printf("Hello%c %s\n%c\n",q, name,q);
		
		/*반지름이 10인 원의 넓이를 구하는 프로그램을 작성.
		조건 : 변수 3개를 생성, 각 변수에 원주율, 반지름, 계산값을 대입.
		출력코드에 계산값의 변수만 넣어 출력할 것.
		원 넓이 구하는 식 : 반지름 * 반지름 * 3.14*/
		int r = 10;	//float a = 10.0f;
		final double PI = 3.14;
		double width;
		width = (float)r * (float)r * PI;
		System.out.printf("반지름 %d의 원 넓이는 %.1f입니다.\n",r, width);
		
		/*현재 변수 num1, num2에는 각각 10, 20이 대입되어 있다. Num1과 num2의 값을 서로
		바꾸어 num1에는 20, num2에는 10이 들어가는 프로그램을 작성.
		힌트 : 변수 한 개를 더 생성하여 하노이 탑의 원리를 이용해보자.*/
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("현재 num1에는 : " +num1);
		System.out.println("현재 num2에는 : " +num2);
		
		int num3 = 0;
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("바뀐값 num1에는 : " +num1);
		System.out.println("바뀐값 num2에는 : " +num2);
		
		
	}
}

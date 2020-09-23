import java.util.Scanner;

public class Ex_0914 {
	public static void main(String[] args) {
		double rate = 1100.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = sc.nextInt();
		System.out.println(money +"원은 $" +(money / rate) +"입니다.");
		
		System.out.print("화씨를 입력하세요 : ");
		float F = sc.nextFloat();
		
		System.out.println("현재 화씨는 :" +String.format("%.0f", F));
		System.out.println("\n\n");
		System.out.println("입력한 화씨를 섭씨로 바꾼 결과 : " +String.format("%.0f",(5.0/9.0*(F -32.0))));
		
		System.out.println("두 숫자를 입력하세요 :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("두 숫자 중 큰 값은 " +(a>b? a:b) +"입니다.");
		
		sc.close();
	}
}

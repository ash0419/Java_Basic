import java.util.Scanner;

public class Repeative {
	public static void main(String[] args) {
		/*
		 반복문
		 	조건에 만족하면 수행한다(조건문과 동일)
		 		>단, 조건에 만족하지 않을 때까지
		 	
		 	while문
		 		- 조건식이 참이면 수행문 수행
		 		- if문과 기본 구조가 동일
		 			if문 : 조건이 참이면 수행하고 끝
		 			while문 : 조건이 참이면 수행하고 다시 조건식을 비교
		 	
		 	do~while문
		 		- while문의 변형된 형태
		 		- 명령문을 실행 후 조건을 검사
		 		- 최소 한번은 명령문 실행
		 	for문
		 		- 특정한 횟수동안 작업 반복
		 		- 초기화, 조건식, 증감식
		 		
		 */
		int num = 0;
		while(num < 3) {
			System.out.println(num);
			num++;
		}
		/*
		 1) num = 0, 0 < 3 만족하여 수행(출력 및 num 1증가)
		 2) num = 1, 1 < 3 만족하여 수행
		 3) num = 2, 2 < 3 만족하여 수행
		 4) num = 3, 3 < 3 만족하지 않아서 끝
		 
		 조건변수
		 	- 조건 변수에 따라 반복횟수가 정해짐
		 	
		 초기값(조건변수 생성)
		 while(조건식)	//조건변수 사용
		 	명령문(반복 수행할 코드 + 조건 변수의 변화식)
		 	
		 조건변수의 변화식은 얼마든지 자유롭게 사용가능
		 단, 조건식이 만족하도록 구성
		 */
		
		//반복횟수 지정
		
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("반복횟수 입력 : ");
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
		 1. 1부터 10까지 합 구하기
		 	> 1 ~ 10 까지 증가할 변수
		 	> 합계를 누적할 변수
		 [출력결과]
		 1~10까지 합은 55입니다.
		 */
		int sum1 = 0;
		int a = 0;
		while(a++ < 10) {
			sum1 = sum1 + a;
		}
		System.out.println("1 ~ 10까지의 합은" +sum1 +"입니다.");
		
		/*
		 2. 1부터 입력 받은 수까지 합 구하기
		 [출력결과]
		 숫자 입력 : 5
		 1~5까지의 합은 15입니다.
		 */
		int sum2 = 0;
		int num2, cnt;
		
		System.out.print("숫자 입력 : ");
		num2 = sc.nextInt();
		cnt = num2;
		
		while(num2 > 0) {
			sum2 += num2;
			num2--;
		}
		System.out.printf("1~%d까지의 합은 %d입니다.\n",cnt, sum2);
		
		/*
		 3. 구구단 7단 출력하기
		 [출력결과]
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
		System.out.println("합계를 구할 숫자를 입력(0을 입력하면 종료) : ");
		
		while(flag) {	// flag 값이 true이면 조건식이 참(무한반복)
			System.out.print(">>");
			number = sc.nextInt();
			
			if (number == 0) {
				flag = false;
			} else {
				sum += number;
			}
		}
		System.out.println("입력한 합계는 : " +sum);
		
		int menu = 0;
		do {
			System.out.println("1.새로만들기");
			System.out.println("2.파일열기");
			System.out.println("3.파일닫기");
			System.out.print("선택 : ");
			menu = sc.nextInt();
		}while(menu < 1 || menu > 3);	//do~while 뒤에는 ;을 붙인다.
		
		System.out.println("선택된 메뉴는 = " +menu);
		
		int rnd;
		rnd = (int)(Math.random()*100 + 1);	//1 ~ 100까지 난수 생성하는 방법
		System.out.println(rnd);
		/*
		 4. 숫자맞추기
		 	1 ~ 100까지 랜덤으로 정답 숫자를 생성
		 	while문 안에서 숫자를 입력 받고, 숫자가 정답이면 탈출
		 	
		 	[출력결과] (정답이 70이라고 가정)
		 	숫자 입력 : 50
		 	더 큰 수를 입력해보세요.
		 	숫자 입력 : 80
		 	더 작은 수를 입력해 보세요.
		 	숫자 입력 : 70
		 	정답입니다!
		 	3회만에 맞추셨습니다.		*심화 : 몇 회만에 맞췄는지 추가로 출력
		 */
		
		int answer;
		answer = (int)(Math.random()*100 + 1);
		boolean on_off = true;
		int num4 = 0;
		int count4 = 0;
		
		while(on_off) {
			System.out.print("숫자입력 : ");
			num4 = sc.nextInt();
			if (num4 > answer) {
				System.out.println("더 작은 수를 입력해 보세요.");
				count4++;
			}else if(num4 < answer) {
				System.out.println("더 큰 수를 입력해 보세요.");
				count4++;
			}else {
				System.out.println("정답입니다.");
				System.out.println(count4 +"회만에 맞추셨습니다.");
				on_off = false;
			}
		}
		
		//1~10까지의 합
		int sum0 = 0;
		for(int k = 0; k <= 10; k++) {
			sum0 += k;
		}
		System.out.println("1~10까지의 합은 : " +sum0);
		
		//두개의 초기값 두개의 증감식
		for(int k = 1, l = 10; k <= 10; k++, l--) {
			System.out.printf("%d\t %d\n", k, l);
		}
		
		
		/*
		 break문
		 	- 반복문 종료
		 	- 마주하게 되면 반복문 탈출
		 	
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
		 	- 조건식으로 점프
		 		while : 조건식으로 검사
		 		for : 증감 후 조건식 검사
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
		System.out.println("1~100까지 수 중 3의 배수를 제외한 합은 " +sum_2);
		
		//중첩 반복문
		for(int l = 1; l <= 10; l++) {
			for(int k =1; k <=10; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int l = 2; l < 10; l++) {
			System.out.println(l+"단");
			for(int k = 1; k < 10; k++) {
				System.out.printf("%d * %d = %d\n", l, k, l*k);
			}
		}
		
		//이름 붙은 반복문
		Loop1 : for(int l = 2; l < 10; l++) {
			System.out.println(l+"단");
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

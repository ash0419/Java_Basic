import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		/*
		 조건문
		 	- 특정한 조건을 만족하면 명령문을 실행
		 	
		 	if문
		 		- 기본적인 조건문
		 		- 조건이 참일 때 실행
		 		- 만약, ~~~~면
		 		'만약' 조건에 만족하면 수행하라
		 			만족하다 : True
		 			만족하지 않는다 : False
		 			
		 		if(조건식)
		 			명령문
		 		//여러 명령문 실행 {}
		 	else
		 		- 조건식이 만족하지 않으면 '무조건' 여기를 수행
		 		- if문 종속
		 		- if문 하나당 하나만 사용 가능
		 		
		 	else if
		 		- if문 조건식이 만족하지 않으면 수행
		 		- if문 조건식 만족하지 않을 때 다른 조건 검사
		 		- if문 종속(하나의 if에 여러개의 else if 가능)
		 	
		 	switch~case 문
		 		- 하나의 조건식으로 많은 경우의 수 처리
		 		- 조건식의 결과는 정수 또는 문자 (문자열 jdk 1.8)
		 		
		 	swith(조건식) {
		 		case 값1 :
		 			//조건식의 결과가 값1과 ㄱㅌ은 경우 실행
		 		break;
		 		case 값2 :
		 			//조건식의 결과가 값2과 같은 경우 실행
		 		break;
		 		default :
		 			// 조건식의 결과와 일치하는 값이 없을 때 실행(if문의 else와 동일)
		 	
		 */
		int a = 5;
		
		if (a < 3)
			System.out.println("a는 3보다 큽니다.");
		
		System.out.println("검사 끝");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 " +input +" 입니다.");
		}
		/*
		 윤년 만들기
		 	4로 나누어 떨어지고
		 	100으로 나누어 떨어지지 않아야 한다.
		 	400으로 나누어 떨어지면 윤년이다.
		 	
		 	[출력결과]
		 	년도 입력 : 2016
		 	윤년입니다.
		 */
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year +"년은 윤년입니다.");
		}
		else
			System.out.println(year +"년은 윤년이 아닙니다.");
		
		/*
		 점수 입력 받아서 학점 계산기
		 100 ~ 90 : A학점
		  89 ~ 80 : B학점
		  79 ~ 70 : C학점
		  69 ~ 60 : D학점
		  49 ~ 0  : F학점
		  
		  
		 점수입력 : 92
		 A학점
		 */
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
//		if(score >= 90) System.out.println("A학점");
//		if(score >= 80 && score < 90) System.out.println("B학점");
//		if(score >= 70 && score < 80) System.out.println("C학점");
//		if(score >= 60 && score < 70) System.out.println("D학점");
//		if(score < 50) System.out.println("F학점");
		
		if(score >= 90) System.out.println("A학점");
		else if(score >= 80) System.out.println("B학점");
		else if(score >= 70) System.out.println("C학점");
		else if(score >= 60) System.out.println("D학점");
		if(score < 50) System.out.println("F학점");
		
		//중첩 조건문
		//조건문 내에 다시 조건문을 작성
		/*
		 짝수 홀수 판별기
		 
		 [출력결과]
		 숫자입력 : 2
		 짝수입니다.
		 숫자입력 : 1
		 홀수입니다.
		 숫자입력 : 0
		 0은 좀 애매하네요~
		 */
		
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		if (num %2 == 0) {
			if (num == 0) {
				System.out.println("0은 좀 애매하네요~");
			} else	System.out.println("짝수입니다.");			
		}
		else {
			System.out.println("홀수입니다.");
		}

		
		String id,passwd;
		System.out.print("아이디 입력 : ");
		sc.nextLine();
		id = sc.nextLine();
		
		if(id.equals("java")) {
			System.out.println("ID 일치");
			System.out.print("비밀번호 입력: ");
			sc.nextLine();
			passwd = sc.nextLine();
			if(passwd.equals("abc123")) {
				System.out.println("password 일치");
				System.out.println("로그인 성공");
			} else {
				System.out.println("password 불일치");
			}
		} else {
			System.out.println("ID 불일치");
		}
		
		
		int jumsu = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.print("점수 입력 : ");
		jumsu  = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.", jumsu);
		
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
		
		System.out.printf("당신의 학점은 %c%c입니다.\n",grade, opt);

		
		//switch문
		int num3;
		
		System.out.println("숫자 입력 : ");
		num3 = sc.nextInt();
		
		/*
		switch(num3) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default :
			System.out.println("그 외~");
			break;
		}
		*/
		//break문 제거
		switch(num3) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
		case 3:
			System.out.println("둘, 셋");
			break;
		default :
			System.out.println("그 외~");
			break;
		}
		
		//주민등록번호 판별기
		char gender;
		String regNo;
		
		System.out.print("민증 입력(123456-1234567) : ");
		sc.nextLine();	//개행문자를 제거하기 위해 추가
		regNo = sc.nextLine();
		
		gender = regNo.charAt(7);	//문자 한단위만
		
		switch(gender) {
		case '1':
		case '3':
			switch(gender) {
			case '1':
				System.out.println("당신은 2000년 이전 출생");
				break;
			case '3':
				System.out.println("당신은 2000년 이후 출생");
				break;
			}
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		sc.close();
	}
}

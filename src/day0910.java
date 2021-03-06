
public class day0910 {
	/*
	 2020-09-10
	 자바수업 2일차
	 출력문, 변수
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		/* - 여러 줄 주석
		 주석
		 	- 소스코드 설명을 추가하는 것
		 	- 프로그램 수행에 영향이 없다.
		 	- 한 줄 주석 : //뒤부터 주석
		 */
		
		
		
		//자바의 출력문
		System.out.print("Hello World"); //세미콜론 : 문장의 끝을 알리는 기호
		System.out.println("Hello World\n\n\n\n\n");
		//자동 줄바꿈이 있음 ln
		System.out.printf("Hello World \n");
		//서식을 이용한 출력
		
		System.out.printf("Hello %s \n", "호근");
		System.out.printf("\"나이는 %d\" \n", 50);
		/*
		 서식문자
		 %d : 10진수
		 %s : 16진수
		 %c : 문자
		 %s : 문자열
		 %b : Bool형
		 %f : 실수형
		 
		 이스케이프 문자
		 \n : 개형(엔터키)
		 \t : 수평탭
		 \r : 줄의 처음으로 커서 이동
		 \\ : 역슬래쉬 출력
		 \" : 큰따옴표 출력
		 \' : 작은따옴표 출력
		 */
		
		/*
		 변수
		  	- 변하는 수(프로그램이 진행되는 동안 변경가능한 공간)
		  	- 프로그램 처리 과정에서 데이터를 담아둘 수 있는 메모리의 공간
		  	
		  변수의 선언
		  	int a;
		  	
		  	int - 데이터 타입
		  	a - 변수명
		  	
		  	초기화
		  	int a;
		  	a = 1;
		  	
		  	초기값 - 변수를 선언한 후 최초의 값
		 */
		
		int a =1;
		int b;
		System.out.println(a);
		//System.out.println(b);	//초기화 하지 않을 시에 에러. 쓰레기 값 존재
		
		/*
		 변수 생성 규칙(식별자 생성 규칙)
		 - 변수의 이름은 영어 대소문자, 숫자, 특수문자($, _)만 가능
		 - 영어 대소문자 구별
		 - 변수의 시작은 숫자 X
		 - 예약어 사용 X
		 - 의미 있는 명명
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
		 데이터 타입(자료형)
		 
		 정수형 - 정수(소수점이 아닌 자연수)를 저장할 때 사용하는 데이터 타입
		  byte : 1byte
		  short : 2byte
		  int : 4byte
		  long : 8byte
		  
		 실수형 - 실수(소수점)를 저장
		  float : 4byte
		  double : 8byte
		  	- 소수점 자리에 따라 정밀도 차이가 있음
		  	
		  	float은 소수점 이하 6자리
		  	double 소수점 이하 15자리
		  	
		 문자형 - 문자를 담을 수 있는 타입('')
		  char : 2byte(유니코드 사용)
		  
		 논리형 - True/False
		  - 참과 거짓
		  - 0은 거짓, 그 외에는 참
		  
		 문자열형
		  String : 문자가 나열된 형태
		  String a = "Hello";
		  String b = new String("Hello");
		 */
		
		//정수형 예제
		int num;	//정수형 int인 num 선언
		num = 10;
//		int num - 10;
		
		System.out.println("num = " +num);
		System.out.printf("num = %d\n", num);
		
		num = 20;
		System.out.println("num = " +num);
		System.out.println("num + num = " +(num +num));
		System.out.printf("num + num = %d\n", num+num);
		
		//byte 범위 -128 ~ 127
		//1byte -> 8bit -2의 7승 ~ 2의 7승 -1
		//2byte -> 16bit -2의 15승 ~ 2의 15승 -1

		/*
		 형변환
		 	- 변수나 상수의 데이터 타입을 다른 타입으로 변환
		 	자동형변환(묵시적형변환) : 크기에 맞춰서 알맞은 타입으로 형변환
		 	명시적형변환(캐스팅) : 프로그래머가 변수의 자료를 강제로 형변환
		 */
		byte number1 = 127;
		byte number2 = (byte)-129;
		
		System.out.println("number1 = " +number1);
		System.out.println("number2 = " +number2);
		
		//실수형
		float f = 0.12345678f;	//명시적 표현
		System.out.println("f = " +f);
		System.out.printf("%.2f\n", f);
		double d = 0.12345678901234567;
		System.out.println("d = " +d);
		
		//문자형 예제
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
		 상수
		 	- 프로그램 실행 중 변경할 수 없는 고정된 값
		 	final datatype 상수명 = 값;
		 */
		
		int t = 3;
		t = 4;
		
		final double PI = 3.14;
//		PI = 3.15;
		
	}
	
}

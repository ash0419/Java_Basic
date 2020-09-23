
public class Operator {
	public static void main(String[] args) {
		/*
		 연산
		 	- 주어신 식을 계산하여 결과를 얻어내는 과정
		 	
		 연산자
		 	- 특정한 연산을 수행하기 위해 사용하는 기호
		 	- 연산을 하는 연산자와 연산을 당하는 피연산으로 구성
		 	
		 산술 연산자
		 	+ : 더하기
		 	- : 빼기
		 	* : 곱하기
		 	/ : 나누기(몫)
		 	% : 나누기(나머지)
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
		
		System.out.print("초 입력 : ");
		int time = sc.nextInt();
		
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) /60;
		
		System.out.print(time +"초는 ");
		System.out.print(hour +"시간 ");
		System.out.print(minute +"분 ");
		System.out.print(second +"초 입니다.");
		
		sc.close();
		*/
		
		/*
		 단항 연산자
		 	- 항이 하나인 연산자
		 	
		 	- : 부호연산자(변수의 부호 변경)
		 	! : 부정연산자(True -> False, False -> True)
		 	++ : 중가 연산자(변수에 1 증가, a++ or ++a)
		 	-- : 감소 연산자(변수에 1 감소, a-- or --a)
		 	
		 증감 연산자
		 	전위 : 명령문 실행 전 연산
		 	후위 : 명령문 실행된 후 연산
		 */
		int a = -1;
		System.out.println("a = " +a);
		System.out.println("-a = " +(-a));
		
		boolean b = true;
		System.out.println("b = " +b);
		System.out.println("!b = " +!b);
		
		int c = 10;
		System.out.println("현재 c의 값: " +c);
		System.out.println("현재 c의 값: " +(++c));	//전위 연산자이기 때문에 출력하기 전에 연산
		System.out.println("현재 c의 값: " +(c++));	//후위 연사자라서 출력하고 난 뒤 연산
		System.out.println("현재 c의 값: " +c);
		
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
		 대입 연산자
		 	=  : 왼쪽의 피연산자에 오른쪽 값을 대입
		 	
		 복합 대입 연산자
		 	a+=b : a = a + b
		 	a*+b : a = a * b
		 	
		 비교 연산자
		 	- 양변을 비교하여 같으면 True, 다르면 False 반환
		 	
		 	== : 같다
		 	>  : 크다
		 	<  : 작다
		 	>= : 크거나 같다
		 	<= : 작거나 같다
		 	!= : 같지 않다
		 */
		
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println( 3 == 2);
		System.out.println(3 != 2);
		System.out.println(!( 3!= 2));
		
		// 문자열을 비교할 때는 ==으로 비교하면 안된다
		String str = "Hello Java";
		String str1 = "Hello Java";
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str.equals("Hello Java")); // 문자열 비교할 때 사용하는 .equal 대소문자 구분
		
		/*
		 논리 연산자
		 	- 여러가지 조건을 동시에 검사하는 경우 사용
		 	- 비교하는 두 값이 boolean 형태이어야 함
		 	
		 	&&(AND) : 둘 다 True일 때 True
		 	||(OR) : 둘 중 하나면 True여도 True
		 	!(NOT) : True -> False, False -> True
		 */
		
		int aaa = 10;
		// 5 < x < 15
		System.out.println((5 < aaa) && (aaa < 15));
		System.out.println((5 < aaa) && (aaa < 15) || a % 2 != 0);
		
		/*
		 비트 연산 (확인하거나 처리할 때 사용)
		 	비트 AND(&) : 비트 단위의 AND 연산
		 	비트 OR(|) : 비트 단위의 OR 연산
		 	비트 XOR(^) : 비트 단위의 XOR 연산 XOR = 같지 않으면 1을 반환
		 	비트 NOT(~) : 부호 반전
		 	
		 시프트 연산
		 	>> : 오른쪽으로 비트 이동(비트 하나 이동 /2)
		 	<< : 왼쪽으로 비트 이동(비트 하나 이동 *2)
		 
		 삼항 연산자
		 	- 항이 3개인 연산자
		 	- 조건식의 결과에 따라 결과 반환
		 	- 조건? 항목1 (참) : 항목2 (거짓)
		 */
		
		int age = 17;
		
		System.out.println(age > 19? "성인입니다." : "청소년입니다.");
		
		
		int test;
		test = aa> bb? aa : bb;
		
	}
}

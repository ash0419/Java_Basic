package OOP1;

public class method {
	
	static void printArr(int[] numArr) {
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d\n",numArr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		/*
		 메서드
		 	- 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
		 	
		 	장점
		 		1. 높은 재사용성
		 			- 한 번 만들면 몇번이고 호풀 가능 및 다른 프로그램에서도 사용 가능
		 		2. 중복된 코드의 제거
		 			- 같은 내용의 반복되는 문장을 묶어서 하나의 메서드로 작성
		 		3. 프로그램의 구조화
		 			- 프로그램의 기능별로 단위를 나눌 수 있다.
			
			메서드의 선언과 구현
			반환타입 메서드이름(타입 변수명, 타입 변수명,... 매개변수) {
				//메서드 호출수 수행될 코드
				return 0;	//반환값	//구현부
			}
			
			메서드 이름
				- 변수의 명명규칙과 동일
				- 의미있는 이름
				
			반환타입
				- 메서드의 작업 수행 결과물을 반환하는 형태(ex : 정수형 int)
				- 반환값이 없는 경우 void
				
			매개변수
				- 메서드를 호출하면서 넘겨주는 인자
				- 메서드 내에서만 사용 가능(지역변수)
			
			반환값
				- 필요 없으면 생략 가능(컴파일러 자동 추가)
				- 메서드의 실행 결과를 호출한 메서드로 반환 시 사용
				- 반환타입과 일치 또는 자동형변환 가능한 것
				- 메서드 당 하나만 가능
			
			메서드의 호출
				- 메서드는 정의만으로는 사용 X
				- 호출 시에는 메서드에 정의된 매개변수의 수와 인자의 갯수가 일치 해야함
		 */
		
		int[] numArr = new int [10];
		
		for(int i = 0; i < 10; i++) {
			numArr[i] = (int)(Math.random()*10);
		}
		printArr(numArr);
		printArr(numArr);
		printArr(numArr);
		printArr(numArr);
		printArr(numArr);
		
		
		MyMath mm = new MyMath();
		int result = mm.add(5, 3);
		
		System.out.println("mm.add(5,3) : " +result);
		
		System.out.println("mm.sub(5,3) : "+mm.sub(5,3));
		System.out.println("mm.div(5,3) : "+mm.div(5.0,3.0));
	}
}




class MyMath {
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	//뺄셈, 곱셈, 나눗셈
	int sub(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	double div(double a, double b) {
		return a / b;
	}
}

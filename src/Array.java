import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		/*
		 배열
		 	- 같은 자료형의 나열
		 	- 많은 양의 값을 다룰 때 유용
		 	- 배열의 각 요소는 서로 연속적이다.
		 	
		 배열의 선언
		 	- 자료형이나 변수 이름 뒤에 대괄호[]를 붙여 선언
		 	
		 	자료형[] 변수이름;	// int[] score;
		 	자료형 변수이름[];	// int score[];
		 	
		 배열의 생성
			int[] score;	//배열 선언
			score = new int[5];	// 배열의 생성
			
			int[] score =  new int[5];
			
		배열의 초기화
			- 생성된 배열에 처음으로 값을 지정
			- 처음에 생성되고 나면 변경 불가
			
			int[] score = {100, 90, 80, 70, 50};
			int[] score = new int[]{100, 90, 80, 70, 60};
			
		배열의 길이와 인덱스
			인덱스
				- 배열의 공간마다 붙여진 번호
				- 인덱스의 번호는 0번부터 부여
				- 배열의 길이는 선언한 크기 -1
		 */
		
		int[] student = new int[3];
		
		System.out.println("현재 0번지 값 : " +student[0]);
		
		student[0] = 30;
		student[1] = 20;
		student[2] = 10;
		
		System.out.println(student);	//참조 변수 값
		System.out.println("현재 0번지 값 : " +student[0]);
		
		int[] stu = {30, 20, 10};
		
		for(int i = 0; i < stu.length; i++) {
			System.out.println("현재 "+i +"번지 값 : " +stu[i]);
		}
		
		/*
		 [출력결과]
		 양수 5개를 입력하세요.
		 1
		 39
		 78
		 100
		 99
		 가장 큰수는 100입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		int[] num = new int[5];
//		int max = 0;
//		System.out.println("양수 5개를 입력하세요.");
//		
//		for(int i = 0; i< num.length; i++) {
//			num[i] = sc.nextInt();
//			 if(max < num[i]) {
//				max = num[i];
//			 }
//		}
//		System.out.println("가장 큰 수는 " + max);
		
		//Array API
//		int test[] = new int[10];
//		for(int i = 0; i < 10; i++) {
//			test[i] = i +1;
//		}
//		System.out.println(Arrays.toString(test));
//		int test1[] = test;
//		
//		System.out.println(Arrays.toString(test1));
//		
//		
//		for(int i = 0; i < 10; i++) {
//			test1[i] = test[i];
//		}
//		test[5] = 20;
//		
//		System.out.println(Arrays.toString(test));
//		System.out.println(Arrays.toString(test1));
		//copyOF : 전달받은 배열의 특정 길이 만큼을 새로운 배열로 복사 반환
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int[] arr2 = Arrays.copyOf(arr1, 3);
		System.out.println("arr2 : " +Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr1, 10);	//더 큰 배열로 편하게 옮기는 방법
		System.out.println("arr3 : " +Arrays.toString(arr3));
		
		//copyOfRange : 전달 받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사 반환
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println("arr4 : " +Arrays.toString(arr4));
		
		//fill : 전달받은 배열의 모든 요소를 특정 값으로 초기화
		int[] arr5 = new int[10];
		
		Arrays.fill(arr5, 7);
		System.out.println("arr5 : " +Arrays.toString(arr5));
		
		//sort : 전달받은 배열의 모든 요소를 오름차순 정렬
		int arr6[] = {5, 3, 2, 1, 4};
		
		Arrays.sort(arr6);
		System.out.println("arr6 : " +Arrays.toString(arr6));
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length + num.length];
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(Arrays.toString(result));
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(Arrays.toString(result));
		/*
		 1. 다음 1차원 배열의 합과 평균을 구하세요
		 조건1) 배열 초기값
		 int arr[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		 */
		int arr_1[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		int sum = 0;
		for(int i = 0; i < arr_1.length; i++) {
			sum += arr_1[i];
		}
		System.out.println("합 : " +sum);
		System.out.println("평균 : " +(float)sum/arr_1.length);
		
		/*
		 2. 1 ~ 100까지의 수를 1차원 배열에 저장
		 조건1) 저장된 배열에서 5의 배수만 출력 하세요.
		 조건2) 배열의 위치가 90번째 일때 출력을 중지함.
		 */
		int arr_2[] = new int[100];
		for (int i = 0; i < arr_2.length; i++) {
			arr_2[i] = i +1;
			if(arr_2[i] % 5 == 0 && i <= 90) {
				System.out.println(arr_2[i]);
			}
		}
		System.out.println(Arrays.toString(arr_2));
		
		/*
		 로또번호 생성기
		 1~45 숫자 중에 6개 랜덤하게 생성
		 중복 X
		 */
		int[] ball = new int[45];
		int rnd;
		int tmp;
		
		for(int i = 0; i< ball.length; i++) {
			ball[i] = i + 1;
		}
		
		for(int i =0; i < 6; i++) {
			rnd = (int)(Math.random()*45);
			
			tmp = ball[i];
			ball[i] = ball[rnd];
			ball[rnd] = tmp;
		}
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d] = %d\n", i+1, ball[i]);
		}
		
		//모스부호
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." };

		String result2="";

		for (int i=0; i < source.length() ; i++ ) {
			result2+=morse[source.charAt(i)-'A'];
		}
		System.out.println("source:"+ source);
		System.out.println("morse:"+ result2);
		
		/*
		 2차원 배열
		 	- 행과 열로 이루어진 배열
		 	
		 	자료형[][] 배열이름;
		 	int[][] student;
		 	
		 생성
		 	int[][] student = new int[3][2];
		 초기화
		 	int[][] student = {100,200,300,1,2,3,4,5,6};
		 	
		 	int[][] student = {{100,200,300}, {1,2,3}, {4,5,6}};
		 	int[][] student = {{100,200,300}, 
		 					   {1,2,3}, 
		 					   {4,5,6}};
		 					   
		 */
		
		//단어 맞추기
		String[][] words = {{"chair", "의자"},
							{"computer", "컴퓨터"},
							{"integer", "정수"}};
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
			
			String temp = sc.nextLine();
			if(temp.equals(words[i][1])) {
				System.out.println("정답입니다. \n\n");
			}else {
				System.out.println("틀렸습니다. 정답은 " + words[i][1] +"입니다.");
			}
		}
		
		int[][] test_2 = new int[2][2];
		int count =1;
		
		for(int i = 0; i <test_2.length; i++) {
			for (int j = 0; j < test_2[i].length; j++) {
				test_2[i][j] = count++;
			}
		}
		for(int i = 0; i <test_2.length; i++) {
			for (int j = 0; j < test_2[i].length; j++) {
				System.out.print(test_2[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Ex_0921 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 5*7행렬에 1부터 35까지 차례대로 숫자를 집어넣는 프로그램 작성
		int[][] arr1 = new int[5][7];
		int num1 = 1;
		for(int i = 0; i < arr1.length; i ++) {
			for(int j = 0; j< arr1[i].length; j++) {
				arr1[i][j] = num1++;
				System.out.print(arr1[i][j] +"\t");
			}
			System.out.println();
		}
		/*
		//2. 10개의 정수를 1차원 배열에 입력 받고 최대값, 최소값, 합, 평균을 구하는 프로그램 작성
		int[] num2 = new int[10];
		int tmp2 = 0;
		int max2 = 0, min2 = 0, sum2 = 0;
		System.out.println("값을 입력하세요 : ");
		for(int i = 0; i < num2.length; i++) {
			tmp2 = sc.nextInt();
			num2[i] = tmp2;
			sum2 += num2[i];
			if(max2 < num2[i]) {
				max2 = num2[i];
			}
			if(min2 > num2[i]) {
				min2 = num2[i];
			}
		}
		
		System.out.println("최대값 : " +max2);
		System.out.println("최소값 : " +min2);
		System.out.println("합 : " +sum2);
		System.out.println("평균 : " +(double)sum2/3.0);
		*/
		//3. 길이가 10인 배열을 선언하고 숫자를 각 배열안에 입력 받은 후, 입력받은 숫자가 홀수면 배열의 앞부터, 짝수면 뒤부터 저장하는 프로그램 작성
		int[] num3 = new int[10];
		int tmp3 = 0;
		int front = 0;
		int rear = 9;
		
		System.out.println("총 10개의 숫자 입력: ");
		for(int i = 0; i < num3.length; i++) {
			System.out.print("? : ");
			tmp3 = sc.nextInt();
			if(tmp3 % 2 != 0) {
				num3[front++] = tmp3;
			}else {
				num3[rear--] = tmp3;
			}
		}
		System.out.print("배열 요소의 출력 : ");
		for (int i =0; i < num3.length; i ++) {
			System.out.print(num3[i] + "\t");
		}
		
		sc.close();
	}
}

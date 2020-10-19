package API;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
	public static void main(String[] args) {
		/*
		  ChoiceFormat 
		  - 범위의 형식화 
		  - 특정 범위에 속하는 값을 문자열로 변환 
		  - if문 switch문으로 처리하기 복잡한 경우 사용
		  - 패턴구분자 #은 경계값 포함 <은 포함하지 않음
		 */
		double[] limits = { 60, 70, 80, 90 };
		String[] grades = { "D", "C", "B", "A" };
		String pattern = "60#D|70#C|80<B|90#A";
		
		int[] scores = { 100, 95, 88, 70, 52, 60, 70 };
//		ChoiceFormat form = new ChoiceFormat(limits, grades);
		ChoiceFormat form = new ChoiceFormat(pattern);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
	}
}

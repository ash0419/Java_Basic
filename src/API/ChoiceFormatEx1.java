package API;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
	public static void main(String[] args) {
		/*
		  ChoiceFormat 
		  - ������ ����ȭ 
		  - Ư�� ������ ���ϴ� ���� ���ڿ��� ��ȯ 
		  - if�� switch������ ó���ϱ� ������ ��� ���
		  - ���ϱ����� #�� ��谪 ���� <�� �������� ����
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

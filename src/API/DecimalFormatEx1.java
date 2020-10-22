package API;

import java.text.DecimalFormat;

public class DecimalFormatEx1 {
	public static void main(String[] args) {
		/*
		 ����ȭ Ŭ����
		 DecimalFormat
		 	-���ڸ� �پ��� ����(����)���� ��� �����ϰ� ��
		 */
		
		double number = 1234567.89;
		
		String[] pattern = {
			"0",//10����(���� ���� ��  0)
			"#",//10����
			"0.0",
			"#.#",//�Ҽ���
			"00000000.0000",
			"########.####",
			"#.#-",
			"-#.#",
			"#,###.##",
			"#E0",
			"#,###.##+;#,###.##-",//;���ϱ�����(�� �� �� �ϳ�)
			"#.#%",
			"\u00A4 #,###"//��ȭ
		};
		
		for(int i = 0; i < pattern.length; i++)
		{
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s\n",pattern[i],df.format(number));
		}
	
	}
}








package API;
import java.util.Calendar;
import java.util.Scanner;

class CalendarPrint {

	// Calendar �ν��Ͻ� ����
	Calendar cal = Calendar.getInstance();
	
	// ���� ǥ�� ���
	String[] calHeader = {"��","��","ȭ","��","��","��","��"};
	// ��¥ ������ �迭
	String[][] calDate = new String[6][7];

	int width=calHeader.length; // �迭 ���� ����
	int startDay;   // �� ���� ����
	int lastDay;    // �� ������ ��¥
	int inputDate=1;  // �Է� ��¥

	// ������ : ������ ����
	public CalendarPrint(int year, int month) throws Exception{
		
		// �Է� month(��) �� 1~12 ������ ���̴�.
		if(month<1 || month>12){
			System.out.println("���� 1~12 ������ �����Դϴ�.");
			throw new Exception();
		}else{
			
			// Calendar�� ��,��,�� ����
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month-1);
			cal.set(Calendar.DATE, 1);
			
			startDay = cal.get(Calendar.DAY_OF_WEEK); // �� ���� ���� 
			lastDay = cal.getActualMaximum(Calendar.DATE); // �� ������ ��¥
			
			// 2�� �迭�� ��¥ �Է�
			int row = 0;
			for(int i=1; inputDate<=lastDay; i++){
				
				// ���� ������ ���������� ���� ����
				if(i<startDay) calDate[row][i-1]="";
				else{
					// ��¥ �迭�� �Է�
					calDate[row][(i-1)%width]=Integer.toString(inputDate);
					inputDate++;
					
					// ���� ������ ���� ���� �� �ٲ�
					if(i%width==0) row++;
				}		
			}
		}
	}

	// �޷� ���
	public void printCal(){
		
		// �޷� ��� ��� "�Ͽ�ȭ�������"
		for(int i=0; i<width; i++){
			System.out.print(calHeader[i]+"\t");
		}
		System.out.println();
		
		// ��¥ �迭 ���
		int row=0;
		for(int j=1 ; j<lastDay+startDay; j++){
			
			System.out.print(calDate[row][(j-1)%width]+"\t");
			
			if((j-1)%width==width-1){
				System.out.println();
				row++;
			}
			
		}
	}

	
}
public class CalendarTestEx {
	public static void main(String[] args) {
		int year;
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�⵵ �Է� : ");
		year = sc.nextInt();
		System.out.println("�� �Է� : ");
		month = sc.nextInt();
		
		CalendarPrint cal = null;
		try {
			cal = new CalendarPrint(year, month);
			cal.printCal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}







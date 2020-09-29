package OOP2;
/*
 ����������
 	- ��� �Ǵ� Ŭ������ ���
 	- �ܺηκ����� ���� ����
 	- Ŭ����, �������, �޼���, ������
 	
 	private	- ���� Ŭ���� �������� ���� ����
 	default	- ���� ��Ű�� �������� ���� ����
 	protected	- ���� ��Ű�� �������� ���� ����, �ٸ� ��Ű���� �ڽ� Ŭ���������� ���� ����
 	public	- ���� ���� X
 	
 	���� ������ ���(ĸ��ȭ)
 		- �ܺηκ����� ������ ��ȣ
 		- �ܺο��� ���ʿ�, ���������� ���Ǵ� �κ��� ���߱� ����
 		
 	�������� ����
	 	Ŭ���� - public, (default), final, abstract
	 	�޼��� - ��� ���� ������, final, abstract, static
	 	������� - ��� ���� ������, final, static
	 	�������� - final
 	
 	1. �޼���� static�� abstract�� ��� X
 		- static �޼���� �����ΰ� �ִ� �޼��忡�� ��� ����
 	2. Ŭ������ abstract�� final�� ���ÿ� ��� X
 		- Ŭ������ ���Ǵ� final�� Ŭ������ Ȯ��Ȱ �� ���ٴ� �ǹ�
 		abstract�� ����� ���ؼ��� �ϼ��Ǿ�� �Ѵٴ� �ǹ̷� ���� ���
 	3. abstract �޼���� ������� private�� �� ����.
 		- abstract �޼���� �ڽ� Ŭ�������� �������־�� �ϴµ� ���� �����ڰ� private�̸� �ڽ� Ŭ������ ���� �Ұ�
 	4. �޼��� private�� final�� ���� ��� X
 		- ���� �����ڰ� private�� �޼���� �������̵� X
 		�� �� �ϳ������ε� ���
 */
public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time();
//		time.hour = 10;
		
		time.setHour(10);
		System.out.println(time.getHour());
	}
	
}

class Time {	//�ڹٿ����� ������ private �����Ϸ��� public �޼ҵ带 ���ؼ� �����ϴ� setter/getter ����� ��ȣ
	private int hour;
	private int minute;
	private int second;
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setHour(int hour) {	// �ܺο��� ���� �ϴ� ���
		this.hour = hour;
	}
	
	public int getHour() {
		return this.hour;
	}
}
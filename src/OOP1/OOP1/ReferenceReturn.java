package OOP1;

class DataReturn {
	int x;
}


public class ReferenceReturn {
	public static void main(String[] args) {
		//������ ��ȯ Ÿ��
		//��ü�� �ּҰ� ��ȯ
		
		DataReturn d = new DataReturn();
		d.x = 10;
		
		DataReturn d2 = copy(d);
	}
	
	static DataReturn copy(DataReturn d) {
		DataReturn tmp = new DataReturn();
		tmp.x = d.x;
		
		return tmp;
	}
}

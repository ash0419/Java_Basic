package API;

public class WrapperEx1 {
	public static void main(String[] args) {
		/*
		 ���� Ŭ����(wrapper Class)
		 	- 8���� �⺻ �ڷ����� ��ü ǥ��
		 	
		 	boolean	-	Boolean
		 	char	-	Character
		 	byte	-	Byte
		 	short	-	Short
		 	int		-	Integer
		 	long	-	Long
		 	float	-	Float
		 	double	-	Double
		 */
		
		int i = 10;
		
		Integer ii = new Integer(100);
		Integer ii2 = new Integer(100);
		
		System.out.println(ii == ii2);
		System.out.println(ii.compareTo(ii2));
		System.out.println(ii.equals(ii2));
		System.out.println(ii);
	}
}
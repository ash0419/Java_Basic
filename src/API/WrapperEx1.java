package API;

public class WrapperEx1 {
	public static void main(String[] args) {
		/*
		 래퍼 클래스(wrapper Class)
		 	- 8개의 기본 자료형의 객체 표현
		 	
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
		Integer ii2 = new Integer(200);
		
		System.out.println(ii == ii2);
		System.out.println(ii.compareTo(ii2));
		System.out.println(ii);
	}
}


public class Gugudan {
	public static void main(String[] args) {
		// 2~ 9단 구구단
		int dan = 1;
		int gob = 1;
		
		for (int i = 9; i < 81; i++) {
			dan = i / 9 +1;
			gob = i % 9 + 1;
			
			System.out.printf("%d * %d = %d\n" ,dan,gob,(dan*gob));
		}
	}
}

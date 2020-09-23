package OOP1;

class Data {
	int x;
}
public class PrimitiveParam {
	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		System.out.println("Main() : x = " +d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("Main() : x = " +d.x);
		
		Data d1 = new Data();
		d1.x = 10;
		System.out.println("Main() : x = " +d1.x);
		
		change_ref(d1);
		System.out.println("After change(d1.x)");
		System.out.println("Main() : x = " +d1.x);
	}
	
	static void change(int x) {	//기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " +x);
	}
	
	static void change_ref(Data d) {	//참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " +d.x);
	}
}

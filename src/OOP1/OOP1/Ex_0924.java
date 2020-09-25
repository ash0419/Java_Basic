package OOP1;

import java.util.Scanner;

class Song{
	String title;
	String artist;
	int year;
	String country;
	
	Song(String t,String a,int y,String c){
		title = t;
		artist = a;
		year = y;
		country = c;
	}
	
	void show() {
		System.out.print(year + "�� ");
		System.out.print(country+"������ ");
		System.out.print(artist+"�� �θ� ");
		System.out.println(title);
	}
	
}

public class Ex_0924 {
	public static void main(String[] args) {
		Song s = new Song("Bohemian Rhapsody", "QUEEN", 1975, "����");
		s.show();
		
		System.out.println("Calc Start");
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		Calc calc = new Calc(a, b);
		
		System.out.println(a + " + "+ b+" = "+calc.add());
		System.out.println(a + " - "+ b+" = "+calc.sub());
		System.out.println(a + " * "+ b+" = "+calc.mul());
		System.out.println(a + " / "+ b+" = "+calc.div());
		
		
	} 
	
	
}

class Calc
{
	int num1,num2;
	
	public Calc(int n1,int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	int add() {
		return num1 + num2;
	}
	int sub() {
		return num1 - num2;
	}
	int mul() {
		return num1 * num2;
	}
	int div() {
		return num1 / num2;
	}
}

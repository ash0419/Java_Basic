package OOP1;

public class test {

    // ���޹��� ������ ���ڸ� �״�� ����ϴ� �Լ�
    static void A(int a) {
    	System.out.println("a = " +a);
    }
   
    // ���޹��� ������ ���ڿ� 10�� ���� �� �����ϴ� �Լ�
    static int B(int b) {
    	return b +10;
    }
    
    // ���޹��� �� ������ �� ���� ���� �����ϴ� �Լ�
    static int C(int a, int b, int c) {
    	return a + b + c;
    }
    
    // ���޹��� ���ڸ� ����ϴ� �Լ�(���� : ������ 2��, ������ 1��)
    static void D(int a, int b, char ch1) {
    	System.out.println("a = " +a +" b = " +b +" ch1 = " +ch1);
    }

    // �ҹ��ڸ� �빮�ڷ� �ٲپ� ����ϴ� �Լ�
    static void E(char ch1) {
    	System.out.println((char)(ch1 - 32));
    }
    
    // �빮�ڸ� �ҹ��ڸ� �ٲپ� �����ϴ� �Լ�
    static char F(char ch2) {
    	return (char)(ch2 + 32);
    }

    // ������ ���� 1��, ������ ���� 1���� �޾Ƽ� ������ ����ϰ� ���ڴ� �����ϴ� �Լ�
    static char G(int a, char ch1) {
    	System.out.println(a);
    	return ch1;
    }

    // ���ڿ��� �Է¹޾� ����ϴ� �Լ�
    static void H(String str) {
    	System.out.println(str);
    }

    // ����(����1, ����2, ����)�� �Է¹޾� ���� = ����2 - ����1 �� ����ϴ� �Լ�
    static void I(int a, int b, char ch) {
    	ch = (char)(b - a);
    	System.out.println(ch);
    }



    public static void main(String[] args) {
        int a, b, c;
        char ch1, ch2;
        String str = "KoreaIT";

        a = 90; b = 100; c = 120;
        ch1 = 'a'; ch2 = 'Z';


        A(a);
        System.out.printf("%d\n", B(b));
        System.out.printf("%d\n", C(a,b,c));
        D(a, b, ch1);
        E(ch1);
        System.out.printf("%c\n", F(ch2));
        System.out.printf("%c\n", G(a, ch1));
        H(str);
        I(a, b, ch1);




    }
}
package OOP2;

/*
 �������̽��� ������
 	- ����Ÿ���� �������̽���� ���� �޼��尡 �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ� �ǹ�
 */

interface Parseable {
	public abstract void parse(String fileName);
}
class HTMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName +" - HTML parsing completed.");
	}
}
class XMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName +" - XML parsing completed.");
	}
}

class ParserManger {
	//����Ÿ���� Parseable �������̽�
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser();
		}
	}
}
public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManger.getParser("XML");
		//Parseable parser = new XMLParser();
		
		parser.parse("document.xml");
		
		parser = ParserManger.getParser("HTML");
		
		parser.parse("document2.html");
	}
}


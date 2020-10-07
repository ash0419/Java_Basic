package OOP2;

/*
 인터페이스의 다형성
 	- 리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 의미
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
	//리턴타입이 Parseable 인터페이스
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


package OOP2;

class TV
{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize()
	{
		return size;
	}
}
class ColorTV extends TV{
	int nColors;
	public ColorTV(int size,int nColors) {
		super(size);
		this.nColors = nColors;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"인치"+nColors+"컬러");
	}
}

class IPTV extends ColorTV{
	String ipAddr;
	public IPTV(String ipAddr,int size, int nColors) {
		super(size, nColors);
		this.ipAddr = ipAddr;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ipAddr+"주소의 ");
		super.printProperty();
	}
	
	
}

public class Ex0928 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
		
	}
}










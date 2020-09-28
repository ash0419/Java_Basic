package OOP2;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	int nColors;

	public ColorTV(int size, int nColors) {
		super(size);
		this.nColors = nColors;
	}

	void printProperty() {
		System.out.println(getSize() + "인치" + this.nColors + "컬러");
	}
}

class IPTV extends ColorTV {
	String ip;

	public IPTV(String ip, int size, int nColors) {
		super(size, nColors);
		this.ip = ip;
	}

	@Override
	void printProperty() {
		System.out.println("나의 IPTV는" + ip + "주소의");
		// TODO Auto-generated method stub
		super.printProperty();
	}

}

public class Ex_0928 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}

package NetworkEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx1 {
	public static void main(String[] args) {
		InetAddress ip = null;

		try {
			ip = InetAddress.getLocalHost(); // ȣ��Ʈ�� IP �ּҸ� ��ȯ

			System.out.println("getHostName() : " + ip.getHostName()); // ȣ��Ʈ�� �̸�
			System.out.println("getHostAddress() : " + ip.getHostAddress()); // ȣ��Ʈ�� �ּ�
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ip = InetAddress.getByName("www.naver.com");

			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ip = InetAddress.getByName("www.daum.net");

			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �����θ� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ��� ��ȯ
	}
}

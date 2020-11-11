package NetworkEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx1 {
	public static void main(String[] args) {
		InetAddress ip = null;

		try {
			ip = InetAddress.getLocalHost(); // 호스트의 IP 주소를 반환

			System.out.println("getHostName() : " + ip.getHostName()); // 호스트의 이름
			System.out.println("getHostAddress() : " + ip.getHostAddress()); // 호스트의 주소
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
		// 도메인명에 지정된 모든 호스트의 IP 주소를 배열에 담아 반환
	}
}

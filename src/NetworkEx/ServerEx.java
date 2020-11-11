package NetworkEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;

		Socket socket = null;
		ServerSocket listener = null;

		Scanner sc = new Scanner(System.in);

		try {
			listener = new ServerSocket(9999); // ���� ����
			System.out.println("���� �����.........");
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("����Ǿ����ϴ�.");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				String inputMessage = in.readLine();
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ���� ����");
					break;
				}

				System.out.println("Ŭ���̾�Ʈ : " + inputMessage);
				System.out.print("������ >> ");
				String outputMessage = sc.nextLine(); // Ű���忡�� �� �� �б�
				out.write(outputMessage + "\n"); // Ű���忡�� ���� ���ڿ� ����
				out.flush(); // out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
			try {
				socket.close();
				listener.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻� �Ͽ����ϴ�.");
			}
		}
	}
}

package NetworkEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;

		Socket socket = null;

		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ���� ������ ����

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				System.out.print("������ >> ");
				String outputMessage = sc.nextLine();

				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n"); // "bye" ���� ����
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();

				String inputMessage = in.readLine();
				System.out.println("���� : " + inputMessage);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("������ ä�� �� ���� �߻�");
			}
		}
	}
}

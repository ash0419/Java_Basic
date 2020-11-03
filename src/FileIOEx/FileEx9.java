package FileIOEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx9 {
	public static void main(String[] args) {
		File src = new File("C:\\PT\\flag.png");
		File dest = new File("C:\\PT\\flag_copy.png");

		int c;

		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			/* 
			�Ϲݺ���
			while ((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			
			System.out.println(src.getPath() +"��" +dest.getPath() +"�� �����Ͽ����ϴ�.");
			*/
			
			// ��� ����
			byte[] buf = new byte[1024 * 10]; // 10kb ����
			
			while(true) {
				int n = fi.read(buf); // ������ ũ�⸸ŭ �б� n�� ���� ���� ����Ʈ
				fo.write(buf, 0, n); // buf[0]���� n����Ʈ ����
				
				if (n < buf.length) {
					break;
				}
			}
			fi.close();
			fo.close();
			
			System.out.println(src.getPath() +"��" +dest.getPath() +"�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

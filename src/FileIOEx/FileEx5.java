package FileIOEx;

import java.io.File;

public class FileEx5 {
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");

		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());

		String res = "";
		if (f1.isFile())
			res = "����";
		else if (f1.isDirectory())
			res = "���͸�";

		System.out.println(f1.getPath() + "�� " + res + "�Դϴ�.");

		File f2 = new File("C:\\PT\\test1");

		if (!f2.exists())
			f2.mkdir();// �������� ������ ���͸� ����

		listDirectory(new File("C:\\PT"));
		f2.renameTo(new File("C:\\PT\\javasample"));
		listDirectory(new File("C:\\PT"));

	}

	static void listDirectory(File dir) {
		System.out.println("--------" + dir.getPath() + "�� ���� ����Ʈ �Դϴ�.");
		File[] subFiles = dir.listFiles();

		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();// ������ ���� �ð�
			System.out.print(f.getName());
			System.out.print("\t���� ũ�� : " + f.length());
			System.out.printf("\t������ �ð� : %tb %td %ta %tT\n", t, t, t, t);
		}
	}
}

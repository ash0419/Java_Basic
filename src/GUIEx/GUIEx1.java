package GUIEx;

import java.awt.Frame;

class FrameTest extends Frame {
	
	public FrameTest() {
		super("�ι�° ������");
		setBounds(100,100,600,600);
		setVisible(true);
	}
}

public class GUIEx1 {
	public static void main(String[] args) {
		/*
		 ������
		 	- �������α׷��� �����츦 �����ϱ� ���� ���
		 	- �⺻������ Ÿ��Ʋ, �ּ� ��ư, �ִ� ��ư, ���� ��ư
		 */
		
		Frame f = new Frame();
		f.setTitle("ù��° ������");
		f.setBounds(100, 100, 300, 300);
		f.setLocation(800, 400);
		f.setVisible(true);
		
		FrameTest ttt = new FrameTest();
		new FrameTest();
	}
}

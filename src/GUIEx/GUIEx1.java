package GUIEx;

import java.awt.Frame;

class FrameTest extends Frame {
	
	public FrameTest() {
		super("두번째 프레임");
		setBounds(100,100,600,600);
		setVisible(true);
	}
}

public class GUIEx1 {
	public static void main(String[] args) {
		/*
		 프레임
		 	- 응용프로그램에 윈도우를 생성하기 위해 사용
		 	- 기본적으로 타이틀, 최소 버튼, 최대 버튼, 종료 버튼
		 */
		
		Frame f = new Frame();
		f.setTitle("첫번째 프레임");
		f.setBounds(100, 100, 300, 300);
		f.setLocation(800, 400);
		f.setVisible(true);
		
		FrameTest ttt = new FrameTest();
		new FrameTest();
	}
}

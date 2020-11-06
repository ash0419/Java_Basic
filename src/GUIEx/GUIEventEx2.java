package GUIEx;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIEventEx2 extends JFrame {

	JLabel la = new JLabel("Hello");

	public GUIEventEx2() {
		super("Mouse 이벤트 객체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.addMouseListener(new MyMouseListener());

		c.setLayout(null);

		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}

//	class MyMouseListener implements MouseListener {
	class MyMouseListener extends MouseAdapter { // Adapter 사용시 안 쓰는 메소드는 삭제 가능

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();

			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public static void main(String[] args) {
		new GUIEventEx2();
	}
}

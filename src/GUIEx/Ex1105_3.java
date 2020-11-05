package GUIEx;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Test3 extends JFrame {
	int random = (int) (Math.random() * 100 + 1);
	JLabel la = new JLabel("C");

	public Test3() {
		super("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);

		la.setLocation(100, 100);
		la.setSize(10, 10);
		c.add(la);

		setVisible(true);
		setSize(400, 400);
		c.setFocusable(true);
		c.requestFocus();
	}

	class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getComponent() != null) {
				la.setLocation(getX() + random, getY() + random);
			}
		}

	}
}

public class Ex1105_3 {
	public static void main(String[] args) {
		new Test3();
	}
}

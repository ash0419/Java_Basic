package GUIEx;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseClickFrame extends JFrame {

	public MouseClickFrame() {
		super("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(null);

		JLabel label = new JLabel("C");
		label.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel) e.getSource();
				Container c = la.getParent();

				int xBound = c.getWidth() - la.getWidth();
				int yBound = c.getHeight() - la.getHeight();

				int x = (int) (Math.random() * xBound);
				int y = (int) (Math.random() * yBound);

				la.setLocation(x, y);
			}
		});

		label.setLocation(100, 100);
		label.setSize(10, 10);
		c.add(label);

		setVisible(true);
		setSize(300, 300);
		c.setFocusable(true);
		c.requestFocus();
	}
}

public class Ex1105_3 {
	public static void main(String[] args) {
		new MouseClickFrame();
	}
}

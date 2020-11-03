package GUIEx;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class NullContainerEX extends JFrame {
	public NullContainerEX() {
		setTitle("Null Layout");

		Container c = getContentPane();

		c.setLayout(null);
		JLabel la = new JLabel("Hello Press Button");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);

		for (int i = 1; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
			c.add(b);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
}

public class GUIEx8 {
	public static void main(String[] args) {
		new NullContainerEX();
	}
}

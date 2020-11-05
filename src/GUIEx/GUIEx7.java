package GUIEx;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		super("GridLayout Test");

		Container c = getContentPane();

		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);

		c.setLayout(grid);
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 200);
	}
}

public class GUIEx7 {
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
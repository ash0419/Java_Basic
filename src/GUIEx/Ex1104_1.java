package GUIEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Plate4x4Frame extends JFrame {
	public Plate4x4Frame() {
		setTitle("4x4 Color Frame");

		Container c = getContentPane();

		GridLayout grid = new GridLayout(4, 4);
		c.setLayout(grid);
		Color[] colors = { Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, Color.green,
				Color.magenta, Color.gray, Color.black };
		/*
		JLabel[] label = new JLabel[16];
		Color[] colors = { Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, Color.green,
				Color.magenta, Color.gray, Color.black };
		for(int i = 0; i< label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			c.add(label[i]);
			}
		 */
		for (int i = 0; i < 16; i++) {
			JLabel j = new JLabel(Integer.toString(i));
			j.setOpaque(true);
			j.setBackground(colors[(int) (Math.random() * 9)]);
			c.add(j);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
	}
}

public class Ex1104_1 {
	public static void main(String[] args) {
		new Plate4x4Frame();
	}
}

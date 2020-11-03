package GUIEx;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		super("FlowLayout Test");

		Container c = getContentPane();
		/*
		//FlowLayout
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

		c.add(new JButton("ADD"));
		c.add(new JButton("SUB"));
		c.add(new JButton("MUL"));
		c.add(new JButton("DIV"));
		c.add(new JButton("CALC"));
		*/
		//BorderLayout
		c.setLayout(new BorderLayout(10, 10));
		c.add(new JButton("ADD"), BorderLayout.CENTER);
		c.add(new JButton("SUB"), BorderLayout.NORTH);
		c.add(new JButton("MUL"), BorderLayout.SOUTH);
		c.add(new JButton("DIV"), BorderLayout.EAST);
		c.add(new JButton("CALC"), BorderLayout.WEST);
	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 200, 200);
		setVisible(true);
	}
}

public class GUIEx6 {
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}

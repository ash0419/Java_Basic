package GUIEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		super("ContentPaneTest");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();

		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("OK");
		contentPane.add(btn1);
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setBounds(300, 150, 200, 200);
		setVisible(true);
	}
}

public class GUIEx5 {
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}

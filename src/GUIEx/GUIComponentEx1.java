package GUIEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIComponentEx1 extends JFrame {
	public GUIComponentEx1() {
		super("공통메소드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disable Button");
		JButton b3 = new JButton("getX(), getY()");

		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));

		b2.setEnabled(false); // 버튼 비활성화

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				GUIComponentEx1 frame = (GUIComponentEx1) b.getTopLevelAncestor();

				frame.setTitle(b.getX() + ", " + b.getY());
			}
		});

		c.add(b1);
		c.add(b2);
		c.add(b3);

		setSize(260, 200);
		setLocation(800, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUIComponentEx1();
	}
}

package GUIEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CalculatorFrame extends JFrame {
	public CalculatorFrame() {
		super("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane(); // 기본적으로 BorderLayout

		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);

		setVisible(true);
		setSize(300, 300);
	}
}

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		setLayout(new FlowLayout());

		add(new JLabel("수식입력"));
		add(new JTextField(15));
	}
}

class SouthPanel extends JPanel {
	public SouthPanel() {
		setBackground(Color.yellow);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(new JLabel("계산결과"));
		add(new JTextField(15));
	}
}

class CenterPanel extends JPanel {
	JButton[] b = { new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/") };

	public CenterPanel() {
		setBackground(Color.white);
		setLayout(new GridLayout(4, 4, 5, 5));

		for (int i = 0; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			add(b);
		}

		add(new JButton("CE"));
		add(new JButton("계산"));

		for (int i = 0; i < b.length; i++) {
			b[i].setBackground(Color.CYAN);
			add(b[i]);
		}
	}
}

public class Ex1104_2 {
	public static void main(String[] args) {
		new CalculatorFrame();
	}
}

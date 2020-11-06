package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class GUIComponentEx2 extends JFrame {

	public GUIComponentEx2() {
		super("Label ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("����մϴ�.");
		ImageIcon beauty = new ImageIcon("c:\\PT\\pengsu.jpg");
		JLabel imageLabel = new JLabel(beauty);
//		JLabel test = new JLabel(new ImageIcon("c:\\PT\\pengsu.jpg"));
		JLabel test = new JLabel("��ȭ�ϼ���", new ImageIcon("c:\\PT\\pengsu.jpg"), SwingConstants.CENTER);

		ImageIcon normalIcon = new ImageIcon("c:\\PT\\pengsu.jpg");
		ImageIcon rolloverIcon = new ImageIcon("c:\\PT\\pengha.jpg");
		ImageIcon pressedIcon = new ImageIcon("c:\\PT\\pengsu1.jpg");

		JButton btn = new JButton("���", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);

		btn.setVerticalAlignment(SwingConstants.CENTER);
		btn.setHorizontalAlignment(SwingConstants.CENTER);

		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true); // üũ�Ǿ� �ִ� ����
		JCheckBox cherry = new JCheckBox("ü��", normalIcon);

		apple.setBorderPainted(true);

		c.add(textLabel);
		c.add(imageLabel);
		c.add(test);
		c.add(apple);
		c.add(pear);
		c.add(cherry);

		c.add(btn);
		setSize(400, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new GUIComponentEx2();
	}
}
package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIComponentEx5 extends JFrame {
	public GUIComponentEx5() {
		super("�ؽ�Ʈ �ʵ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("�̸� "));
		c.add(new JTextField(20));
		c.add(new JLabel("�а� "));
		c.add(new JTextField("��ǻ�� ���а�", 20));
		c.add(new JLabel("�ּ� "));
		c.add(new JTextField("�����", 20));

		JTextField tt = new JTextField(20);

		tt.setEditable(false);
		tt.setText("Test");
		tt.setFont(new Font("���ü", Font.ITALIC, 20));
		c.add(tt);

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUIComponentEx5();
	}
}

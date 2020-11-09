package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex1109_1 extends JFrame {
	JButton btn = new JButton("test button");
	JCheckBox c1 = new JCheckBox("버튼 비활성화");
	JCheckBox c2 = new JCheckBox("버튼 감추기");

	public Ex1109_1() {
		super("CheckBox Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});
		c2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btn.setVisible(false);
				} else {
					btn.setVisible(true);
				}
			}
		});

		c.add(c1);
		c.add(c2);
		c.add(btn);

		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1109_1();
	}
}

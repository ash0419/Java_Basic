package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class LeftKeyFrame extends JFrame {
	public LeftKeyFrame() {
		super("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Love Java");
		c.add(label);

		label.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					/* 1번 문제
					JLabel la = (JLabel) e.getSource();
					StringBuffer text = new StringBuffer(la.getText());
					la.setText(text.reverse().toString());
					*/
					
					// 2번
					JLabel la = (JLabel) e.getSource();
					String text = la.getText();
					String front = text.substring(0, 1);
					String last = text.substring(1);
					la.setText(last.concat(front));
				}
			}
		});

		setVisible(true);
		setSize(300, 200);
		label.setFocusable(true);
		label.requestFocus();
	}
}

public class Ex1105_1_2 {
	public static void main(String[] args) {
		new LeftKeyFrame();
	}
}

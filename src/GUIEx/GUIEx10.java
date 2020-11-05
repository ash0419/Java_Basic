package GUIEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class KeyCodeEx1 extends JFrame {
	JLabel la = new JLabel();
	Container c = getContentPane();

	public KeyCodeEx1() {
		super("KeyCode ���� : F1Ű: �ʷϻ�, %Ű : �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.addKeyListener(new MyKeyListener());
		c.add(la);

		setVisible(true);
		setSize(300, 150);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode())+ "Ű�� �Է� �Ǿ���");

			if (e.getKeyChar() == '%') {
				c.setBackground(Color.yellow);
			}else if (e.getKeyCode() == KeyEvent.VK_F1) {
				c.setBackground(Color.green);
			}
		}
	}
}

public class GUIEx10 {
	public static void main(String[] args) {
		new KeyCodeEx1();
	}
}

package GUIEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Button1 extends Frame {
	Button btn1, btn2, btn3;

	public Button1() {
		super("��ư ����");

		Panel p = new Panel();

		btn1 = new Button(" ���� ");
		btn2 = new Button(" ���� ");
		btn3 = new Button(" �� ");

		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		add(p);

		btn3.setEnabled(false);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		setBounds(200, 200, 300, 300);
		setVisible(true);
	}
}

public class GUIEx3 {
	public static void main(String[] args) {
		new Button1();
	}
}

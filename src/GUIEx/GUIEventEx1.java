package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEventEx1 extends JFrame {
	public GUIEventEx1() {
		super("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action");
		c.add(btn);

//		btn.addActionListener(new MyActionListener()); // �ܺ� Ŭ����
//		btn.addActionListener(new InnerActionListener()); // ���� Ŭ����
		// �͸� Ŭ����
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();

				if (b.getText().equals("Action")) {
					b.setText("�׼�");
				} else {
					b.setText("Action");
				}
				GUIEventEx1.this.setTitle(b.getText());
				
			}
		});
		setSize(350, 150);
		setVisible(true);
	}
/* ����Ŭ����
	class InnerActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();

			if (b.getText().equals("Action")) {
				b.setText("�׼�");
			} else {
				b.setText("Action");
			}
			GUIEventEx1.this.setTitle(b.getText());
		}
	}
*/
	public static void main(String[] args) {
		// ���� Ŭ����
		new GUIEventEx1();
	}
}
/* �ܺ�Ŭ����
class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();

		if (b.getText().equals("Action")) {
			b.setText("�׼�");
		} else {
			b.setText("Action");
		}
	}
}
*/
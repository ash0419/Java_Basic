package GUIEx;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

/*
	�г�
		- ������Ʈ���� �׷캰�� ��� ó���� �� �ַ� ���
		- �Ϲ������� Frame ������Ʈ���� ���� ������ �ʰ� �гο� �׷캰�� ���̰� Panel�� Frame�� �ٽ� ����
 */
class PanelTest extends Frame {
	public PanelTest() {
		super("Panel Test");

		Panel panel = new Panel();
		Dialog d = new Dialog(this, "������� ���̾�α�");

		d.setSize(200, 200);
		d.setVisible(true);

		panel.setBackground(Color.RED);
		add(panel);
		setSize(300, 300);
		setVisible(true);
	}
}

public class GUIEx2 {
	public static void main(String[] args) {
		new PanelTest();
	}
}

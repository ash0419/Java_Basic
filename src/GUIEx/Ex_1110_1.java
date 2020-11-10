package GUIEx;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex_1110_1 extends JFrame {
	
	public Ex_1110_1() {
		super("�׷����̹���Ȯ����ҿ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
		
		getContentPane().setFocusable(true);
		getContentPane().requestFocus();
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("c:\\PT\\images\\apple.jpg");	
		Image img = icon.getImage();
		private int width, height;
		
		public MyPanel() {
			// �̹����ǿ���ũ����
			width = img.getWidth(this);
			height = img.getHeight(this);
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						// �׷����̹���ũ��Ȯ��
						width = (int)(width*1.1);
						height = (int)(height*1.1);	
						repaint(); // �ٽñ׸�������
					}
					else if(e.getKeyChar() == '-') {
						// �׷����̹���ũ�����		
						width = (int)(width*0.9);
						height = (int)(height*0.9);
						repaint(); // �ٽñ׸�������		
					}
				}
			});
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}		
	}	


	public static void main(String[] args) {
		new Ex_1110_1();
	}
}















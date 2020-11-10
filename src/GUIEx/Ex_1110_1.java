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
		super("그래픽이미지확대축소연습");
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
			// 이미지의원본크기기억
			width = img.getWidth(this);
			height = img.getHeight(this);
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						// 그려질이미지크기확대
						width = (int)(width*1.1);
						height = (int)(height*1.1);	
						repaint(); // 다시그리기지시
					}
					else if(e.getKeyChar() == '-') {
						// 그려질이미지크기축소		
						width = (int)(width*0.9);
						height = (int)(height*0.9);
						repaint(); // 다시그리기지시		
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















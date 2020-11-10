package GUIEx;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiGraphicsEx1 extends JFrame{
	
	MyPanel panel = new MyPanel();
	
	public GuiGraphicsEx1() {
		super("원본크기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(300,420);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("c:\\PT\\image0.jpg");
		Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
//			g.drawImage(img,20,20,this);//원본크기
//			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);//꽉차게~
//			g.drawImage(img, 20, 20, 250, 100, 100, 100, 50, 200, this);
			//클리핑 영역
			g.setClip(100,20,150,150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial",Font.ITALIC,40));
			g.drawString("Go Gater", 10, 150);
			
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new GuiGraphicsEx1();
	}
}















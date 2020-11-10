package GUIEx;

import java.awt.Container;
import java.awt.Font;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ex_1110_2 extends JFrame {
	
	public Ex_1110_2() {
		super("µðÁöÅÐ½Ã°è");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new MyLabel());
		
		setSize(300,200);
		setVisible(true);
	}
	
	class MyLabel extends JLabel implements Runnable{

		Thread timerThread = null;
		
		public MyLabel() {
			setText(makeClockText());
			setFont(new Font("TimesRoman",Font.ITALIC,50));
			setHorizontalAlignment(SwingConstants.CENTER);
			timerThread = new Thread(MyLabel.this);
			timerThread.start();
		}
		
		String makeClockText() {
			Calendar c = Calendar.getInstance();
			
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			
			String clockText = Integer.toString(hour);
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(min));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(second));
			
			return clockText;
			
		}
		
		@Override
		public void run() {
			while(true)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					setText(makeClockText());
				}
			}
		}

		
		
	}
	
	public static void main(String[] args) {
		new Ex_1110_2();
	}
}














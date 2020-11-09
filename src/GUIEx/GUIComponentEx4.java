package GUIEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class GUIComponentEx4 extends JFrame {
	JRadioButton[] radio = new JRadioButton[3];
	String[] text = { "사과", "배", "체리" };
	ImageIcon[] image = { new ImageIcon("C:\\pt\\images\\apple.jpg"), new ImageIcon("C:\\pt\\images\\pear.jpg"),
			new ImageIcon("C:\\pt\\images\\cherry.jpg") };
	JLabel imageLabel = new JLabel();

	public GUIComponentEx4() {
		super("라디오버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		/*
		 c.setLayout(new FlowLayout());
		 
		 ImageIcon cherryIcon = new ImageIcon("C:\\pt\\images\\cherry.jpg"); 
		 ImageIcon selectedCherryIcon = new ImageIcon("C:\\pt\\images\\selectedCherry.jpg");
		 
		 ButtonGroup g = new ButtonGroup(); 
		 JRadioButton apple = new JRadioButton("사과"); 
		 JRadioButton pear = new JRadioButton("배", true);
		 JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		 cherry.setBorderPainted(true); cherry.setSelectedIcon(selectedCherryIcon);
		 
		 g.add(apple); 
		 g.add(pear); 
		 g.add(cherry);
		 
		 c.add(apple); 
		 c.add(pear); 
		 c.add(cherry);
		 */
		c.setLayout(new BorderLayout());
		JPanel radioPanel = new JPanel();

		ButtonGroup g = new ButtonGroup();
		radioPanel.setBackground(Color.GRAY);

		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true);
		
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(250, 150);
		setVisible(true);
	}

	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if (radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);
			} else if (radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			} else {
				imageLabel.setIcon(image[2]);
			}
		}
	}

	public static void main(String[] args) {
		new GUIComponentEx4();
	}
}

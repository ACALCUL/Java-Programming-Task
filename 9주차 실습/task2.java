import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class task2 extends JFrame{
	public task2() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new GridLayout(3, 4));
		
		
		
		for(int i=0; i<12; i++) {
			String text=Integer.toString(i);
			JLabel la = new JLabel(text);
			la.setOpaque(true); 
			la.setBackground(Color.white);
			c.add(la);
			la.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					int r=(int)(Math.random()*256);
					int g=(int)(Math.random()*256);
					int b=(int)(Math.random()*256);
					JLabel label2=(JLabel)e.getSource();
					label2.setBackground(new Color(r,g,b));
				}
			});
		}
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new task2();
	}
}
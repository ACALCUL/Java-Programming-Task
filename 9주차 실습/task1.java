import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task1 extends JFrame {
	public task1() {
		setTitle("Exemple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1=new JButton("Button1");
		JButton btn2=new JButton("Button2");
		btn1.addActionListener(new MyTest());
		btn2.addActionListener(new MyTest());
		c.add(btn1);
		c.add(btn2);
		
		setSize(300, 300);
		//setSize만 열, 행임 
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new task1();
	}
	class MyTest implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "You Pressed: "+e.getActionCommand());
			
		}
	}
}


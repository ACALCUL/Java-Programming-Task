import javax.swing.*;
import java.awt.*;

public class PanelEx extends JFrame{
	public PanelEx() {
		setTitle("Panel예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		JPanel p=new JPanel();
		JButton l0 = new JButton("Test");
		JButton l1 = new JButton("Test1");
		JButton l2 = new JButton("Test2");
		p.setLayout(new GridLayout(2,1,5,5));
		p.add(l1);
		p.add(l2);
		
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(1,2, 5, 5));
		p2.add(l0);
		p2.add(p);
		contentPane.add(p2, BorderLayout.SOUTH);
		
		/*JLabel la=new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		contentPane.add(la);
		*/
		setSize(600, 300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new PanelEx();
	}
}


import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("NullContainer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(null);
		
		JLabel la=new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		contentPane.add(la);
	
		for(int i=1; i<=9; i++) {
			JButton b=new JButton(Integer.toString(i));
			b.setBounds(i*15, i*15, 10*i, 4*i);
			contentPane.add(b);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new NullContainerEx();
	}
}

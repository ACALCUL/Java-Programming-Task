import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("add"));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String [] args) {
		FlowLayoutEx d= new FlowLayoutEx();
	}
}

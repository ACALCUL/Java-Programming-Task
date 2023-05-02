import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new GridLayout(20, 30));
		
		for(int i=0; i<600; i++) {
			String text=Integer.toString(i);
			JButton button = new JButton(text);
			contentPane.add(button);
		}
	
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new GridLayoutEx();
	}
}
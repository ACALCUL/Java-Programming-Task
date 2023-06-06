import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new BorderLayout(30, 20));
		//첫번째 인자: 수평간격, 두번째 인자: 수직간격
		
		contentPane.add(new JButton("Dir"), BorderLayout.WEST);
		contentPane.add(new JButton("Menu"), BorderLayout.NORTH);
		contentPane.add(new JButton("Console"), BorderLayout.SOUTH);
		contentPane.add(new JButton("Editor"), BorderLayout.CENTER);
	
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String [] args) {
		BorderLayoutEx d= new BorderLayoutEx();
	}
}


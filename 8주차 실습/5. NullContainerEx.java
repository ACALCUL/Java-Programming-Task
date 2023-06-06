import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("NullContainer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(null);
		//배치관리자가 없는 컨테이너
		//임의로, 겹쳐서 사용하거나 변하는 경우 사용
		
		JLabel la=new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		//la.setBounds(int x, int y, int width, int height);
		contentPane.add(la);
	
		for(int i=1; i<=9; i++) {
			JButton b=new JButton(Integer.toString(i));
			b.setBounds(i*15, i*15, 50, 20);
			contentPane.add(b);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new NullContainerEx();
	}
}

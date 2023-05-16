import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise_1 extends JFrame {
	JLabel colorlabel = new JLabel();
	
	public Exercise_1() {
		colorlabel.setOpaque(true);
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		
		JButton btn1 = new JButton("노랑");
		btn1.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				colorlabel.setBackground(Color.YELLOW);
				
			}
		});
		JButton btn2 = new JButton("빨강");
		btn2.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				colorlabel.setBackground(Color.RED);
			
			}
		});
		
		panel.add(btn1);
		panel.add(btn2);
		
		c.add(colorlabel, BorderLayout.CENTER);
		c.add(panel, BorderLayout.SOUTH);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_1();
	}
}
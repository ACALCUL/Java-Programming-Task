import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action 이벤트 리스더 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		c.add(btn);
		btn.addActionListener(new MyActionListener());
		
		setSize(300, 300);
		//setSize만 열, 행임 
		setVisible(true);
	}
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("Action")) 
				b.setText("액션");
			else 
				b.setText("Action");
			InnerClassListener.this.setTitle(b.getText());
			//내부클래스 사용시 이런 식으로 setTitle 조정 가능
		}
	}
	
	public static void main(String [] args) {
		new InnerClassListener();
	}
}

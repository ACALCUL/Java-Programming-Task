import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		Container c = getContentPane();
		//c.setBackground(Color.ORANGE);
		c.setLayout(new FlowLayout());
			
		JLabel textLabel = new JLabel("제임스 고슬링 입니더!");
		
		//이미지가 들어간 레이블 만들기
		ImageIcon img = new ImageIcon("images/gosling.jpg");
		JLabel imgLabel = new JLabel(img);
		
		//이미지와 텍스트가 함께 있는 레이블 만들기
		ImageIcon icon = new ImageIcon("images/icon.gif");
		JLabel label= new JLabel("커피한잔 하실래예, 전화주이소", icon, SwingConstants.CENTER);
		//텍스트가 중앙에 오도록 설정(RIGHT, LEFT, CENTER 중 하나)
		
		c.add(textLabel);
		c.add(imgLabel);
		c.add(label);
			
		setSize(300, 150);
		setVisible(true);
			
	}
	public static void main (String[] args) {
		new LabelEx();
	}
}

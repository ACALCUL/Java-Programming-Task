import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		Container c = getContentPane();
		//c.setBackground(Color.ORANGE);
		c.setLayout(new FlowLayout());
		
		/* 레이블 생성법
		 * JLabel(): 빈 레이블
		 * JLabel(ImageIcon img): 이미지 레이블
		 * JLabel(String text): 문자열 레이블
		 * JLabel(String text, ImageIcon img): 문자열과 이미지 모두 가진 레이블 
		 * 위의 코드에서 세번째 인자로 SwingConstants.LEFT등을 넣어 텍스트 위치 설정 가능
		 * JButton도 똑같이 사용 가능
		*/
		
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

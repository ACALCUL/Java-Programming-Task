import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new GridLayout(1, 10));
		//첫번째 인자: 행의 개수, 두번째 인자: 열의 개수
		//세번째 인자: 수평 간격, 네번째 인자: 수직 간격
		//세번째와 네번째 인자는 생략 가능
		
		for(int i=0; i<10; i++) {
			String text=Integer.toString(i);
			JButton button = new JButton(text);
			contentPane.add(button);
			//오른쪽으로, 아래로 순서대로 배치됨
		}
	
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new GridLayoutEx();
	}
}

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		setTitle("TextField 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		/*JTextField(): 빈 텍스트 빌드
		*JTextField(int col): 입력창의 열의 개수가 col인 텍스트 필드
		*JTextField(String text): text 문자열로 초기화된 텍스트 필드
		*JTextField(String text, int col): text 문자열로 초기화하고 입력창 열의 개수가 col인 텍스트 필드
		*JTextArea는 나머지는 TextField와 같지만 rows가 col 앞에 주어져야 함
		*/
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과",20));
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시 ...", 20));
		
		
		setSize(300, 150);
		setVisible(true);
		
	}
	public static void main (String[] args) {
		new TextFieldEx();
	}
}

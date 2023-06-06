import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		/*FlowLayout의 인자 설명
		 *.붙이고 첫번째: align[나란히, 조절하다]: 정렬 방법
		 *두번째: 수평 간격, 세번째: 수직 간격
		 *두번째와 세번째의 단위는 픽셀이며, 기본은 5픽셀
		 */
		
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

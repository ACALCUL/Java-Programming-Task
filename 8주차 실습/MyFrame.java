import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300 x 300 스윙 프레임 만들기");
		
		setSize(300, 300);
		//setSize만 열, 행임 
		setVisible(true);
	}
	
	public static void main(String [] args) {
		MyFrame mf= new MyFrame();
	}
}

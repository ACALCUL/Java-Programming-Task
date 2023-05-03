import javax.swing.*;
import java.awt.*;

public class Report_Chapter08 extends JFrame{
	public Report_Chapter08() {
		setTitle("MyPhone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		//lcdPanel 만들기
		JPanel lcdPanel=new JPanel();
		
		JTextArea lcdTextArea;
		String lcdOutput="";
		lcdTextArea= new JTextArea(lcdOutput, 5, 10);
		lcdPanel.setLayout(new GridLayout(1,1));
		lcdPanel.add(lcdTextArea);
		
		//keyPanel 만들기
		JPanel keyPanel = new JPanel();
		keyPanel.setLayout(new GridLayout(5, 3, 0, 0));
		JButton keyButton[] = new JButton[15];
		
		keyButton[0]= new JButton("Send");
		keyPanel.add(keyButton[0]);
		keyButton[1]= new JButton("Cir");
		keyPanel.add(keyButton[1]);
		keyButton[2]= new JButton("End");
		keyPanel.add(keyButton[2]);
		for(int i=3; i<15; i++) {
			keyButton[i]= new JButton(Integer.toString(i));
			keyPanel.add(keyButton[i]);
		}
		
		//두 Panel 합치기
		contentPane.add(lcdPanel, BorderLayout.NORTH);
		contentPane.add(keyPanel, BorderLayout.CENTER);
		
		setSize(300, 500);
		//setSize만 열, 행임
		setVisible(true);
	}
	public static void main(String [] args) {
		new Report_Chapter08();
	}
}
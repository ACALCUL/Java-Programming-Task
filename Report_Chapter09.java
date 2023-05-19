import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Report_Chapter09 extends JFrame{
	public Report_Chapter09() {
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
		keyButton[0].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				lcdTextArea.append("전화 거는중...");
			}
		});
		keyButton[1]= new JButton("Cir");
		keyPanel.add(keyButton[1]);
		keyButton[1].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				String text=lcdTextArea.getText();
				text=text.substring(0, text.length()-1);
				lcdTextArea.setText(text);
			}
		});
		
		keyButton[2]= new JButton("End");
		keyPanel.add(keyButton[2]);
		keyButton[2].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				lcdTextArea.setText("");
			}
		});
		
		for(int i=1; i<=12; i++) {
			if(i<10) {
			keyButton[i+2]= new JButton(Integer.toString(i));
			keyPanel.add(keyButton[i+2]);
			}
			else if(i==10) {
				keyButton[i+2]= new JButton("*");
				keyPanel.add(keyButton[i+2]);
			}
			else if(i==11) {
				keyButton[i+2]= new JButton("0");
				keyPanel.add(keyButton[i+2]);
			}
			else {
				keyButton[i+2]= new JButton("#");
				keyPanel.add(keyButton[i+2]);
			}
			keyButton[i+2].addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					JButton butt=(JButton)e.getSource();
					String buttonText=butt.getText();
					lcdTextArea.append(buttonText);
				}
			});
		}
		
		//두 Panel 합치기
		contentPane.add(lcdPanel, BorderLayout.NORTH);
		contentPane.add(keyPanel, BorderLayout.CENTER);
		
		setSize(300, 500);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Report_Chapter09();
	}
}

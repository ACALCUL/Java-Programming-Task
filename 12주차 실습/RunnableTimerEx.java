import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;// Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; 
	}
	
	@Override
	public void run() {
		int n=0; // Ÿ�̸� ī��Ʈ ��
		while(true) { 
			timerLabel.setText(Integer.toString(n)); // ���̺� ī��Ʈ �� ���
			n++; 
			try {
				Thread.sleep(1000); // 1�ʵ��� ���� �ܴ�.
			}
			catch(InterruptedException e) {
				return; 
			}
		}
	}
}

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); 
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(250,150);
		setVisible(true);
		
		th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
	}
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
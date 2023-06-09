import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;// 타이머 값이 출력되는 레이블
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; 
	}
	
	@Override
	public void run() {
		int n=0; // 타이머 카운트 값
		while(true) { 
			timerLabel.setText(Integer.toString(n)); // 레이블에 카운트 값 출력
			n++; 
			try {
				Thread.sleep(1000); // 1초동안 잠을 잔다.
			}
			catch(InterruptedException e) {
				return; 
			}
		}
	}
}

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
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
		
		th.start(); // 타이머 스레드의 실행을 시작하게 한다.
	}
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
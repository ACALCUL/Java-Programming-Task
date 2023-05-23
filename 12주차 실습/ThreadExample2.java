import java.awt.Toolkit;

public class ThreadExample2 {
	//멀티쓰레드를 사용
	public static void main(String[] agrs) {
		//비프음을 5번 반복해서 소리나게 하는 작업
		Thread th = new BeepTask();
		th.start();
		//"띵" 문자열을 5번 반복해서 출력하는 작업
		for(int i=0; i<5; i++) {
			System.out.println("띵 "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class BeepTask extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println("소리~~");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

import java.awt.Toolkit;

public class ThreadExample2 {
	//��Ƽ�����带 ���
	public static void main(String[] agrs) {
		//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Thread th = new BeepTask();
		th.start();
		//"��" ���ڿ��� 5�� �ݺ��ؼ� ����ϴ� �۾�
		for(int i=0; i<5; i++) {
			System.out.println("�� "+i);
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
			System.out.println("�Ҹ�~~");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

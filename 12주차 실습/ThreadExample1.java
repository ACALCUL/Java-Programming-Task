import java.awt.Toolkit;

public class ThreadExample1 {
	//��Ƽ�����带 ����ϰ� ���� ����
	public static void main(String[] agrs) {
		//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println("�Ҹ�~");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//"��" ���ڿ��� 5�� �ݺ��ؼ� ����ϴ� �۾�
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

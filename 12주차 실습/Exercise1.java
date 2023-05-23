//sing thread
/*public class Exercise1 {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			for(char ch='A'; ch<='z'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for(int i=1; i<1000; i++) {
			System.out.print(i);
			if(i%10==0) System.out.println();
			else System.out.print("\t");
		}
	}
}*/

//multi thread
public class Exercise1 extends Thread{
	//First
	public void run() {
		for(int i=0; i<10; i++) {
			for(char ch='A'; ch<='z'; ch++) {
				System.out.print(ch);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Thread th= new Exercise1();
		//Exercise1 Threadµµ °¡´É
		th.start();
		
		//Second
		for(int i=1; i<1000; i++) {
			System.out.print(i);
			if(i%10==0) System.out.println();
			else System.out.print("\t");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

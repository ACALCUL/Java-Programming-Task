//Calculator, User1, User2 사용하여 main에서 합침

class Calculator{
	private int memory;

	public int getMemory() {
		return memory;
	}

	synchronized public void setMemory(int memory) {
		//synchronized를 붙여야 memory 값이 중복 안됨
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e){}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}
	
}

class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}

class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
	

}

public class Exercise2 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
import java.util.Scanner;

class Account{
	private double balance;
	public Account(double init_Bal) {
		if (init_Bal>0.0)
			balance=init_Bal;
	}
	public void credit(double amount) {
		balance = balance+amount;
	}
	public double getBalance() {
		return balance;
	}
}

class Account1{
	private double balance;
	private String name;

	public Account1(String n) {
		balance=0.0;
		name=n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void credit(double amount) {
		balance = balance+amount;
	}
	
	public void print() {
		System.out.println("예금주 : "+name);
		System.out.println("잔액 : "+ balance);
	}
	
	public void addInterest(double interestRates) {
		interestRates*=balance;
		balance+=interestRates;
	}
}



public class ReportChapter04 {
	
	static void method1() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter deposit amout for account1: ");
		double init_bal1=scanner.nextDouble();
		Account account1=new Account(init_bal1);
		System.out.println("Account1 balance: "+account1.getBalance());
		
		System.out.print("Enter deposit amout for account2: ");
		double init_bal2=scanner.nextDouble();
		Account account2=new Account(init_bal2);
		System.out.println("Account2 balance: "+account2.getBalance());
		System.out.println();
	}
	static void method2() {
		Account1 account = new Account1("홍길동");
		account.credit(1000.0);
		account.print();
		
		account.addInterest(0.011);
		account.print();
		
		System.out.println();
	}
	static void method3() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1=scanner.nextInt();
		System.out.print("Enter second integer: ");
		int num2=scanner.nextInt();
		System.out.println();
		
		System.out.println("Sum is "+ (num1+num2));
		System.out.println("Product is "+ (num1*num2));
		System.out.println("Difference is "+ (num1-num2));
		System.out.println("Quotient is "+ (num1/num2));
	}
	
	public static void main(String [] args) {
		method1();
		method2();
		method3();
	}
}

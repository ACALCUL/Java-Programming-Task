import java.util.Scanner;
public class task3 {
	static void method1() {
		int n, sum=0, cnt=0;
		while(true) {
			System.out.print("Enter grade: ");
			Scanner scanner1= new Scanner(System.in);
			n=scanner1.nextInt();
			if(n<0) {
				//scanner1.close();
				break;
			}
			sum+=n;
			cnt+=1;
		}
		if(cnt==0)
			System.out.print("Since nothing has been entered, the program exits\n");
		else {
			System.out.printf("Total of %d student grades is %d\n", cnt, sum); 
			System.out.printf("Class average is %d\n", sum/cnt);
		}
	}
	static void method2() {
		int n;
		int gradecount[]= {0,0,0,0,0};
		char grade[] = {'A','B','C','D','F'};
		
		while(true) {
			System.out.print("Enter grade: ");
			Scanner scanner1= new Scanner(System.in);
			n=scanner1.nextInt();
			if(n<0) {
				//scanner1.close();
				//scanner를 닫아버리면 다음 메소드에서 사용을 못할 수도 있음
				break;
			}
			if(n>=90)
				gradecount[0]++;
			else if(n>=80)
				gradecount[1]++;
			else if(n>=70)
				gradecount[2]++;
			else if(n>=60)
				gradecount[3]++;
			else
				gradecount[4]++;
			//switch(grade/10)을 사용할 수도 있음
		}
		System.out.print("Number of students who received each grade:\n");
		for(int i=0; i<5; i++)
			System.out.printf("%c: %d\n", grade[i], gradecount[i]);
	}
	static void method3() {
		System.out.print("금액을 입력하시오 : ");
		Scanner scanner=new Scanner(System.in);

		int billcount[]= new int[7];
		String bill[] = {"오만원권", "만원권","천원권", "오백원", "백원","오십원", "십원"};
		int num[]= {50000, 10000, 1000, 500, 100, 50, 10};
		
		int n=scanner.nextInt();
		scanner.close();
		
		int cnt=0;
		for(int i=0; i<7; i++) {
			billcount[cnt++]=n/num[i];
			n%=num[i];
		}
		
		for(int i=0; i<7; i++) {
			if(billcount[i]==0)
				continue;
			System.out.printf("%s %d매\n", bill[i], billcount[i]);
		}
		
	}
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
}

import java.util.*;

public class Report_Chapter07_1 {
	public static void main(String [] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner scan= new Scanner(System.in);
		int n, num, con=0;
		do {
			System.out.println("1. ADD  2. REMOVE  3. PRINT POSITION  4.PRINT ALL  5. EXIT");
			System.out.print("실행동작: ");
			n=scan.nextInt();
			switch(n) {
				case 1:
					System.out.print("입력 값: ");
					num=scan.nextInt();
					if(a.contains(num));
					else {
						a.add(num);
					}
					break;
				case 2:
					System.out.print("삭제 값: ");
					num=scan.nextInt();
					for(int i=0; i<a.size(); i++) {
						Integer num2=a.get(i);
						if(num2.equals(num)) {
						//num2가 Integer, num1이 int일 때 equals로 비교 가능
						a.remove(i);
						}
					}
					break;
				case 3:
					System.out.print("검색 값: ");
					num=scan.nextInt();
					for(int i=0; i<a.size(); i++) {
						Integer num2=a.get(i);
						if(num2.equals(num)) {
							System.out.println(num+" 값은"+i+"번째에 위치");
						}
					}
					break;
				case 4:
					if(a.isEmpty());
					else {
						System.out.print("모든 값: ");
						for(int i=0; i<a.size(); i++) {
							Integer num2=a.get(i);
							System.out.print(" "+num2);
						}
						System.out.println("");
					}
			}
		}while(n!=5);
	}
}

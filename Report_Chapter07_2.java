import java.util.*;
public class Report_Chapter07_2 {
	public static void main(String [] args) {
		System.out.println("** 포인트 관리 프로그램입니다 **");
		HashMap<String, Integer> h= new HashMap<String, Integer>();
		Scanner scan=new Scanner(System.in);
		String s;
		int i;
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			s=scan.next();
			if(s.equals("exit"))break;
			i=scan.nextInt();
			
			
			if(h.containsKey(s))
				h.put(s, h.get(s)+i);
			
			else 
				h.put(s, i);
			
			
			Set<String> keys=h.keySet();
			for(String key: keys) {
				System.out.print("("+key+","+h.get(key)+")");
			}
			System.out.println("");
			
		}
		System.out.println("프로그램을 종료합니다...");
	}
}

//실습 1: FileReaderEx의 출력물에 라인 번호 추가
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		FileReader in = null;
		
		try {
			String src = "c:\\windows\\system.ini";
			Scanner scanner=new Scanner(new FileReader(src));
			int n = 0;
			while(scanner.hasNext()) {
				String line= scanner.nextLine();
				n++;
				System.out.printf("%2d: %s\n", n, line);
			}
	        scanner.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

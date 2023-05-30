import java.io.*;
import java.net.*;
import java.util.*;

public class Exercise2_Client {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter out = null;
		Scanner scanner = new Scanner(System.in);//ClientEx2에서 추가된 부분
		try {
			socket = new Socket("localhost", 9999);
			//ClientEx2에서 추가된 부분 시작
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			System.out.println("서버에 접속하였습니다...");
			while (true) {
				System.out.print("보낼 정수 입력>>");
				String outputMessage = scanner.nextLine();
				try {
					int n=Integer.parseInt(outputMessage);
					out.write(outputMessage+"\n");
					out.flush();
					if(n<0) {
						System.out.println("연결을 종료합니다.");
						break;
					}
				} catch(NumberFormatException e) {
					System.out.println("오류. 다시 입력...");
					continue;
				}
			}
			//ClientEx2에서 추가된 부분 끝
		} catch (IOException e) {}
		try {
			socket.close();
		} catch (Exception e) {}
	}

}

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter out = null;
		Scanner scanner = new Scanner(System.in);
		BufferedReader in = null; //ClientEx3에서 추가된 부분
		try {
			socket = new Socket("localhost", 9999);
			//----------------------
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//ClientEx3에서 추가된 부분
			while (true) {
				System.out.print("보내기>>");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					out.flush(); 
					System.out.println("프로그램 종료");
					break;
				}
				out.write(outputMessage+"\n");
				out.flush();
				//---------------------------받기 구현
				//ClientEx3에서 추가된 부분 시작
				String inputMessage = in.readLine();
				System.out.println("서버: " + inputMessage);
				//ClientEx3에서 추가된 부분 끝
			}
		} catch (IOException e) {}
		try {
			socket.close();
		} catch (Exception e) {}
	}

}

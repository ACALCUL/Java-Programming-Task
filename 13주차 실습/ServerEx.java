import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		BufferedReader in = null;
		
		BufferedWriter out = null;//ServerEx3에서 추가된 부분
		Scanner scanner = new Scanner(System.in);//ServerEx3에서 추가된 부분

		try {
			listener = new ServerSocket(9999);
			System.out.println("연결 기다림....");
			socket = listener.accept();
			System.out.println("연결 되었음.");
			//-------------
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //ServerEx3에서 추가된 부분
			while (true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 연결을 종료했음");
					break;
				}
				System.out.println("클라이언트: " + inputMessage);
				//----------------보내기 구현
				//ServerEx3에서 추가된 부분 시작
				System.out.print("보내기>>");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
				//ServerEx3에서 추가된 부분 끝
			}
		} catch (IOException e) {}
		try {
			listener.close();
			socket.close();
		} catch (Exception e) {}
	}

}

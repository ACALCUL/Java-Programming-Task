import java.io.*;
import java.net.*;

public class ServerEx3 {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		BufferedReader in = null;//ServerEx2에서 추가된 부분
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결 기다림....");
			socket = listener.accept();
			System.out.println("연결 되었음.");
			//ServerEx2에서 추가된 부분 시작
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String inputMessage = in.readLine();
				System.out.println("데이터 받기 성공");
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 연결을 종료했음");
					break;
				}
				System.out.println("클라이언트: " + inputMessage);
			}
			//Server Ex2에서 추가된 부분 끝
		} catch (IOException e) {}
		try {
			listener.close();
			socket.close();
		} catch (Exception e) {}
	}

}

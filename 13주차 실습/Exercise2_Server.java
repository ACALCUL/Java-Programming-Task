import java.io.*;
import java.net.*;

public class Exercise2_Server {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		BufferedReader in = null;//ServerEx2에서 추가된 부분
		try {
			listener = new ServerSocket(9999);
			System.out.println("서버입니다. 클라이언트를 기다립니다...");
			socket = listener.accept();
			System.out.println("연결 되었습니다.");
			int sum=0;
			//ServerEx2에서 추가된 부분 시작
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String inputMessage = in.readLine();
				//System.out.println("데이터 받기 성공");
				int n=Integer.parseInt(inputMessage);
				if(n<0) {
					System.out.println("서버를 종료합니다.");
					break;
				}
				sum+=n;
				System.out.println("누적합: " + sum);
			}
			//Server Ex2에서 추가된 부분 끝
		} catch (IOException e) {}
		try {
			listener.close();
			socket.close();
		} catch (Exception e) {}
	}

}

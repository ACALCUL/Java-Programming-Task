import java.io.*;
import java.util.ArrayList;

public class CreateSerFile {
	public static void main(String[] args) {
		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(new FileOutputStream("UserInfo.ser"));
			UserInfo u1 = new UserInfo("JavaqMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaqWonan", "4321", 20);
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			list.add(u1);
			list.add(u2);
			output.writeObject(list);
			output.close();
			System.out.println("직렬화 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

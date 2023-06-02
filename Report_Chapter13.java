import java.io.*;
import java.util.*;

class ContactBook implements Serializable{
	String Name;
	String Phone;
	String Email;
	public ContactBook(String Name, String Phone, String Email) {
		this.Name=Name;
		this.Phone=Phone;
		this.Email=Email;
	}
	public ContactBook() {
		this("Unknown Name", "Unknown Phone", "Unknown Email");
	}
	
	public String toString() {
		return "이름 : "+Name+" 전화번호 : "+Phone+" 이메일: "+Email;
	}//필요없지만 놔둠
	public void print() {
		System.out.println("이름 : "+Name);
		System.out.println("전화번호 : "+Phone);
		System.out.println("이메일 : "+Email);
	}
	
}

class CreateFile {
	ArrayList<ContactBook> list=new ArrayList<ContactBook>();
	
	public void openFile()
	{	
		ObjectInputStream input = null;
		try{
			input = new ObjectInputStream(new FileInputStream("report10.ser"));
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file.11");
		}
		
		try{
			if(input != null) {
				list = (ArrayList)input.readObject();
			}
			input.close();
		}
		catch(ClassNotFoundException classNotFoundException)
		{
			System.err.println("Unable to create object.");
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file.22");
		}
	}
	
	
	public void saveFile()
	{
		ObjectOutputStream output=null;
		try{
			output = new ObjectOutputStream(new FileOutputStream("report10.ser"));
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file.");
		}
		
		try{
			output.writeObject(list);
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file.");
		}
		catch(NoSuchElementException elementExcepition)
		{
			System.err.println("Invalid input. Please try again");
		}
		
		try{
			if(output != null)
				output.close();
		}
		catch(IOException ioException)
		{
			System.err.println("Error closing file.");
			System.exit(1);
		}
		
	}
}

public class Report_Chapter13 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CreateFile file= new CreateFile();
		file.saveFile();
		file.openFile();
		
		while(true) {
			System.out.println("1. 주소록 추가 / 2. 주소록 삭제 / 3. 주소록 출력 / 4. 주소록 저장 & 종료");
			int num=scanner.nextInt();
			switch(num){
			case 1://주소록 추가
				System.out.println("------------------------------------");
				String name, phone, email;
				System.out.print("이름을 입력하시오 : ");
				name= scanner.next();
				System.out.print("전화번호를 입력하시오(-를 제외하고) : ");
				phone= scanner.next();
				System.out.print("이메일을 입력하시오 : ");
				email= scanner.next();
				ContactBook con= new ContactBook(name, phone, email);
				file.list.add(con);
				break;
			case 2://주소록 삭제
				System.out.println("------------------------------------");
				int index;
				System.out.print("삭제할 주소록의 인덱스를 입력하시오. : ");
				index = scanner.nextInt();
				try {
				file.list.remove(index);
				} catch(Exception e) {
					System.out.println("잘못된 입력입니다 다시 입력하세요");
				}
				break;
			case 3://주소록 출력
				for(int i=0; i<file.list.size(); i++) {
					System.out.println("------------------------------------");
					System.out.println(i+"번 연락처");
					ContactBook mycon= file.list.get(i);
					System.out.println("이름 : "+mycon.Name);
					System.out.println("전화번호 : "+mycon.Phone);
					System.out.println("이메일 : "+mycon.Email);
				}
				break;
			case 4://주소록 저장& 종료
				file.saveFile();
				scanner.close();
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다 다시 입력하세요.");
			}
		}
	}
}

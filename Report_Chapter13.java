import java.io.*;
import java.util.*;

class ContactBook implements Serializable{
	ArrayList<Contact> list;
	public ContactBook(ArrayList<Contact> list) {
		this.list=list;
	}
	public ContactBook() {
		this(new ArrayList<Contact>());
	}
	void addContact(Contact con) {
		list.add(con);
	}
	void removeContact(int index) {
		list.remove(index);
	}
	int size() {
		return list.size();
	}
	Contact get(int index) {
		return list.get(index);
	}
}

class Contact implements Serializable{
	String Name;
	String Phone;
	String Email;
	public Contact(String Name, String Phone, String Email) {
		this.Name=Name;
		this.Phone=Phone;
		this.Email=Email;
	}
	public Contact() {
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
	ContactBook conbook;
	
	public CreateFile(ContactBook conbook) {
		this.conbook=conbook;
	}
	
	public void openFile()
	{	
		ObjectInputStream input = null;
		try{
			input = new ObjectInputStream(new FileInputStream("report13.ser"));
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file.11");
		}
		
		try{
			if(input != null) {
				conbook = (ContactBook)input.readObject();
				//System.out.println("openfile: "+conbook);
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
			output = new ObjectOutputStream(new FileOutputStream("report13.ser"));
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file.1");
		}
		
		try{
			//System.out.println("saveFile: "+conbook);
			output.writeObject(conbook);
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file.2");
			ioException.printStackTrace();
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
		/*
		 * File new_file = new File("report13.ser"); if (!new_file.exists()) try {
		 * new_file.createNewFile(); } catch(IOException e){
		 * System.err.println("Error creating file."); } else {
		 * System.out.println("새 파일 생성!"); }
		 */
		/*
		 * File file1=new File("report13.ser"); 
		 * file1.setWritable(true);
		 * file1.setReadable(true);
		 * 
		 * System.out.println(file1.canExecute()); 
		 * System.out.println(file1.canWrite());
		 * System.out.println(file1.canRead());
		 */
		
		Scanner scanner = new Scanner(System.in);
		ContactBook conbook= new ContactBook();
		CreateFile file= new CreateFile(conbook);
		//file.saveFile();
		//위의 코드는 맨 처음 코드를 실행할때만 필요 그 이후부터는 필요 X
		//그 이후에 사용하면 파일이 계속 초기화 됨
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
				Contact con= new Contact(name, phone, email);
				file.conbook.addContact(con);
				break;
			case 2://주소록 삭제
				System.out.println("------------------------------------");
				int index;
				System.out.print("삭제할 주소록의 인덱스를 입력하시오. : ");
				index = scanner.nextInt();
				try {
					file.conbook.removeContact(index);
				} catch(Exception e) {
					System.out.println("잘못된 입력입니다 다시 입력하세요");
				}
				break;
			case 3://주소록 출력
				for(int i=0; i<file.conbook.size(); i++) {
					System.out.println("------------------------------------");
					System.out.println(i+"번 연락처");
					con= file.conbook.get(i);
					System.out.println("이름 : "+con.Name);
					System.out.println("전화번호 : "+con.Phone);
					System.out.println("이메일 : "+con.Email);
				}
				break;
			case 4://주소록 저장& 종료
				file.saveFile();
				scanner.close();
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);
			default:
				System.out.println("잘못된 입력입니다 다시 입력하세요.");
			}
		}
	}
}

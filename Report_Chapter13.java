import java.io.*;
import java.util.*;

public class Report_Chapter13 {
	public class AdressBook implements Serializable{
		String Name;
		String Phone;
		String Email;
		public AdressBook(String Name, String Phone, String Email) {
			this.Name=Name;
			this.Phone=Phone;
			this.Email=Email;
		}
		public AdressBook() {
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
	
	public class CreateFile {
		public void openFile()
		{	
			ObjectInputStream input;
			try{
				input = new ObjectInputStream(new FileInputStream("report10.ser"));
			}
			catch(IOException ioException)
			{
				System.err.println("Error opening file.");
			}
			
			try{
				if(input != null)
					con = (ContactBook)input.readObject();
			}
			catch(ClassNotFoundException classNotFoundException)
			{
				System.err.println("Unable to create object.");
			}
			catch(IOException ioException)
			{
				System.err.println("Error opening file.");
			}
		}
		
		
		public void saveFile()
		{
			ObjectOutputStream output;
			try{
				output = new ObjectOutputStream(new FileOutputStream("report10.ser"));
			}
			catch(IOException ioException)
			{
				System.err.println("Error opening file.");
			}
			
			try{
				output.writeObject(con);
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
	
	public static void main(String[] args) {
		
	}
}

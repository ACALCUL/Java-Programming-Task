//2번문제는 이 패키지안에 따로 있음
class Animal{
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String bark() {
		return "동물울음소리";
	}
}

class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}//생성자를 항상 써줘야 함

	public String bark() {
		return "멍멍";
	}
}

public class Report_Chapter05_1 {
	public static void main(String [] args) {
		Dog d=new Dog("강아지");
		
		System.out.println("동물 : "+d.getName());
		System.out.println("울음소리 : "+d.bark());
	}
}

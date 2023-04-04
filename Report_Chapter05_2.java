class Music{
	String name;
	int year;
	Music(String name, int year){
		this.name=name;
		this.year=year;
	}
	public String toString() {
		return "Music [곡명="+name+", 연도="+year+"]";
	}
}

class Classic extends Music{
	String composer;
	Classic(String name, int year, String composer){
		super(name, year);
		//인자없는 기본 생성자 만들고 super.name=name해줘도 됨
		this.composer=composer;
	}
	public String toString() {
		return "Classic [곡명="+name+", 연도="+year+", 작곡가="+composer+"]";
	}
}

class Pop extends Music{
	String singer;
	Pop(String name, int year, String singer){
		super(name, year);
		//인자없는 기본 생성자 만들고 super.name=name해줘도 됨
		this.singer=singer;
	}
	public String toString() {
		return "Pop [곡명="+name+", 연도="+year+", 가수="+singer+"]";
	}
}

public class Report_Chapter05_2 {
	public static void main(String [] args) {
		Music m=new Music("흥부전", 1700);
		System.out.println(m.toString());
		
		Classic c=new Classic("운명", 1808, "베토벤");
		System.out.println(c.toString());
		
		Pop p=new Pop("보헤미안 랩소디", 1980, "퀸");
		System.out.println(p.toString());
	}
}

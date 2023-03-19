import java.util.Scanner;

public class Report_Chapter02 {
    public static void main(String[] args){
        method1();
        method2();
    }
    static void method1(){
        System.out.print("성적을 입력하시오: ");
        Scanner a = new Scanner(System.in);
        int score = a.nextInt();
        System.out.print("학점: ");
        if(score>=90){
            System.out.print("A");
        }
        else if(score>=80){
            System.out.print("B");
        }
        else if(score>=70){
            System.out.print("C");
        }
        else if(score>=60){
            System.out.print("D");
        }
        else{
            System.out.print("F");
        }  
        System.out.println("");      
    }
    static void method2(){
        System.out.print("일수를 알고 싶은 월을 입력하시오: ");
        Scanner b= new Scanner(System.in);
        int month = b.nextInt();
        b.close();
        System.out.print("월의 날수는: ");
        switch(month){
            case 2:
                System.out.print("28");
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.print("31");
                break;
            default:
                System.out.print("30");
        }
    }
}

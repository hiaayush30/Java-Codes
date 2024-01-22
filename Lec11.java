import java.util.Scanner;

public class Lec11 {
    public static void main(String[] args) {
        //Q1
        //float x=7/4*9/2;   //will give wrong value as operation between 2 ints will give int
        float x=7/4f*9/2f;
        System.out.println(x);
        //Q2
        char grade='B';
        //grade=grade+8;    //error as final resultant will be an integer
        grade=(char)(grade+8);
        System.out.println(grade);
        grade=(char)(grade-8);
        System.out.println(grade);
        //Q3
        System.out.println("The number is 54");
        int a=54;
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int b=scanner.nextInt();
        System.out.println(b>a);
        //Q5
        int yo=7;
        int ya=7*49/7+35/7;
        System.out.println(ya);
    }
}

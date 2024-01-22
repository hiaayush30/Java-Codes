import java.util.Scanner;
public class Lec6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Total marks of the subjects");
        float total=scanner.nextFloat();
        System.out.println("Enter the marks for the student in Subject 1");
        int a=scanner.nextInt();
        System.out.println("Enter the marks for the student in Subject 2");
        int b=scanner.nextInt();
        System.out.println("Enter the marks for the student in Subject 3");
        int c=scanner.nextInt();
        System.out.println("Enter the marks for the student in Subject 4");
        int d=scanner.nextInt();
        System.out.println("Enter the marks for the student in Subject 5");
        int e=scanner.nextInt();
        float percent=((a+b+c+d+e)/(total*5))*100;
        System.out.println("The Percentage of the student is : "+percent);

    }
}

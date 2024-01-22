import java.util.Scanner;

//Arrays
public class Lec26 {
    public static void main(String[] args) {
        //int[] marks=new int[5];
        int[] marks;
        marks=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i< marks.length;i++){
            System.out.println("Enter marks of student "+(i+1));
            marks[i]=scanner.nextInt();
        }
        for (int i=0;i< marks.length;i++){
            System.out.println("The marks of student "+(i+1)+" are "+marks[i]);
        }
        for (int j= marks.length-1;j>=0;j--)
            {
                System.out.println(marks[j]);
        }

    }
}

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class StarRecursive {
    static void printPattern(int n) {
        if (n > 0) {
            printStars(n);
            System.out.println(); // Move to the next line
            printPattern(n - 1);
        }
    }
    static void printStars(int count) {
        if (count > 0) {
            System.out.print("*");
            printStars(count - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printPattern(n);
        System.out.println("-----------------------------------");
        YOstars(n);
    }
    static void YOstars(int n){
        if (n>0){
            YOstars(n-1);
            for (int i=1;i<=n;i++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    //YOstars(3) will resolve into-
    //YOstars(2) + 3 times star + new line
    //    V
    //YOstars(1) + 2 times star + new line  + 3 times star + new line
    //    V
    //YOstars(0) + 1 times star + new line +  2 times star + new line  + 3 times star + new line
    //sabse pehle 1 times star and new line execute hoga and so on
    //YOstars(0 kuch nhi karega)


}
import java.util.Scanner;

public class Lec23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        for (int i=0;i<a;i++){
            System.out.println(2*i+1);
        }
    }
}

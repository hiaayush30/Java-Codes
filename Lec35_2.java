import java.util.Scanner;

public class Lec35_2 {
    static void prtstar(int num) {
        if (num<=0){
            return;
        }
        prtstar(num-1);
        for (int i=1;i<=num;i++){
            System.out.print("*");
        }
        System.out.println();
        //prtstar(num-1);           //For inverse star pattern
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        prtstar(num);
    }
}
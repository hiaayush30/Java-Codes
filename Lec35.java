import java.util.Scanner;

public class Lec35 {
//    static int sum(int n){
//        if (n==1){
//            return 1;
//        }
//        return n+sum(n-1);
//    }
    static void revstar(int r){
     for (int i=0;i<r;i++){
         for (int j=r;j>i;j--){
             System.out.print("*");
         }
         System.out.println();
     }
    }

//    static void printstar(int r){
//        if (r == 1) {
//            System.out.print("*\n");
//            return;
//        }
//        printstar(r-1);
//        for (int i=1;i<=2*r-1;i++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }

 static float avg(int ...arr){
        int sum=0;
        float count=0;
        for(int element: arr){
            sum +=element;
            count++;
        }
        return sum/count;
 }
    public static void main(String[] args) {
//        int c=fibo(6);
//        System.out.println(c);

        //Q2
        System.out.println("Enter the last term");
        Scanner scanner=new Scanner(System.in);
        int term=scanner.nextInt();

        System.out.println("The average is "+avg(4,5,9,12));
    }
}

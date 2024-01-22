import java.util.Scanner;

public class FibRecursive {
    static int fibo(int n){
//        if (n==1){
//            return 0;    //so the first term we have taken in the series is 0
//        }
//        else if (n==2){
//            return 1;
//        }
      //  we can write above code in short-
                if (n==2||n==1){
                    return n-1;
                }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Enter the term you want from the series");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int answer =fibo(n);
        System.out.println(answer+" is the answer!");
    }
}

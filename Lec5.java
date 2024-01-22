import  java.util.Scanner;
public class Lec5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number");
        float a=scanner.nextFloat();

//        boolean b1=scanner.hasNextFloat();         //hasNextInt checks whether the next input is float or not
//        System.out.println(b1);

        System.out.println("Enter Second Number");
        float b=scanner.nextFloat();
        float sum=a+b;
        System.out.println("The sum is "+sum);
        scanner.nextLine();    //consumes new line character left by .nextInt
        String str=scanner.nextLine();
        System.out.println(str);

    }
}

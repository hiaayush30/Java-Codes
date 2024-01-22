import java.util.Scanner;

public class Lec19 {
    public static void main(String[] args) {
        //Q2
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the marks of the student in subject 1(out of 100)");
//        int a=scanner.nextInt();
//        System.out.println("Enter the marks of the student in subject 2(out of 100)");
//        int b=scanner.nextInt();
//        System.out.println("Enter the marks of the student in subject 3(out of 100)");
//        int c=scanner.nextInt();
//        float percent=((a+b+c)/300.0f)*100.0f;
//        if (a>=33 && b>=33 && c>=33 && percent>=40){
//            System.out.println("The student has passed!");
//        }
//        else {
//            System.out.println("The student has failed!");
//        }

        //Q3
//        System.out.println("Enter your income (in lacs) below:");
//        float income=scanner.nextFloat();
//        if (income<2.5){
//            System.out.println("You do not have to pay any tax");
//        }
//        else if (income>=2.5 && income<5){
//            System.out.println("You will be charged 5%");
//            float tax=(income-2.5f)*5.0f/100;
//            System.out.println("You will have to pay "+tax+" lacs");
//        }
//        else if (income>=5 && income<10){
//            System.out.println("You will be charged 20%");
//            float tax= 2.5f*5/100+(income-5.0f)*20.0f/100;
//            System.out.println("You will have to pay "+tax+" lacs");
//        }
//        else if (income>=10){
//            System.out.println("You will be charged 30%");
//            float tax=2.5f*5/100+5.0f*20/100+(income-10.0f)*30/100;
//            System.out.println("You will have to pay "+tax+" lacs");
//        }

        //Q5
//        System.out.println("Enter the year");
//        int year=scanner.nextInt();
//        if (year%4==0 && year%100!=0 ){
//            System.out.println("It is a leap year");
//        }
//        else if (year%100==0 && year%400==0) {
//            System.out.println("It is a leap year");
//        }
//        else {
//            System.out.println("It is not a leap year");
//        }
//        scanner.nextLine();
        //Q6
        System.out.println("Enter the website name with address");
        String website=scanner.next();
        if (website.endsWith(".com")){                    //it will return boolean true
            System.out.println("It is a Commercial Website");
        }
        else if (website.endsWith(".org")){
            System.out.println("It is an Organization Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("It is an Indian Website");
        }
    }
}

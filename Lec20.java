import java.util.Random;
import java.util.Scanner;

public class Lec20 {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("Welcome to the game of Rock,Paper and Scissors!");
        int i=0;
        while(i<5) {
            int a = random.nextInt(3) + 1;     //1 to 3
            System.out.println("Enter 1 for Rock\nEnter 2 for Paper\nEnter 3 for Scissors");
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            System.out.println("The computer chose " + a);
            if (a == b) {
                System.out.println("You tied!");
            } else if (a == 1 && b == 2) {
                System.out.println("You Won!");
            } else if (a == 2 && b == 1) {
                System.out.println("You Lost!");
            } else if (a == 2 && b == 3) {
                System.out.println("You Won!");
            } else if (a == 3 && b == 2) {
                System.out.println("You Lost!");
            } else if (a == 3 && b == 1) {
                System.out.println("You Won!");
            } else if (a == 1 && b == 3) {
                System.out.println("You Lost!");
            }
            i++;
        }
        System.out.println("Thank You for playing this game!");
    }
}

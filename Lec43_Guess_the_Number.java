import java.util.Random;
import java.util.Scanner;

class Game{
    int compNum;
    int userNum;
    int tries=1;
    public void setUserNum(int num){
        userNum=num;
    }
    public void generateCompNum(){
        Random random=new Random();
        compNum=random.nextInt(100)+1;
    }
    public void setTries(){
        tries++;
    }
    public int getTries(){
        return tries;
    }
    public void isCorrectNumber(){
        if (compNum>userNum){
            System.out.println("Enter a bigger number!");
            setTries();
        }
        else if (compNum<userNum){
            System.out.println("Enter a smaller number!");
            setTries();
        }
        else {
            System.out.println("You guessed it right!");
            System.out.println("The number was "+compNum+" and you guessed it in "+getTries()+" attempts!");
        }
    }
}
public class Lec43_Guess_the_Number{
    public static void main(String[] args){
        System.out.println("Let's play the game: Guess the Number");
        Game g1=new Game();
        g1.generateCompNum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        while (g1.compNum!= g1.userNum){
            g1.setUserNum(sc.nextInt());
            g1.isCorrectNumber();
        }
        System.out.println("Thank you for playing this game!");


    }
}

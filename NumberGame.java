import java.util.Random;
import java.util.Scanner;
class GameYo{
    public int num1;
    public int num;
    public int numberOfGuesses;
    GameYo(){
        Random random=new Random();
        this.num=random.nextInt(99)+1;
    }
    public int getNumber(){
        return num;
    }
    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
    }
    public boolean isCorrectNumber(){
        if (num1==num){                 //can be written as return num1 == num;
            return true;
        }
        else if (num1>num){
            System.out.println("Enter a lower number");
        }
        else if (num1<num){
            System.out.println("Enter a higher number!");
        }
     return false;
    }
    public  void setGuesses(){
        numberOfGuesses++;
    }
    public  int getGuesses(){
        return numberOfGuesses;
    }
}
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game!");
        System.out.println("Enter a number");
        GameYo yo = new GameYo();
        yo.takeUserInput();
        while (true) {
            yo.setGuesses();
            if (yo.isCorrectNumber()) {
                System.out.println("Congratulations!,you guessed the number ie " + yo.getNumber() + " in " + yo.getGuesses() + " attempts!");
                System.out.println("To keep playing this game press 0 or press any other key to exit!");
                int exit=scanner.nextInt();
                if (exit==0){
                    System.out.println("Thank you for playing this game!");
                }
                break;
            }
            else {
                System.out.println("Guess the number!");
                yo.takeUserInput();
            }

        }
    }
}

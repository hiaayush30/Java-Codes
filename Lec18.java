//Enhanced Switch
public class Lec18 {
    public static void main(String[] args) {
        String i="Aayush";
        //In enhanced switch automatic break applied :)
        switch (i) {
            case "Aayush" -> {
                System.out.println("You chose 1");
                System.out.println("You are number 1!");
            }
            case "Shivam" -> System.out.println("You chose 2");
            case "Rushi" -> System.out.println("You chose 3");
            case "Naresh" -> System.out.println("You chose 4");
            case "Aman" -> System.out.println("You chose 5");
            default -> System.out.println("You chose None of the above");
        }
    }
}

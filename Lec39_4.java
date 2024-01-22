//Q5
class TommyVercetti{
    public void hitting(){
        System.out.println("Tommy is hitting!");
    }
    public void running(){
        System.out.println("Tommy is running!");
    }
    public void firing(){
        System.out.println("Tommy is firing!");
    }
}
public class Lec39_4 {
    public static void main(String[] args) {
     TommyVercetti tommy=new TommyVercetti();
     tommy.firing();
     tommy.running();
    }
}

class cellphone {
    public void ring() {
        System.out.println("The cellphone is ringing...ring!...ring!");
    }

    public void vibrate() {
        System.out.println("The cellphone is vibrating!");
    }
    public void explode () {
            System.out.println("The phone is exploding!");
    }

}
public class Lec39_2 {
    public static void main(String[] args) {
    cellphone phone=new cellphone();
    phone.explode();
    }
}


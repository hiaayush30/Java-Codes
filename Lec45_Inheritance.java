class Base{

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printme(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{    //Derived has all the methods,int,floats etc of Base along with it's own given below
    public Derived(){
        System.out.println("You just created an object of class-\"Derived\"");
    }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Lec45_Inheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());

        Derived d=new Derived();
        d.setX(10);
        System.out.println(d.getX());
        System.out.println(b.getX());
    }
}

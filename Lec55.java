
abstract class Yo1{
    abstract void greet();
    void great(){
        System.out.println("I am great!");
    }
}

abstract class Yo2 extends Yo1{
    abstract void greet2();
}
class Yo3 extends Yo2{
    String name;
    public Yo3(String name){
        this.name=name;
    };
    @Override
    void greet2() {
        System.out.println("Namaste "+this.name);
    }

    @Override
    void greet() {
        System.out.println("Ni Hao "+this.name);
    }
}
public class Lec55 {
    public static void main(String[] args) {
        Yo3 obj=new Yo3("Aayush");
        obj.greet2();
        obj.greet();
    }
}

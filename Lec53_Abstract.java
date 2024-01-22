import java.util.Arrays;

abstract class Base2{
    public Base2(){
    System.out.println("I am a constructor of Base2");
}
    public void sayHello(){
    System.out.println("(in Adele voice) Hello");
}
    abstract void greet();
}
class Derived2 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Morning!");
    }
}
public class Lec53_Abstract {
    public static void main(String[] args) {
         Derived2 obj=new Derived2();
         obj.greet();
    }
}

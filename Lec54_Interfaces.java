
interface BicycleSpeed{
    void currentSpeed(int incr,int decr);
}

interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void accelerate(int increment);
}
abstract class Yo{
    abstract public void greet();
}
class HeroCycle extends Yo implements Bicycle,BicycleSpeed{
    @Override
    public void applyBrake(int decrement){
        System.out.println("Decelerating the cycle by "+decrement);
    }
    @Override
    public void accelerate(int increment){
        System.out.println("Accelerating the cycle by "+increment);
    }
    @Override
    public void currentSpeed(int incr, int decr){
        System.out.println("The current speed of bicycle is "+(incr-decr));
    }
    @Override
   public void greet(){
        System.out.println("Hello");
    }
}
public class Lec54_Interfaces {
    public static void main(String[] args) {
        HeroCycle obj=new HeroCycle();
        obj.accelerate(5);
        obj.applyBrake(4);
        obj.currentSpeed(5,4);

        //You can create properties in interfaces
        System.out.println(obj.a);

        //but you can't modify the properties in interfaces as they are final
        //obj.a=88;

        obj.greet();
    }
}

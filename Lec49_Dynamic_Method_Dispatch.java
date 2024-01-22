//Dynamic Method Dispatch
class phone{
public void on(){
    System.out.println("Turning on phone");
}
public void showtime(){
    System.out.println("time is 8 am!");
}
}
class smartphone extends phone{
    public void music(){
        System.out.println("playing music!");
    }
    @Override
    public void on(){
        System.out.println("Turning on smartphone");
    }
}
public class Lec49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        phone obj=new phone();
//        smartphone sobj=new smartphone();
//        obj.non();
        phone obj=new smartphone();//obj has superclass 'phone' as it's reference while it is an object of the subclass 'smartphone'
       //superclass ka reference subclass ke object ke equal ho sakte hn but not vice versa
       // smartphone obj2=new phone();   //Cannot be done

        obj.showtime();
        obj.on();
        //obj.music();   //cannot be done
    }

}

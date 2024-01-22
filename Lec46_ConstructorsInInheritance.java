class Base1{
    Base1(){
        System.out.println("I am a constructor of class- Base1");
    }
    Base1(int a){
        System.out.println("I am an overloaded constructor with value of a as: "+a);
    }
    Base1(int a,int b){
        System.out.println("I am an overloaded constructor with value of a as: "+a+" and b as: "+b);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(0,0);       //will run the constructor with 2 argument with value of 0 and 0
        System.out.println("I am a constructor of class- Derived1");
    }
    Derived1(int x){
        super(x);       //will run the constructor with 1 argument with value of x
        System.out.println("I am a constructor of class- Derived1 with value of x as: "+x);
    }
    Derived1(int x,int y){
        super(x);       //will run the constructor with 1 argument with value of x
        System.out.println("I am a constructor of class- Derived1 with value of x as: "+x+" and value of y as : "+y);
    }
}
class ChildofDerived1 extends Derived1{
    ChildofDerived1(){
        System.out.println("I am a child of Derived1 Constructor");
    }
    ChildofDerived1(int x1,int y1,int z1){
        super(x1,y1);
        System.out.println("I am a child of Derived1 Constructor with value of x1,y1 and z1 as: "+x1+","+y1+" and "+z1);
    }
}
public class Lec46_ConstructorsInInheritance {
    public static void main(String[] args) {
          //Base1 b= new Base1();
          //Derived1 d=new Derived1();     //if no constructor of Derived1 then Base1 constructor invoked automat.
        //first Base1 class constructor is called then Derived1 class constructor called
        //Derived1 d=new Derived1(5);

        ChildofDerived1 d2=new ChildofDerived1(3,5,7);
    }
}

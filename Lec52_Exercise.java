class Circle{
    int radius;
    Circle(int radius){
        System.out.println("This is the constructor of Circle Class");
        this.radius=radius;
    }
    public void name(){
        System.out.println("the object created belongs to circle class");
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Cylinder1 extends Circle{
    int height;
    Cylinder1(int r,int h){
        super(r);
        System.out.println("This is the constructor of Cylinder1 Class");
        this.height=h;
    }
    public void name(){
        System.out.println("The object is of circle-Cylinder");
    }
    public double area(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class Lec52_Exercise {
    public static void main(String[] args) {
        Cylinder1 yo=new Cylinder1(5,10);
        yo.name();
        System.out.println("The volume of cylinder is "+yo.volume());

    }
}

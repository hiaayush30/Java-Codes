class Circle10{
    public Circle10(){
        System.out.println("I am the constructor of class Circle10");
    }
    public Circle10(int a){
        System.out.println("I am the constructor with parameters of class Circle10");
    }
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
       return Math.PI*radius*radius;
   }
}
class Cylinder10 extends Circle10{
    int height;

    public int getheight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public double area(){
        return (2*Math.PI*radius*radius)+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class Rough{
    public static void main(String[] args) {
      Cylinder10 c7=new Cylinder10();
      c7.setheight(10);
      c7.setRadius(5);
        System.out.println("The area of the cylinder is "+c7.area());
        System.out.println("The volume of the cylinder is "+c7.volume());

    }
}
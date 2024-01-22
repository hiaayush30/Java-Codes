class Cylinder{
     private int radius;
     private int height;
//   Q2
//    public Cylinder(int r, int h) {
//        this.radius = r;
//        this.height = h;
//    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
    public double getSurfaceArea(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }


}
public class Lec44 {
    public static void main(String[] args) {
        Cylinder cyl=new Cylinder();
        cyl.setHeight(12);
        cyl.setRadius(9);
        System.out.println(cyl.getHeight());
        System.out.println(cyl.getRadius());
        System.out.println("Volume is "+cyl.getVolume());
        System.out.println("The total surface area is "+cyl.getSurfaceArea());
    }
}

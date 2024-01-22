//Q4
class Rectangle{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle(int length) {
        this.length = length;
        this.breadth = 5;
    }
    public Rectangle() {
        this.length =  4;
        this.breadth = 5;
    }
}
public class Lec44_2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}

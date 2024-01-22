import java.util.Scanner;

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Lec39_3 {
    public static void main(String[] args) {
        System.out.println("Enter the side of the square");
        Scanner scanner=new Scanner(System.in);
        square sq=new square();
        sq.side=scanner.nextInt();
        int area=sq.area();
        System.out.println("The area of the square is "+area);
    }
}

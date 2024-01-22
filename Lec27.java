//for each loop
public class Lec27 {
    public static void main(String[] args) {
        int[] marks={5,6,7,8,9,10};
        System.out.println("Printing using For Each loop");
        for (int element:marks) {
            System.out.println(element);
            //here value like  i in marks[i] is not available
        }
    }
}

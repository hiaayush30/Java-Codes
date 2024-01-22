import com.sun.security.jgss.GSSUtil;

//Method overloading
public class Lec32 {
//    static void change(int x){
//        x=50;
//    }
    static void change(int[] arr){
        arr[0]=98;
    }
    public static void main(String[] args) {
     int[] yo={45,60,65,78,88,98};   //Array object is created where yo is a reference(stores address)
     //Case:1 Changing the integer
       // int x=45;
      // change(x);
     // System.out.println("The new value of x is "+x);

        //Case:2 Changing the array
        change(yo);
        System.out.println("The new value of yo[0] is "+yo[0]);
    }
}

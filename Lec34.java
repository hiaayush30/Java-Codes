public class Lec34 {
     int factorial(int a){
        if(a==1||a==0){
            return 1;
        }
        return a*factorial(a-1);
    }
    public static void main(String[] args) {
        Lec34 yo=new Lec34();
        int z=yo.factorial(5);
        System.out.println(z);
    }
}

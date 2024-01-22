//making method without static
public class Lec31_IMP {
int sum(int a,int b){
    int sum;
    sum=a+b;
    b=20;
    return sum;


    }
    public static void main(String[] args) {
        int a=7;
        int b=5;
        //Method invocation using object creation
        Lec31_IMP yo=new Lec31_IMP();
        int z= yo.sum(a,b);
        //now the sum method belongs to only this yo object
        System.out.println("The new value of b is "+b);
        //b nhi change hoga kyuki hum oject nhi pass kar rahe,hum object ke method ko arguments ki copy bhej rahe hn

//        int x=2;
//        int y=20;
//        int yo = sum(x,y);
        System.out.println(z);
       // System.out.println(yo);
    }
}

//Data types and assignment
public class Lec10 {
    public static void main(String[] args) {
//float a=54.5f + 6;
//        System.out.println(a);
        int i=56;
        int b;
        //System.out.println(i++);        //first use/print i then increment it
        //System.out.println(++i);          //first increment i then print/use it
        //b=i++;    //first i assigned to b then i incremented
        b=++i;
        System.out.println(b);
        int y=7;
        int x=++y*8;        //precedence f increment > *
        System.out.println(x);
        char ch='a';
        System.out.println(++ch);     //unicode of a +1=unicode of b

    }
}

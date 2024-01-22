class EkClass{
    int a;

    public int getA() {
        return a;
    }
    EkClass(int a){
      //a=a;     //is incorrect as it does not know which a
        this.a=a;       //this.a is the a inside EkClass(a which is the property of the object is referred to by "this")
    }
    public int returnone(){
        return 1;
    }

}
public class Lec47_This_and_Super {
    public static void main(String[] args) {
       EkClass e=new EkClass(5);
        System.out.println(e.getA());

    }
}

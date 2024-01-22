interface sampleInterface{
    void meth1();
    void meth2();
}
interface childInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childInterface{
    @Override
    public void meth1() {
        System.out.println("This is meth 1");
    }

    public void meth2() {
        System.out.println("This is meth 2");
    }

    public void meth3() {
        System.out.println("This is meth 3");
    }

    public void meth4() {
        System.out.println("This is meth 4 ");
    }
}
public class Lec58_Interfaces_Inheritence {
    public static void main(String[] args) {
        MySampleClass obj=new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}

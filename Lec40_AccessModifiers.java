class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class Lec40_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee Aayush=new MyEmployee();
//        Aayush.id=45;
//        Aayush.name="Batman";   //Throws an error due to private access modifier
        Aayush.setName("Batman");
        System.out.println(Aayush.getName());
    }
}

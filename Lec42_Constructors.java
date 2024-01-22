
class MyEmployee1{
    private int id;
    private String name;
    private int salary;
    public void setName(String n){
        this.name=n;
    }
    public void setSalary(int s){
        this.salary=s;
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
    public MyEmployee1(){     //Constructor=Method with same name as that of the class
        id=45;
        name="Your Name Here";
        salary=10000;

    }

        public MyEmployee1(String myName,int ID){     //Constructor=Method with same name as that of the class
        id=ID;
        name=myName;
    }
    public MyEmployee1(String myName){     //Constructor Overloading
        id=1;
        name=myName;
    }
}
public class Lec42_Constructors {
    public static void main(String[] args) {
        //Aayush.setName("Batman");
        MyEmployee1 Aayush=new MyEmployee1();
        System.out.println(Aayush.getName());   //Constructor automatically gets invoked
        System.out.println(Aayush.getId());
    }
}
